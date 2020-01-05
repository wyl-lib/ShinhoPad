package cn.pad.service.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import cn.pad.dao.impl.ReserveOrdInfoDaoImpl;
import cn.pad.entity.unique.ReserveOrdInfo;
import cn.pad.service.ReserveOrdInfoService;
import cn.pad.util.DatabaseUtil;

public class ReserveOrdInfoServiceImpl implements ReserveOrdInfoService {

	private Connection conn = null;
	@Override
	public List<ReserveOrdInfo> showAllReserve(int id) {
		List<ReserveOrdInfo> rOrdInfos = new ArrayList<ReserveOrdInfo>();
		try {
			conn=DatabaseUtil.getConnection();
			rOrdInfos = new ReserveOrdInfoDaoImpl(conn).showAllReserve(id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeConnection(conn);
		}
		return rOrdInfos;
	}
	@Override
	public int closeReserve(int id) {
		int result = 0;
		try {
			conn = DatabaseUtil.getConnection();
			result = new ReserveOrdInfoDaoImpl(conn).closeReserve(id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DatabaseUtil.closeConnection(conn);
		}
		return result;
	}

}
