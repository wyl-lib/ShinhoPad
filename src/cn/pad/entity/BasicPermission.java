package cn.pad.entity;
/**
 * 实体表 --权限表
 * @author 李林江
 *
 */
public class BasicPermission {
	/**
	 * 权限id
	 */
	private int id;
	/**
	 * 权限编码
	 */
	private String code;
	/**
	 * 权限名称
	 */
	private String permissionName;
	/**
	 * 权限页面id
	 */
	private int pageId;
	
	//访问器
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
