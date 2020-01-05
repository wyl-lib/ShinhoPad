package cn.pad.dao;

import java.sql.SQLException;
import java.util.List;

import cn.pad.entity.unique.ReserveOrdInfo;

public interface ReserveOrdInfoDao {
	/**
	 * ��������ԤԼ��Ϣ
	 * @return
	 */
	List<ReserveOrdInfo> showAllReserve(int id) throws SQLException;
	
	/**
	 * �ر�һ��ԤԼ��Ϣ
	 * @return
	 * @throws SQLException
	 */
	int closeReserve(int id) throws SQLException;
	
}
