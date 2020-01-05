package cn.pad.entity.unique;
/**
 * 预约订单信息
 * @author LJK
 *
 */
public class ReserveOrdInfo {
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
	/**
	 * 订单号
	 */
	private String orderNum;
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
	 * 手机号
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
