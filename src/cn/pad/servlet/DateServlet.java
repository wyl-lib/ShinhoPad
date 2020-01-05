package cn.pad.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import cn.pad.entity.unique.ClassCalendar;
import cn.pad.entity.unique.Data;
import cn.pad.service.impl.PlayClassServiceImpl;


public class DateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		List<ClassCalendar> lc = new ArrayList<ClassCalendar>();
		lc = new PlayClassServiceImpl().findCalendar();
		JSONArray array = JSONArray.fromObject(lc);
		response.getWriter().print(array.toString());
		response.getWriter().flush();
		response.getWriter().close();
	}

}
