package cn.pad.entity.unique;
/**
 * ԤԼ������Ϣ
 * @author LJK
 *
 */
public class ReserveOrdInfo {
	/**
	 * ԤԼid
	 */
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * ������
	 */
	private String orderNum;
	/**
	 * �γ�����
	 */
	private String courseName;
	/**
	 * ԤԼ����
	 */
	private String date;
	/**
	 * ԤԼ��ʼʱ��
	 */
	private String beginTime;
	/**
	 * ԤԼ����ʱ��
	 */
	private String endTime;
	/**
	 * ԤԼ�ص�
	 */
	private String storeName;
	/**
	 * ��ϵ��
	 */
	private String name;
	/**
	 * �ֻ���
	 */
	private String phone;
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
