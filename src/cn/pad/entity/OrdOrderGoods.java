package cn.pad.entity;
/**
 * �����γ���Ϣ��
 */
public class OrdOrderGoods {
	/**
	 * �����γ���Ϣid
	 */
	private int id;
	/**
	 * ��������id
	 */
	private int courseDetailId;
	/**
	 * �γ�id
	 */
	private int courseId;
	/**
	 * ������
	 */
	private String writeOffcode;
	/**
	 * ԤԼId
	 */
	private int reserveId;
	/**
	 * �ſα�Id
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
