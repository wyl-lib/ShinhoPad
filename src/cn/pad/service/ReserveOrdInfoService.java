package cn.pad.service;

import java.sql.SQLException;
import java.util.List;

import cn.pad.entity.unique.ReserveOrdInfo;

public interface ReserveOrdInfoService {
	/**
	 * ��������ԤԼ��Ϣ
	 * @return
	 */
	List<ReserveOrdInfo> showAllReserve(int id);
	/**
	 * �ر�һ��ԤԼ��Ϣ
	 * @return
	 * @throws SQLException
	 */
	int closeReserve(int id);
}
