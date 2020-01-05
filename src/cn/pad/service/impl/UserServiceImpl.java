package cn.pad.service.impl;
import java.sql.Connection;


import cn.pad.dao.impl.UserDaoImpl;
import cn.pad.entity.BasicUser;
import cn.pad.service.UserService;
import cn.pad.util.DatabaseUtil;
import cn.pad.util.ReturnResult;

public class UserServiceImpl  implements UserService {

	private Connection conn = null;

	@Override
	public BasicUser findUser(String num) {
		BasicUser bu = new BasicUser();
		try {
			conn = DatabaseUtil.getConnection();
			bu = new UserDaoImpl(conn).findUser(num);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DatabaseUtil.closeConnection(conn);
		}
		return bu;
		}

	@Override
	public int updateUserLastLgoinTime(int id) {
		int result = 0;
		try {
			conn = DatabaseUtil.getConnection();
			result = new UserDaoImpl(conn).updateUserLastLgoinTime(id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DatabaseUtil.closeConnection(conn);
		}
		return result;
	}

}
