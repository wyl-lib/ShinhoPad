package cn.pad.servlet;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhenzi.sms.ZhenziSmsClient;

import cn.pad.entity.BasicUser;
import cn.pad.entity.CourseTimeConfig;
import cn.pad.entity.CurCourseTable;
import cn.pad.entity.unique.ClassCalendar;
import cn.pad.entity.unique.Data;
import cn.pad.entity.unique.PlayClassInfo;
import cn.pad.entity.unique.TeacherInfo;
import cn.pad.entity.unique.UpdateClass;
import cn.pad.service.impl.PlayClassServiceImpl;
import cn.pad.util.EmptyUtils;
import cn.pad.util.ReturnResult;
import cn.pad.web.AbstractServlet;

@WebServlet(urlPatterns={"/PlayClassServlet"},name="PlayClassServlet")
public class PlayClassServlet extends AbstractServlet {

	private static String apiUrl = "http://sms_developer.zhenzikj.com";
	private static String appId = "100211";
	private static String appSecret = "74d8d58e-9f03-4fa3-b17e-e317d672ccde";
	@Override
	public Class getServletClass() {
		return PlayClassServlet.class;
	}
	
	public ReturnResult reserveClass(HttpServletRequest request, HttpServletResponse response){
		ReturnResult returnR = new ReturnResult();
		int id =Integer.parseInt(request.getParameter("id")) ;
		PlayClassInfo p = new PlayClassServiceImpl().findById(id) ;
		System.out.println(id);
		if (!EmptyUtils.isEmpty(p)) {
			returnR.returnSuccess(p);
		}else {
			returnR.returnFail("信息异常！");
		}
		return returnR;
	}
	
	public ReturnResult chooseTeacher(HttpServletRequest request, HttpServletResponse response) {
		ReturnResult returnR = new ReturnResult();
		int id =Integer.parseInt(request.getParameter("id")) ;
		List<TeacherInfo> teachers = new PlayClassServiceImpl().findAllTeachers(id);
		if (!EmptyUtils.isEmpty(teachers)) {
			returnR.returnSuccess(teachers);
		}else {
			returnR.returnFail("信息异常！");
		}
		return returnR;
		
	}
	
	public ReturnResult PlayTime(HttpServletRequest request, HttpServletResponse response) {
		ReturnResult returnR = new ReturnResult();
		CourseTimeConfig c = new PlayClassServiceImpl().findTime();
		if (!EmptyUtils.isEmpty(c)) {
			returnR.returnSuccess(c);
		}else {
			returnR.returnFail("信息异常！");
		}
		return returnR;
		
	}
	
	public ReturnResult updateAdd(HttpServletRequest request, HttpServletResponse response) {
		ReturnResult returnR = new ReturnResult();
		
		UpdateClass u = new UpdateClass();
		BasicUser bUser =(BasicUser)request.getSession().getAttribute("loginUser");
		u.setId(bUser.getId());
		u.setClassTime(request.getParameter("classTime"));
		u.setClassTimeEnd(request.getParameter("classTimeEnd"));
		u.setCourseName(request.getParameter("courseName"));
		u.setName(request.getParameter("name"));
		u.setOrderType(Integer.parseInt(request.getParameter("orderType")));
		u.setPlayDate(request.getParameter("playDate"));
		u.setReserveId(Integer.parseInt(request.getParameter("id")));
		u.setShijian(request.getParameter("shijian"));
		u.setStoreName(request.getParameter("storeName"));
		u.setTeachers(Integer.parseInt(request.getParameter("teachers")));
		u.setStoreId(Integer.parseInt(request.getParameter("storeId")));
		u.setCourseId(Integer.parseInt(request.getParameter("courseId")));
		u.setPhone(request.getParameter("phone"));
		u.setWriteoffcode(request.getParameter("writeoffcode"));
		CurCourseTable c = new PlayClassServiceImpl().countClass(u);
		int result1 = 0;
		int result2 = 0;
		if (c.getId()!=0) {
			result1 = new PlayClassServiceImpl().updateGoods(u, c);
			result2 = 1;
		}else {
			result1 = new PlayClassServiceImpl().addPlayClass(u);
			CurCourseTable c1 = new PlayClassServiceImpl().countClass(u);
			result2 = new PlayClassServiceImpl().updateGoods(u, c1);
		}
		int result = new PlayClassServiceImpl().updateReserve(u);
		if (result>0&&result1>0&&result2>0) {
			//1.在这里做发送短信操作
			//2.if判断发送短信是否成功！
			//3.成功！返回success成功，失败！返回fail 排课成功，发送短信失败
			ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
			String phone = u.getPhone();
			StringBuffer sb = new StringBuffer("尊敬的臻焙课工坊用户您好：");
			sb.append("您预约的"+u.getCourseName()+"课程已为您排课，请在"+u.getClassTime()+"—"+u.getClassTimeEnd().substring(11,16)+"时间上课。您的核销码为："+u.getWriteoffcode());
			String jsonString =null;
			JSONObject json = null;
			try {
				jsonString = client.send(phone, sb.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
			json = JSONObject.parseObject(jsonString);
			if(json.getIntValue("code") != 0){
				System.out.println("duanxin发送失败");
				returnR.returnFail("排课成功，发送短信失败！");
			}else{
				returnR.returnSuccess("发送成功");
				System.out.println("duanxinOK");
			}
		}else {
			returnR.returnFail("操作失败");
		}
		return returnR;
		
		
		
	}
	
	public ReturnResult updateCheck(HttpServletRequest request, HttpServletResponse response){
		ReturnResult returnR = new ReturnResult();
		String check = request.getParameter("writeoffcode");
		String date = request.getParameter("date");
		int result = new PlayClassServiceImpl().updateCheck(check, date) ;
		if (result>0) {
			returnR.returnSuccess("验证成功！");
		}else {
			returnR.returnFail("验证失败！");
		}
		return returnR;
	}
	
	public ReturnResult classCalendar(HttpServletRequest request, HttpServletResponse response) {
		ReturnResult returnR = new ReturnResult();
		List<ClassCalendar> lc = new ArrayList<ClassCalendar>();
		lc = new PlayClassServiceImpl().findCalendar();
		if (!EmptyUtils.isEmpty(lc)) {
			returnR.returnSuccess(lc);
		}else {
			returnR.returnFail("信息异常！");
		}
		return returnR;
		
	}
	
}
