package cn.pad.entity;
/**
 * 实体类--门店课程关系表
 * @author 李林江
 *
 */
public class CurRlStoreCourse {
	/**
	 * 门店课程关系id
	 */
	private int id;
	/**
	 * 课程id
	 */
	private int courseId;
	/**
	 * 门店id
	 */
	private int storeId;
	
	//访问器
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	
	
}
