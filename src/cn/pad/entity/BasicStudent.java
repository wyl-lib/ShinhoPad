package cn.pad.entity;
/**
 * 实体类--学员信息表
 */
public class BasicStudent {
	/**
	 * 学员信息id
	 */
	private int id;
	/**
	 * 用户姓名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 昵称
	 */
	private String nick;
	/**
	 * 微信付款id
	 */
	private String openId;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * 住址
	 */
	private String address;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 出生日期date
	 */
	private String birthday;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 照片
	 */
	private String picture;
	/**
	 * 注册时间datetime
	 */
	private String registerTime;
	/**
	 *注册渠道
	 */
	private String registerWay;
	/**
	 * 状态
	 */
	private int status;
	/**
	 * 最后登录时间datetime
	 */
	private String lastLoginTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	public String getRegisterWay() {
		return registerWay;
	}
	public void setRegisterWay(String registerWay) {
		this.registerWay = registerWay;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	
}
