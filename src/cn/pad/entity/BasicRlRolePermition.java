package cn.pad.entity;
/**
 * ʵ����--��ɫȨ�޶�Ӧ��
 * @author DELL
 *
 */
public class BasicRlRolePermition {
	/**
	 * ��ɫȨ�޶�Ӧ��id
	 */
	private int id;
	/**
	 * ��ɫid
	 */
	private int roleId;
	/**
	 * Ȩ��id
	 */
	private int pomitionId;
	
	//������
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
