package cn.pad.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import cn.pad.dao.BaseDao;
import cn.pad.dao.PlayClassDao;
import cn.pad.entity.CourseTimeConfig;
import cn.pad.entity.CurCourseTable;
import cn.pad.entity.unique.ClassCalendar;
import cn.pad.entity.unique.Data;
import cn.pad.entity.unique.PlayClassInfo;
import cn.pad.entity.unique.TeacherInfo;
import cn.pad.entity.unique.UpdateClass;

public class PlayClassDaoImpl extends BaseDao implements PlayClassDao {

	// 结果集
		ResultSet rs = null;
		// 返回受影响
		int result = 0;
	public PlayClassDaoImpl(Connection conn) {
		super(conn);
	}

	@Override
	public PlayClassInfo findById(int id) throws SQLException {
		String sql = "SELECT reserve.`id`, course.`coursename`, course.`id`, reserve.`date`, reserve.`begintime`, reserve.`endtime`, store.`storename`, store.`id`, student.`name`, student.`phone`, goods.`writeoffcode`, reserve.`ordertype` FROM `ord_order_goods` AS goods INNER JOIN `ord_reserve` AS reserve ON goods.`reserveid` = reserve.`id` INNER JOIN `cur_course` AS course ON goods.`courseid` = course.`id` INNER JOIN `basic_store` AS store ON reserve.`storeid` = store.`id` INNER JOIN `cur_course_details` AS details ON goods.`coursedetailid` = details.`id` INNER JOIN `ord_order_info` AS info ON details.`orderid` = info.`id` INNER JOIN `basic_student` AS student ON info.`userid` = student.`id` WHERE reserve.`state` = 0 AND reserve.`id` = ?";
		PlayClassInfo p = new PlayClassInfo();
		try {
			rs = executeQuery(sql, id);
			if (rs.next()) {
				p.setId(rs.getInt(1));
				p.setCourseName(rs.getString(2));
				p.setCourseId(rs.getInt(3));
				p.setDate(rs.getString(4));
				p.setBeginTime(rs.getString(5));
				p.setEndTime(rs.getString(6));
				p.setStoreName(rs.getString(7));
				p.setStoreId(rs.getInt(8));
				p.setName(rs.getString(9));
				p.setPhone(rs.getString(10));
				p.setWriteoffcode(rs.getString(11));
				p.setOrderType(rs.getInt(12));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			super.closeResource();
		}
		return p;
	}

	@Override
	public List<TeacherInfo> findAllTeachers(int id) throws SQLException {
		List<TeacherInfo> teachers= new ArrayList<TeacherInfo>();
		StringBuffer sb = new StringBuffer("SELECT teacher.`id`, teacher.`name` ");
		sb.append(" FROM `basic_teacher` AS teacher");
		sb.append(" WHERE teacher.`storeid`=(SELECT `ord_reserve`.`storeid` FROM `ord_reserve` WHERE `ord_reserve`.`id` =?)");
		sb.append(" AND teacher.`goodcategory`=	( ");
		sb.append(" SELECT `cur_course_type`.`classifyname` ");
		sb.append(" FROM `cur_course_type`");
		sb.append(" JOIN `cur_course` ON `cur_course_type`.`id` = `cur_course`.`coursetypeid`");
		sb.append(" JOIN `ord_reserve` ON `cur_course`.`id` = `ord_reserve`.`courseid`");
		sb.append(" WHERE `ord_reserve`.`id` =? )");
		sb.append(" AND teacher.`status`=1 ");
		String sql = sb.toString();
		TeacherInfo t = null;
		try {
			rs=super.executeQuery(sql,id,id);
			while (rs.next()) {
				t = new TeacherInfo();
				t.setId(rs.getInt(1));
				t.setName(rs.getString(2));
				teachers.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeResource(rs);
			closeResource();
		}
		return teachers;
	}

	@Override
	public CourseTimeConfig findTime() throws SQLException {
		CourseTimeConfig c = new CourseTimeConfig();
		String sql = "SELECT* FROM `course_time_config`";
		try {
			rs=super.executeQuery(sql);
			while (rs.next()) {
				c.setId(rs.getInt(1));
				c.setCourse1StartTime(rs.getString(2));
				c.setCourse1EndTime(rs.getString(3));
				c.setCourse2StartTime(rs.getString(4));
				c.setCourse2EndTime(rs.getString(5));
				c.setCourse3StartTime(rs.getString(6));
				c.setCourse3EndTime(rs.getString(7));
				c.setCourse4StartTime(rs.getString(8));
				c.setCourse4EndTime(rs.getString(9));
				c.setClassAttendance(rs.getInt(10));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeResource(rs);
			closeResource();
		}
		return c;
	}

	@Override
	public int updateReserve(UpdateClass u) throws SQLException{
		String sql = "update `ord_reserve` set `arrangementdate` = ?, `orderbegintime` = ?, `orderendtime` = ?, `operatetime` = ?, `ordertype` = ?, `state` = ? where `id` = ?";
		try {
			result=super.executeUpdate(sql, u.getPlayDate(),u.getClassTime(),u.getClassTimeEnd(),u.getShijian(),u.getOrderType(),1,u.getReserveId());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			closeResource();
		}
		return result;
	}

	@Override
	public int addPlayClass(UpdateClass u) throws SQLException {
		String sql = "insert into `cur_course_table` (`storeid`,`courseid`,`instructorid`,`userid`,`createtime`,`reservationdate`,`begintime`,`endtime`) values (?,?,?,?,?,?,?,?)";
		try {
			result=super.executeUpdate(sql,u.getStoreId(),u.getCourseId(),u.getTeachers(),u.getId(),u.getShijian(),u.getPlayDate(),u.getClassTime(),u.getClassTimeEnd());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			closeResource();
		}
		return result;
	}

	@Override
	public int updateCheck(String check, String date) throws SQLException {
		String sql = "UPDATE `ord_reserve` AS reserve,`ord_order_goods` AS goods SET `starttime`=?  WHERE reserve.`id`=goods.`reserveid` AND goods.`writeoffcode` = ?";
		try {
			result=super.executeUpdate(sql,date,check);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			closeResource();
		}
		return result;
	}

	@Override
	public List<ClassCalendar> findCalendar() throws SQLException {
		List<ClassCalendar> list=new ArrayList<ClassCalendar>();
		ClassCalendar c=null;
		String sql = "SELECT tb.`id`,course.`coursename`,tb.`reservationdate` FROM `cur_course_table` AS tb INNER JOIN `cur_course` AS course ON course.`id`=tb.`courseid`;";
		try {
			rs=super.executeQuery(sql);
			while (rs.next()) {
				c=new ClassCalendar();
				c.setId(rs.getInt(1));
				c.setTitle(rs.getString(2));
				c.setStart(rs.getString(3));
				c.setEnd(rs.getString(3));
				list.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeResource(rs);
			closeResource();
		}
		return list;
	}

	@Override
	public CurCourseTable countClass(UpdateClass u) throws SQLException {
		String sql = "SELECT * FROM `cur_course_table` WHERE `storeid`=? AND `courseid`=? AND `reservationdate` =? AND `begintime`=? AND `endtime` =?";
		CurCourseTable c = new CurCourseTable();
		try {
			rs = super.executeQuery(sql, u.getStoreId(),u.getCourseId(),u.getPlayDate(),u.getClassTime().substring(11,16),u.getClassTimeEnd().substring(11,16));
			if (rs.next()) {
				c.setId(rs.getInt(1));
				c.setStoreid(rs.getInt(2));
				c.setCourseid(rs.getInt(3));
				c.setInstructorid(rs.getInt(4));
				c.setUserid(rs.getInt(5));
				c.setCreateTime(rs.getString(6));
				c.setReservationDate(rs.getString(7));
				c.setBeginTime(rs.getString(8));
				c.setEndTime(rs.getString(9));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeResource(rs);
			closeResource();
		}
		return c;
	}

	@Override
	public int updateGoods(UpdateClass u,CurCourseTable c) {
		String sql = "UPDATE `ord_order_goods` SET `coursetableid`=? WHERE `reserveid` = ?";
		try {
			result = super.executeUpdate(sql, c.getId(),u.getReserveId());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeResource(rs);
			closeResource();
		}
		return result;
	}

}
