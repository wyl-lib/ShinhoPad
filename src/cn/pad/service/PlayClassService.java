package cn.pad.service;

import java.sql.SQLException;
import java.util.List;

import cn.pad.entity.CourseTimeConfig;
import cn.pad.entity.CurCourseTable;
import cn.pad.entity.unique.ClassCalendar;
import cn.pad.entity.unique.Data;
import cn.pad.entity.unique.PlayClassInfo;
import cn.pad.entity.unique.TeacherInfo;
import cn.pad.entity.unique.UpdateClass;

public interface PlayClassService {
	/**
	 * 根据id查询预约信息，放入排课信息表单
	 * @return
	 * @throws SQLException
	 */
	PlayClassInfo findById(int id) throws SQLException;
	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	List<TeacherInfo> findAllTeachers(int id) throws SQLException;
	/**
	 * 查询排课时间段
	 * @return
	 */
	CourseTimeConfig findTime() throws SQLException;
	/**
	 * 预约排课后更新
	 * @param u
	 * @return
	 * @throws SQLException
	 */
	int updateReserve(UpdateClass u)throws SQLException;
	/**
	 * 排课后添加排课表
	 * @param u
	 * @return
	 * @throws SQLException
	 */
	int addPlayClass(UpdateClass u)throws SQLException;
	/**
	 * 订单课程信息表更新核销
	 */
	int updateCheck(String check,String date)throws SQLException;
	/**
	 * 查询排课表的信息
	 */
	List<ClassCalendar> findCalendar() throws SQLException;
	/**
	 * 是否有相同排课
	 */
	CurCourseTable countClass(UpdateClass u) throws SQLException;
	/**
	 *订单课程信息表更新
	 */
	int updateGoods(UpdateClass u,CurCourseTable c);
}
