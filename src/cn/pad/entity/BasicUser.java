package cn.pad.entity;
/**
 * ʵ����--�û���
 * @author ���ֽ�
 *
 */
public class BasicUser {
	/**
	 * �û�id
	 */
	private int id;
	
	/**
	 * �û�����
	 */
	private String num;
	/**
	 * �û�����
	 */
	private String name;
	/**
	 * ��ɫid
	 */
	private int roleId;
	/**
	 * �û�����
	 */
	private String password;
	/**
	 * ���һ�ε�¼ʱ��
	 */
	private String lastLoginTime;
	/**
	 * �Ƿ����  0�� 1��
	 */
	private int enabled;
	/**
	 * ������
	 */
	private String creater;
	/**
	 * ����ʱ�� 
	 * ��ȷ��������ʱ����
	 */
	private String createtime;
	/**
	 * ������
	 */
	private String updater;
	/**
	 * ����ʱ�� 
	 * ��ȷ��������ʱ����
	 */
	private String updateTime;
	/**
	 * �����ŵ�id
	 */
	private int storeId;
	
	//������
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
