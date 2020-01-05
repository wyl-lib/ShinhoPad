package cn.pad.dao;

import java.sql.SQLException;
import java.util.List;

import cn.pad.entity.unique.ReserveOrdInfo;

public interface ReserveOrdInfoDao {
	/**
	 * 查找所有预约信息
	 * @return
	 */
	List<ReserveOrdInfo> showAllReserve(int id) throws SQLException;
	
	/**
	 * 关闭一条预约信息
	 * @return
	 * @throws SQLException
	 */
	int closeReserve(int id) throws SQLException;
	
}
