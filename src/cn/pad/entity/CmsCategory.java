package cn.pad.entity;
/**
 * CMS�������
 * @author LJK
 *
 */
public class CmsCategory {
	/**
	 * CMS�������id
	 */
	private int id;
	/**
	 * ��������
	 */
	private String cmsTitle;
	/**
	 * ������
	 */
	private String cmsCode;
	/**
	 * ��������
	 */
	private int articleCount;
	/**
	 * ��ʽ����
	 */
	private String cmsType;
	/**
	 * �Ƿ񷢲�
	 */
	private boolean ispublished;
	/**
	 * ������
	 */
	private String creater;
	/**
	 * ����ʱ��
	 */
	private String createTime;
	/**
	 * ������
	 */
	private String updater;
	/**
	 * ����ʱ��
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
