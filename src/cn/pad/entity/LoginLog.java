package cn.pad.entity;
/**
 *��¼��¼��
 */
public class LoginLog {
	/**
	 * ��¼��¼id
	 */
	private int id;
	/**
	 * ѧԱid
	 */
	private int userId;
	/**
	 * ��¼����datetime
	 */
	private String loginDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}
}
