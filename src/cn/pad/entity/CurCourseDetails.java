package cn.pad.entity;
/**
 * 订单详情表
 */
public class CurCourseDetails {
	/**
	 * 订单详情id
	 */
	private int id;
	/**
	 * 订单id
	 */
	private int orderiId;
	/**
	 * 课程id
	 */
	private int courseId;
	/**
	 * 课程类型
	 */
	private int courseTypeId;
	/**
	 * 价格
	 */
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderiId() {
		return orderiId;
	}
	public void setOrderiId(int orderiId) {
		this.orderiId = orderiId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getCourseTypeId() {
		return courseTypeId;
	}
	public void setCourseTypeId(int courseTypeId) {
		this.courseTypeId = courseTypeId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
