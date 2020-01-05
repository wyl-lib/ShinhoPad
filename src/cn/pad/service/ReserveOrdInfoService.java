package cn.pad.service;

import java.sql.SQLException;
import java.util.List;

import cn.pad.entity.unique.ReserveOrdInfo;

public interface ReserveOrdInfoService {
	/**
	 * 查找所有预约信息
	 * @return
	 */
	List<ReserveOrdInfo> showAllReserve(int id);
	/**
	 * 关闭一条预约信息
	 * @return
	 * @throws SQLException
	 */
	int closeReserve(int id);
}
