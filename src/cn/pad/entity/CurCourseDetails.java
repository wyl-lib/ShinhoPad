package cn.pad.entity;
/**
 * ���������
 */
public class CurCourseDetails {
	/**
	 * ��������id
	 */
	private int id;
	/**
	 * ����id
	 */
	private int orderiId;
	/**
	 * �γ�id
	 */
	private int courseId;
	/**
	 * �γ�����
	 */
	private int courseTypeId;
	/**
	 * �۸�
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
