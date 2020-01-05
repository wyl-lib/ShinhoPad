package cn.pad.entity;
/**
 * 订单课程信息表
 */
public class OrdOrderGoods {
	/**
	 * 订单课程信息id
	 */
	private int id;
	/**
	 * 订单详情id
	 */
	private int courseDetailId;
	/**
	 * 课程id
	 */
	private int courseId;
	/**
	 * 核销码
	 */
	private String writeOffcode;
	/**
	 * 预约Id
	 */
	private int reserveId;
	/**
	 * 排课表Id
	 */
	private int courseTableId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCourseDetailId() {
		return courseDetailId;
	}
	public void setCourseDetailId(int courseDetailId) {
		this.courseDetailId = courseDetailId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getWriteOffcode() {
		return writeOffcode;
	}
	public void setWriteOffcode(String writeOffcode) {
		this.writeOffcode = writeOffcode;
	}
	public int getReserveId() {
		return reserveId;
	}
	public void setReserveId(int reserveId) {
		this.reserveId = reserveId;
	}
	public int getCourseTableId() {
		return courseTableId;
	}
	public void setCourseTableId(int courseTableId) {
		this.courseTableId = courseTableId;
	}
	
}
