package cn.pad.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.pad.entity.BasicUser;
import cn.pad.service.impl.UserServiceImpl;
import cn.pad.util.EmptyUtils;
import cn.pad.util.ImageUtil;
import cn.pad.util.ReturnResult;
import cn.pad.web.AbstractServlet;
@WebServlet(urlPatterns={"/UserLoginServlet"},name="UserLoginServlet")
public class UserServlet extends AbstractServlet { 
	@Override
	public Class getServletClass() {
		return UserServlet.class;
	}
	/**
	 * 登录
	 * @param request
	 * @param response
	 * @return
	 */
	public ReturnResult login(HttpServletRequest request,HttpServletResponse response) {
		//声明封装响应对象
		ReturnResult returnR = new ReturnResult();
		String vercode = request.getParameter("vercode");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		//实例用户模块业务逻辑层，获取登录用户信息
		BasicUser bUser = new UserServiceImpl().findUser(userName);
		if (!vercode.toUpperCase().equals(request.getSession().getAttribute("code"))) {
			returnR.returnFail("验证码不正确");
			return returnR;
		}
		if (EmptyUtils.isEmpty(bUser)) {
			returnR.returnFail("用户不存在！");
		}else{
			if (bUser.getPassword().equals(password)) {
				if (bUser.getEnabled()==1) { //用户是否可用
					if (bUser.getRoleId()==3) {
						//登录成功！将用户存入session
						request.getSession().setAttribute("loginUser", bUser);
						//修改最后一次登录时间
						new UserServiceImpl().updateUserLastLgoinTime(bUser.getId());
						System.out.println();
						returnR.returnSuccess("登录成功");
					}else {
						returnR.returnFail("该用户没有访问权限！");
					}
				}else {
					returnR.returnFail("该用户已被停用！");
				}
			}else {
				returnR.returnFail("密码错误！");
			}
		}
		return returnR;
	}
	public ReturnResult loginOut(HttpServletRequest request,HttpServletResponse response){
		//实例化封装响应对象
		ReturnResult resultR = new ReturnResult();
		HttpSession session = request.getSession();
		BasicUser bUser  = (BasicUser)session.getAttribute("loginUser");
		if (!EmptyUtils.isEmpty(bUser)) {
			session.removeAttribute("loginUser");
			resultR.returnSuccess();//退出成功
		}
		return resultR;
	}
	/**
	 * 获取图片验证码
	 * @param request
	 * @param response
	 * @return
	 */
	public ReturnResult code(HttpServletRequest request,HttpServletResponse response){
		//声明封装响应对象
		ReturnResult returnR = new ReturnResult();
		try {
			HttpSession session = request.getSession();//获取session
			ImageUtil iu = new ImageUtil();//生成验证码实例化帮助类
			int w=120,h=35;//定义图片宽高
			String code = iu.createImageWithVerifyCode(w,h,4,session);//获取生成图片的base64位码 
			code = "data:image/png;base64,"+code;
			returnR.returnSuccess(code);//返回码
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnR;
	}


}
