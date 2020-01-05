package cn.pad.servlet;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.pad.entity.BasicUser;
import cn.pad.entity.unique.ReserveOrdInfo;
import cn.pad.service.impl.ReserveOrdInfoServiceImpl;
import cn.pad.util.EmptyUtils;
import cn.pad.util.ReturnResult;
import cn.pad.web.AbstractServlet;
@WebServlet(urlPatterns={"/ReserveOrdInfoServlet"},name="ReserveOrdInfoServlet")
public class ReserveOrdInfoServlet extends AbstractServlet {

	@Override
	public Class getServletClass() {
		return ReserveOrdInfoServlet.class;
	}

	
	public ReturnResult reserveInfo(HttpServletRequest request,HttpServletResponse response) {
		//������װ��Ӧ����
		ReturnResult returnR = new ReturnResult();
		BasicUser bUser =(BasicUser)request.getSession().getAttribute("loginUser");
		int id =bUser.getId();
		List<ReserveOrdInfo> rOrdInfos = new ReserveOrdInfoServiceImpl().showAllReserve(id);
		if (!EmptyUtils.isEmpty(rOrdInfos)) {
			returnR.returnSuccess(rOrdInfos);
		}else {
			returnR.returnFail("��ԤԼ��");
		}
		return returnR;
	}
	
	public ReturnResult closeReserve(HttpServletRequest request,HttpServletResponse response) {
		//������װ��Ӧ����
		ReturnResult returnR = new ReturnResult();
		int id =Integer.parseInt(request.getParameter("id")) ;
		int result = new ReserveOrdInfoServiceImpl().closeReserve(id);
		if(result>0){
			returnR.returnSuccess("ɾ���ɹ���");
		}else {
			returnR.returnFail("ɾ��ʧ��");
		}
		return returnR;
		
	}
}
