package cn.pad.entity.unique;

public class UpdateClass {
	/**
	 * 员工id
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
	 * 学员姓名
	 */
	private String name;
	/**
	 * 店铺名称
	 */
	private String storeName;
	/**
	 * 课程名称
	 */
	private String courseName;
	/**
	 * 讲师id
	 */
	private int teachers;
	/**
	 * 预约方式
	 */
	private int orderType;
	/**
	 * 排课日期
	 */
	private String playDate;
	/**
	 * 排课开始时间
	 */
	private String classTime;
	/**
	 * 排课结束时间
	 */
	private String classTimeEnd;
	/**
	 * 操作时间
	 */
	private String shijian;
	/**
	 * 预约id
	 */
	private int reserveId;
	public int getReserveId() {
		return reserveId;
	}
	public void setReserveId(int reserveId) {
		this.reserveId = reserveId;
	}
	/**
	 * 门店id
	 */
	private int storeId;
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	/**
	 * 课程id
	 */
	private int courseId;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	/**
	 * 手机号
	 */
	private String phone;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 核销码
	 */
	public String writeoffcode;
	public String getWriteoffcode() {
		return writeoffcode;
	}
	public void setWriteoffcode(String writeoffcode) {
		this.writeoffcode = writeoffcode;
	}
}
