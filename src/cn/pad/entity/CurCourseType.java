package cn.pad.entity;
/**
 * 实体类--课程分类表
 * @author 李林江
 * 
 */
public class CurCourseType {
	/**
	 * 分类id
	 */
	private int id;
	/**
	 * 课程分类名称
	 */
	private String classIfyName;
	/**
	 * 分类图标的存放路径
	 */
	private String iconUrl;
	
	/**
	 * 是否发布 0否 1是
	 */
	private int isPublished;
	
	/**
	 * 创建人id
	 */
	private int createId;
	/**
	 * 创建时间 精确到天数即可
	 */
	private String courteDate;
	
	//以下为访问器
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassIfyName() {
		return classIfyName;
	}
	public void setClassIfyName(String classIfyName) {
		this.classIfyName = classIfyName;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public int getIsPublished() {
		return isPublished;
	}
	public void setIsPublished(int isPublished) {
		this.isPublished = isPublished;
	}
	public int getCreateId() {
		return createId;
	}
	public void setCreateId(int createId) {
		this.createId = createId;
	}
	public String getCourteDate() {
		return courteDate;
	}
	public void setCourteDate(String courteDate) {
		this.courteDate = courteDate;
	}
	
	
}
