package cn.pad.entity;
/**
 * ��������
 * @author LJK
 *
 */
public class CfgNavConfig {
	/**
	 * ��������id
	 */
	private int id;
	/**
	 * ͼ��URL
	 */
	private String iconUrl;
	/**
	 * ��������
	 */
	private String navTitle;
	/**
	 * ����URL
	 */
	private String linkUrl;
	/**
	 * ˳��
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
