package cn.pad.entity;
/**
 * 实体类--角色权限对应表
 * @author DELL
 *
 */
public class BasicRlRolePermition {
	/**
	 * 角色权限对应表id
	 */
	private int id;
	/**
	 * 角色id
	 */
	private int roleId;
	/**
	 * 权限id
	 */
	private int pomitionId;
	
	//访问器
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getPomitionId() {
		return pomitionId;
	}
	public void setPomitionId(int pomitionId) {
		this.pomitionId = pomitionId;
	}
	
}
