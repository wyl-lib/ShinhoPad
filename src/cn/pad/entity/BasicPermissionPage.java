package cn.pad.entity;
/**
 * 实体类--权限页面
 * @author 李林江
 *
 */
public class BasicPermissionPage {
	/**
	 * 权限页面id
	 */
	private int id;
	/**
	 * 页面名称
	 */
	private String pageName;
	
	//访问器
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	
}
