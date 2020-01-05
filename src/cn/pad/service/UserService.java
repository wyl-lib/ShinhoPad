package cn.pad.service;

import cn.pad.entity.BasicUser;

public interface UserService {
	/**
	 * 查找数据库是否有此员工
	 */
	BasicUser findUser(String num);
	/**
	 * 修改用户最后一次登录时间
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int updateUserLastLgoinTime(int id);
}
