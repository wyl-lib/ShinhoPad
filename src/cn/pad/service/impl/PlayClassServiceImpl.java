package cn.pad.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.pad.dao.impl.PlayClassDaoImpl;
import cn.pad.entity.CourseTimeConfig;
import cn.pad.entity.CurCourseTable;
import cn.pad.entity.unique.ClassCalendar;
import cn.pad.entity.unique.Data;
import cn.pad.entity.unique.PlayClassInfo;
import cn.pad.entity.unique.TeacherInfo;
import cn.pad.entity.unique.UpdateClass;
import cn.pad.service.PlayClassService;
import cn.pad.util.DatabaseUtil;

public class PlayClassServiceImpl implements PlayClassService {
	private Connection conn = null;
	@Override
	public PlayClassInfo findById(int id)  {
		PlayClassInfo p = new PlayClassInfo();
		try {
			conn=DatabaseUtil.getConnection();
			p = new PlayClassDaoImpl(conn).findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeConnection(conn);
		}
		return p;
	}
	@Override
	public List<TeacherInfo> findAllTeachers(int id)  {
		List<TeacherInfo> teachers = new ArrayList<TeacherInfo>();
		try {
			conn=DatabaseUtil.getConnection();
			teachers = new PlayClassDaoImpl(conn).findAllTeachers(id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeConnection(conn);
		}
		return teachers;
	}
	@Override
	public CourseTimeConfig findTime() {
		CourseTimeConfig c = new CourseTimeConfig();
		try {
			conn=DatabaseUtil.getConnection();
			c = new PlayClassDaoImpl(conn).findTime();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeConnection(conn);
		}
		return c;
	}
	@Override
	public int updateReserve(UpdateClass u) {
		int result = 0;
		try {
			conn=DatabaseUtil.getConnection();
			result = new PlayClassDaoImpl(conn).updateReserve(u);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeConnection(conn);
		}
		return result;
	}
	@Override
	public int addPlayClass(UpdateClass u)  {
		int result = 0;
		try {
			conn=DatabaseUtil.getConnection();
			result = new PlayClassDaoImpl(conn).addPlayClass(u);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeConnection(conn);
		}
		return result;
	}
	@Override
	public int updateCheck(String check, String date){
		int result = 0;
		try {
			conn=DatabaseUtil.getConnection();
			result = new PlayClassDaoImpl(conn).updateCheck(check, date);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeConnection(conn);
		}
		return result;
	}
	@Override
	public List<ClassCalendar> findCalendar() {
		List<ClassCalendar> lc = new ArrayList<ClassCalendar>();
		try {
			conn=DatabaseUtil.getConnection();
			lc = new PlayClassDaoImpl(conn).findCalendar();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeConnection(conn);
		}
		return lc;
	}
	@Override
	public CurCourseTable countClass(UpdateClass u) {
		CurCourseTable c = new CurCourseTable();
		try {
			conn=DatabaseUtil.getConnection();
			c = new PlayClassDaoImpl(conn).countClass(u);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeConnection(conn);
		}
		return c;
	}
	@Override
	public int updateGoods(UpdateClass u, CurCourseTable c) {
		int result=0;
		try {
			conn=DatabaseUtil.getConnection();
			result = new PlayClassDaoImpl(conn).updateGoods(u, c);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeConnection(conn);
		}
		return result;
	}

}
