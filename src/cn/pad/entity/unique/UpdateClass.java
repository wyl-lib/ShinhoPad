package cn.pad.entity.unique;

public class UpdateClass {
	/**
	 * Ա��id
	 */
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getTeachers() {
		return teachers;
	}
	public void setTeachers(int teachers) {
		this.teachers = teachers;
	}
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
	public String getPlayDate() {
		return playDate;
	}
	public void setPlayDate(String playDate) {
		this.playDate = playDate;
	}
	public String getClassTime() {
		return classTime;
	}
	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}
	public String getClassTimeEnd() {
		return classTimeEnd;
	}
	public void setClassTimeEnd(String classTimeEnd) {
		this.classTimeEnd = classTimeEnd;
	}
	public String getShijian() {
		return shijian;
	}
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	/**
	 * ѧԱ����
	 */
	private String name;
	/**
	 * ��������
	 */
	private String storeName;
	/**
	 * �γ�����
	 */
	private String courseName;
	/**
	 * ��ʦid
	 */
	private int teachers;
	/**
	 * ԤԼ��ʽ
	 */
	private int orderType;
	/**
	 * �ſ�����
	 */
	private String playDate;
	/**
	 * �ſο�ʼʱ��
	 */
	private String classTime;
	/**
	 * �ſν���ʱ��
	 */
	private String classTimeEnd;
	/**
	 * ����ʱ��
	 */
	private String shijian;
	/**
	 * ԤԼid
	 */
	private int reserveId;
	public int getReserveId() {
		return reserveId;
	}
	public void setReserveId(int reserveId) {
		this.reserveId = reserveId;
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
