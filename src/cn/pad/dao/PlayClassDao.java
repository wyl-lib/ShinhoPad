package cn.pad.dao;

import java.sql.SQLException;
import java.util.List;

import cn.pad.entity.CourseTimeConfig;
import cn.pad.entity.CurCourseTable;
import cn.pad.entity.unique.ClassCalendar;
import cn.pad.entity.unique.Data;
import cn.pad.entity.unique.PlayClassInfo;
import cn.pad.entity.unique.TeacherInfo;
import cn.pad.entity.unique.UpdateClass;

public interface PlayClassDao {
	/**
	 * ����id��ѯԤԼ��Ϣ�������ſ���Ϣ��
	 * @return
	 * @throws SQLException
	 */
	PlayClassInfo findById(int id) throws SQLException;
	/**
	 * ���ݵ�ǰԤԼ��Ϣ�����ŵ꣬�����γ̷��࣬����ѯ��ʦ
	 * @return
	 * @throws SQLException
	 */
	List<TeacherInfo> findAllTeachers(int id) throws SQLException;
	/**
	 * ��ѯ�ſ�ʱ���
	 * @return
	 */
	CourseTimeConfig findTime() throws SQLException;
	/**
	 * ԤԼ�ſκ����
	 * @param u
	 * @return
	 * @throws SQLException
	 */
	int updateReserve(UpdateClass u)throws SQLException;
	/**
	 * �ſκ�����ſα�
	 * @param u
	 * @return
	 * @throws SQLException
	 */
	int addPlayClass(UpdateClass u)throws SQLException;
	/**
	 * �����γ���Ϣ����º���
	 */
	int updateCheck(String check,String date)throws SQLException;
	/**
	 * �������ѯ
	 */
	List<ClassCalendar> findCalendar() throws SQLException;
	/**
	 * �Ƿ�����ͬ�ſ�
	 */
	CurCourseTable countClass(UpdateClass u) throws SQLException;
	/**
	 *�����γ���Ϣ�����
	 */
	int updateGoods(UpdateClass u,CurCourseTable c);
}
