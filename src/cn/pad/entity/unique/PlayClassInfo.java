package cn.pad.entity.unique;
/**
 * 排课信息表
 * @author LJK
 *
 */
public class PlayClassInfo {
	/**
	 * 预约id
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
	 * 课程名称
	 */
	private String courseName;
	/**
	 * 预约日期
	 */
	private String date;
	/**
	 * 预约开始时间
	 */
	private String beginTime;
	/**
	 * 预约结束时间
	 */
	private String endTime;
	/**
	 * 预约地点
	 */
	private String storeName;
	/**
	 * 联系人
	 */
	private String name;
	/**
	 * 预约方式
	 */
	private int orderType;
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
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
