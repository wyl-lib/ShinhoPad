package cn.pad.service;

import cn.pad.entity.BasicUser;

public interface UserService {
	/**
	 * �������ݿ��Ƿ��д�Ա��
	 */
	BasicUser findUser(String num);
	/**
	 * �޸��û����һ�ε�¼ʱ��
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int updateUserLastLgoinTime(int id);
}
