package cn.pad.entity;
/**
 * 实体类--课程配置表
 * @author 李林江
 *
 */
public class CurCourseConfig {
	/**
	 * 课程配置id
	 */
	private int id;
	/**
	 * 课程类型 0单节课 1套餐课
	 */
	private int courseTypeId;
	/**
	 * 课程价格
	 */
	private double coursePrice;
	/**
	 * 课程积分
	 */
	private int coursePoints;
	/**
	 * 课程位置  
	 * 1.首页轮播
	 * 2.首页置顶1号位
	 * 3.首页置顶2号位
	 */
	private int slidePosition;
	/**
	 * 是否发布 0否 1是
	 */
	private int isPublished;
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
	
	
	//访问器
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
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	public int getCoursePoints() {
		return coursePoints;
	}
	public void setCoursePoints(int coursePoints) {
		this.coursePoints = coursePoints;
	}
	public int getSlidePosition() {
		return slidePosition;
	}
	public void setSlidePosition(int slidePosition) {
		this.slidePosition = slidePosition;
	}
	public int getIsPublished() {
		return isPublished;
	}
	public void setIsPublished(int isPublished) {
		this.isPublished = isPublished;
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
