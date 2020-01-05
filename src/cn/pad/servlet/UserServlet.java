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
	 * ��¼
	 * @param request
	 * @param response
	 * @return
	 */
	public ReturnResult login(HttpServletRequest request,HttpServletResponse response) {
		//������װ��Ӧ����
		ReturnResult returnR = new ReturnResult();
		String vercode = request.getParameter("vercode");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		//ʵ���û�ģ��ҵ���߼��㣬��ȡ��¼�û���Ϣ
		BasicUser bUser = new UserServiceImpl().findUser(userName);
		if (!vercode.toUpperCase().equals(request.getSession().getAttribute("code"))) {
			returnR.returnFail("��֤�벻��ȷ");
			return returnR;
		}
		if (EmptyUtils.isEmpty(bUser)) {
			returnR.returnFail("�û������ڣ�");
		}else{
			if (bUser.getPassword().equals(password)) {
				if (bUser.getEnabled()==1) { //�û��Ƿ����
					if (bUser.getRoleId()==3) {
						//��¼�ɹ������û�����session
						request.getSession().setAttribute("loginUser", bUser);
						//�޸����һ�ε�¼ʱ��
						new UserServiceImpl().updateUserLastLgoinTime(bUser.getId());
						System.out.println();
						returnR.returnSuccess("��¼�ɹ�");
					}else {
						returnR.returnFail("���û�û�з���Ȩ�ޣ�");
					}
				}else {
					returnR.returnFail("���û��ѱ�ͣ�ã�");
				}
			}else {
				returnR.returnFail("�������");
			}
		}
		return returnR;
	}
	public ReturnResult loginOut(HttpServletRequest request,HttpServletResponse response){
		//ʵ������װ��Ӧ����
		ReturnResult resultR = new ReturnResult();
		HttpSession session = request.getSession();
		BasicUser bUser  = (BasicUser)session.getAttribute("loginUser");
		if (!EmptyUtils.isEmpty(bUser)) {
			session.removeAttribute("loginUser");
			resultR.returnSuccess();//�˳��ɹ�
		}
		return resultR;
	}
	/**
	 * ��ȡͼƬ��֤��
	 * @param request
	 * @param response
	 * @return
	 */
	public ReturnResult code(HttpServletRequest request,HttpServletResponse response){
		//������װ��Ӧ����
		ReturnResult returnR = new ReturnResult();
		try {
			HttpSession session = request.getSession();//��ȡsession
			ImageUtil iu = new ImageUtil();//������֤��ʵ����������
			int w=120,h=35;//����ͼƬ���
			String code = iu.createImageWithVerifyCode(w,h,4,session);//��ȡ����ͼƬ��base64λ�� 
			code = "data:image/png;base64,"+code;
			returnR.returnSuccess(code);//������
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnR;
	}


}
