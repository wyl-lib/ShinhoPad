package cn.pad.entity.unique;
/**
 * �ſ���Ϣ��
 * @author LJK
 *
 */
public class PlayClassInfo {
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
	 * ԤԼ��ʽ
	 */
	private int orderType;
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
	/**
	 * �ŵ�id
	 */
	private int storeId;
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	/**
	 * �γ�id
	 */
	private int courseId;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	/**
	 * �ֻ���
	 */
	private String phone;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * ������
	 */
	public String writeoffcode;
	public String getWriteoffcode() {
		return writeoffcode;
	}
	public void setWriteoffcode(String writeoffcode) {
		this.writeoffcode = writeoffcode;
	}
}
