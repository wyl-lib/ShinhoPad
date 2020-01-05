package cn.pad.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.pad.dao.BaseDao;
import cn.pad.dao.UserDao;
import cn.pad.entity.BasicUser;

public class UserDaoImpl extends BaseDao implements UserDao {

		//用户储存用户
		BasicUser bu = null;
		//结果集
		ResultSet rs = null;
		String sql=null;
		//返回受影响
		int result=0;
		
	public UserDaoImpl(Connection conn) {
		super(conn);
	}

	@Override
	public BasicUser findUser(String num) throws Exception{
		sql = "SELECT `id`,`num`,`name`,`roleid`,`password`,`lastlogintime`,`enabled`,`storeid`  FROM `basic_user` WHERE `num`=?";
		try {
			rs = super.executeQuery(sql,num);
			if (rs.next()) {
				bu=new BasicUser();
				bu.setId(rs.getInt(1));
				bu.setNum(rs.getString(2));
				bu.setName(rs.getString(3));
				bu.setRoleId(rs.getInt(4));
				bu.setPassword(rs.getString(5));
				bu.setLastLoginTime(rs.getString(6));
				bu.setEnabled(rs.getInt(7));
				bu.setStoreId(rs.getInt(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeResource(rs);
			closeResource();
		}
		return bu;
	}

	@Override
	public int updateUserLastLgoinTime(int id) throws Exception {
		String sql="UPDATE `basic_user` SET `lastlogintime` = NOW() WHERE `id` =?";
		try {
			result=  super.executeUpdate(sql,id);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.closeResource();
		}
		return result;
	}

}
