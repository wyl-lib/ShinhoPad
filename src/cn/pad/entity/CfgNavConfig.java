package cn.pad.entity;
/**
 * 导航配置
 * @author LJK
 *
 */
public class CfgNavConfig {
	/**
	 * 导航配置id
	 */
	private int id;
	/**
	 * 图标URL
	 */
	private String iconUrl;
	/**
	 * 导航标题
	 */
	private String navTitle;
	/**
	 * 功能URL
	 */
	private String linkUrl;
	/**
	 * 顺序
	 */
	private int sort;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getNavTitle() {
		return navTitle;
	}
	public void setNavTitle(String navTitle) {
		this.navTitle = navTitle;
	}
	public String getLinkUrl() {
		return linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	
}
