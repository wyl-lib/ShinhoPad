package cn.pad.entity;
/**
 * ʵ����--��ɫ��
 * @author ���ֽ�
 *
 */
public class BasicRole {
	/**
	 * ��ɫid
	 */
	private int id;
	/**
	 * ��ɫ����name
	 */
	private String name;
	
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
	 * �Ƿ�ϵͳ��Ӫ�˺�   0 �� 1 �곤 2��Ա
	 */
	private int isSysAcct;
	
	//������
	
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
