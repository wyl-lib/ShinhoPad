package cn.pad.dao;

import cn.pad.entity.BasicUser;

public interface UserDao{
	/**
	 * ���ݹ��Ų���Ա��
	 * @param num
	 * @return BasicUser
	 */
	BasicUser findUser(String num) throws Exception;
	/**
	 * �޸��û����һ�ε�¼ʱ��
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int updateUserLastLgoinTime(int id) throws Exception;
}
