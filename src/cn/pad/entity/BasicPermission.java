package cn.pad.entity;
/**
 * ʵ��� --Ȩ�ޱ�
 * @author ���ֽ�
 *
 */
public class BasicPermission {
	/**
	 * Ȩ��id
	 */
	private int id;
	/**
	 * Ȩ�ޱ���
	 */
	private String code;
	/**
	 * Ȩ������
	 */
	private String permissionName;
	/**
	 * Ȩ��ҳ��id
	 */
	private int pageId;
	
	//������
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public int getPageId() {
		return pageId;
	}
	public void setPageId(int pageId) {
		this.pageId = pageId;
	}
	
	
}
