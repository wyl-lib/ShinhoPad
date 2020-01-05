package cn.pad.entity;
/**
 * 实体类--课程表
 * @author 李林江
 *
 */
public class CurCourse {
	/**
	 * 课程id
	 */
	private int id;
	/**
	 * 课程分类ID
	 */
	private int courseTypeId;
	/**
	 * 课程名称
	 */
	private String courseName;
	/**
	 * 课程编号
	 */
	private String courseNum;
	/**
	 * 课程副标题
	 */
	private String description;
	/**
	 * 课程地址
	 */
	private String courseUrl;
	/**
	 * 图片地址
	 */
	private String picUrl;
	/**
	 * 课程内容
	 */
	private String courseContent;
	/**
	 * 课程等级
	 */
	private String courseLevel;
	/**
	 * 是否发布 0否 1是
	 */
	private int isPublic;
	/**
	 * 创建者
	 */
	private String creater;
	/**
	 * 创建时间 
	 * 精确到年月日时分秒
	 */
	private String createtime;
	/**
	 * 更新者
	 */
	private String updater;
	/**
	 * 更新时间 
	 * 精确到年月日时分秒
	 */
	private String updateTime;
	
	
	//以下为访问器
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCourseTypeId() {
		return courseTypeId;
	}
	public void setCourseTypeId(int courseTypeId) {
		this.courseTypeId = courseTypeId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCourseUrl() {
		return courseUrl;
	}
	public void setCourseUrl(String courseUrl) {
		this.courseUrl = courseUrl;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getCourseContent() {
		return courseContent;
	}
	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}
	public String getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(String courseLevel) {
		this.courseLevel = courseLevel;
	}
	public int getIsPublic() {
		return isPublic;
	}
	public void setIsPublic(int isPublic) {
		this.isPublic = isPublic;
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
	
	
	
	
}
