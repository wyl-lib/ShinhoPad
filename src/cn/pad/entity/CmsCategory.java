package cn.pad.entity;
/**
 * CMS分类管理
 * @author LJK
 *
 */
public class CmsCategory {
	/**
	 * CMS分类管理id
	 */
	private int id;
	/**
	 * 分类名称
	 */
	private String cmsTitle;
	/**
	 * 分类编号
	 */
	private String cmsCode;
	/**
	 * 文章数量
	 */
	private int articleCount;
	/**
	 * 样式类型
	 */
	private String cmsType;
	/**
	 * 是否发布
	 */
	private boolean ispublished;
	/**
	 * 创建者
	 */
	private String creater;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 更新者
	 */
	private String updater;
	/**
	 * 更新时间
	 */
	private String updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCmsTitle() {
		return cmsTitle;
	}
	public void setCmsTitle(String cmsTitle) {
		this.cmsTitle = cmsTitle;
	}
	public String getCmsCode() {
		return cmsCode;
	}
	public void setCmsCode(String cmsCode) {
		this.cmsCode = cmsCode;
	}
	public int getArticleCount() {
		return articleCount;
	}
	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}
	public String getCmsType() {
		return cmsType;
	}
	public void setCmsType(String cmsType) {
		this.cmsType = cmsType;
	}
	public boolean isIspublished() {
		return ispublished;
	}
	public void setIspublished(boolean ispublished) {
		this.ispublished = ispublished;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
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
	
}
