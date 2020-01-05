package cn.pad.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.pad.dao.BaseDao;
import cn.pad.dao.ReserveOrdInfoDao;
import cn.pad.entity.unique.ReserveOrdInfo;

public class ReserveOrdInfoDaoImpl extends BaseDao implements ReserveOrdInfoDao {

	// 结果集
	ResultSet rs = null;
	// 返回受影响
	int result = 0;
	
	public ReserveOrdInfoDaoImpl(Connection conn) {
		super(conn);
	}

	@Override
	/**
	 * 返回预约订单对象数组
	 */
	public List<ReserveOrdInfo> showAllReserve(int id) throws SQLException{
		List<ReserveOrdInfo> reserveOrdInfos = new ArrayList<ReserveOrdInfo>();
		String sql = "SELECT reserve.`id`, info.`ordernum`, course.`coursename`, reserve.`date`, reserve.`begintime`, reserve.`endtime`, store.`storename`, student.`name`, student.`phone` , buser.`id` FROM `ord_order_goods` AS goods INNER JOIN `ord_reserve` AS reserve ON goods.`reserveid` = reserve.`id` INNER JOIN `cur_course` AS course ON goods.`courseid` = course.`id` INNER JOIN `basic_store` AS store ON reserve.`storeid` = store.`id` INNER JOIN `basic_user` AS buser ON store.`userid` = buser.`id` INNER JOIN `cur_course_details` AS details ON goods.`coursedetailid` = details.`id` INNER JOIN `ord_order_info` AS info ON details.`orderid` = info.`id` INNER JOIN `basic_student` AS student ON info.`userid` = student.`id` WHERE reserve.`state` = 0 AND reserve.`display` = 0 AND store.`id` = (SELECT `storeid` FROM `basic_user` WHERE `id`=?) ORDER BY reserve.`begintime`";
		ReserveOrdInfo rOrdInfo = null;
		try {
			rs=super.executeQuery(sql,id);
			while (rs.next()) {
				rOrdInfo = new ReserveOrdInfo();
				rOrdInfo.setId(rs.getInt(1));
				rOrdInfo.setOrderNum(rs.getString(2));
				rOrdInfo.setCourseName(rs.getString(3));
				rOrdInfo.setDate(rs.getString(4));
				rOrdInfo.setBeginTime(rs.getString(5));
				rOrdInfo.setEndTime(rs.getString(6));
				rOrdInfo.setStoreName(rs.getString(7));
				rOrdInfo.setName(rs.getString(8));
				rOrdInfo.setPhone(rs.getString(9));
				reserveOrdInfos.add(rOrdInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeResource(rs);
			closeResource();
		}
		return reserveOrdInfos;
	}

	@Override
	public int closeReserve(int id) throws SQLException {
		String sql = "UPDATE `ord_reserve` SET `display` = 1 WHERE `id` =?";
		try {
			result = super.executeUpdate(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			super.closeResource();
		}
		return result;
	}


}
