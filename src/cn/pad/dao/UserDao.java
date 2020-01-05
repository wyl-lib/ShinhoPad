package cn.pad.dao;

import cn.pad.entity.BasicUser;

public interface UserDao{
	/**
	 * 根据工号查找员工
	 * @param num
	 * @return BasicUser
	 */
	BasicUser findUser(String num) throws Exception;
	/**
	 * 修改用户最后一次登录时间
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int updateUserLastLgoinTime(int id) throws Exception;
}
