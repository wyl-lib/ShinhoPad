package cn.pad.entity;
/**
 * 文章内容
 * @author LJK
 *
 */
public class CmsArticle {
	/**
	 * 文章内容id
	 */
	private int id;
	/**
	 * 分类id
	 */
	private int catid;
	/**
	 * 标题
	 */
	private String contTitle;
	/**
	 * 关键词
	 */
	private String contKeys;
	/**
	 * 描述
	 */
	private String contDesc;
	/**
	 * 封面图片URL
	 */
	private String contCoverUrl;
	/**
	 * 视频地址URL
	 */
	private String contVdoUrl;
	/**
	 * 内容
	 */
	private String contHtml;
	/**
	 * 位置
	 */
	private String position;
	/**
	 * 发布日期
	 */
	private String contPublicDate;
	/**
	 * 访问量
	 */
	private int accessCount;
	/**
	 * 平均停留时长
	 */
	private String timeOnsite;
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
	/**
	 * 等级
	 */
	private int contclsLevel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getContTitle() {
		return contTitle;
	}
	public void setContTitle(String contTitle) {
		this.contTitle = contTitle;
	}
	public String getContKeys() {
		return contKeys;
	}
	public void setContKeys(String contKeys) {
		this.contKeys = contKeys;
	}
	public String getContDesc() {
		return contDesc;
	}
	public void setContDesc(String contDesc) {
		this.contDesc = contDesc;
	}
	public String getContCoverUrl() {
		return contCoverUrl;
	}
	public void setContCoverUrl(String contCoverUrl) {
		this.contCoverUrl = contCoverUrl;
	}
	public String getContVdoUrl() {
		return contVdoUrl;
	}
	public void setContVdoUrl(String contVdoUrl) {
		this.contVdoUrl = contVdoUrl;
	}
	public String getContHtml() {
		return contHtml;
	}
	public void setContHtml(String contHtml) {
		this.contHtml = contHtml;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getContPublicDate() {
		return contPublicDate;
	}
	public void setContPublicDate(String contPublicDate) {
		this.contPublicDate = contPublicDate;
	}
	public int getAccessCount() {
		return accessCount;
	}
	public void setAccessCount(int accessCount) {
		this.accessCount = accessCount;
	}
	public String getTimeOnsite() {
		return timeOnsite;
	}
	public void setTimeOnsite(String timeOnsite) {
		this.timeOnsite = timeOnsite;
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
	public int getContclsLevel() {
		return contclsLevel;
	}
	public void setContclsLevel(int contclsLevel) {
		this.contclsLevel = contclsLevel;
	}
	
}	
