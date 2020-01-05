package cn.pad.entity;
/**
 *登录记录表
 */
public class LoginLog {
	/**
	 * 登录记录id
	 */
	private int id;
	/**
	 * 学员id
	 */
	private int userId;
	/**
	 * 登录日期datetime
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
