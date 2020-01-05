package cn.pad.entity;
/**
 * 实体类--角色表
 * @author 李林江
 *
 */
public class BasicRole {
	/**
	 * 角色id
	 */
	private int id;
	/**
	 * 角色名称name
	 */
	private String name;
	
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
	 * 是否系统运营账号   0 否 1 店长 2店员
	 */
	private int isSysAcct;
	
	//访问器
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getIsSysAcct() {
		return isSysAcct;
	}
	public void setIsSysAcct(int isSysAcct) {
		this.isSysAcct = isSysAcct;
	}
	
	
}
