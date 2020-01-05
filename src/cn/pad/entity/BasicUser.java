package cn.pad.entity;
/**
 * 实体类--用户表
 * @author 李林江
 *
 */
public class BasicUser {
	/**
	 * 用户id
	 */
	private int id;
	
	/**
	 * 用户工号
	 */
	private String num;
	/**
	 * 用户姓名
	 */
	private String name;
	/**
	 * 角色id
	 */
	private int roleId;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 最后一次登录时间
	 */
	private String lastLoginTime;
	/**
	 * 是否可用  0否 1是
	 */
	private int enabled;
	/**
	 * 创建者
	 */
	private String creater;
	/**
	 * 创建时间 
	 * 精确到年月日时分秒
	 */
	private String createtime;
	/**
	 * 更新者
	 */
	private String updater;
	/**
	 * 更新时间 
	 * 精确到年月日时分秒
	 */
	private String updateTime;
	/**
	 * 所属门店id
	 */
	private int storeId;
	
	//访问器
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getUpdater() {
		return updater;
	}
	public void setUpdater(String updater) {
		this.updater = updater;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	
	
}
