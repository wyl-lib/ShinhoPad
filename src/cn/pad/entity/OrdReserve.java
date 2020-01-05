package cn.pad.entity;
/**
 *预约表
 */
public class OrdReserve {
	/**
	 * 预约id
	 */
	private int id;
	/**
	 * 课程编号
	 */
	private int courseId;
	/**
	 * 门店编号
	 */
	private int storeId;
	/**
	 * 预约时间date
	 */
	private String date;
	/**
	 * 预约开始时间time
	 */
	private String beginTime;
	/**
	 * 预约结束时间time
	 */
	private String endTime;
	/**
	 * 排课时间date
	 */
	private String arrangementDate;
	/**
	 * 排课开始时间time
	 */
	private String orderBeginTime;
	/**
	 * 排课结束时间time
	 */
	private String orderEndTime;
	/**
	 * 订单编号
	 */
	private int orderId;
	/**
	 * 操作时间datetime
	 */
	private String operateTime;
	/**
	 * 预约方式
	 */
	private int orderType;
	/**
	 * 是否显示
	 */
	private int display;
	/**
	 * 核销时间date
	 */
	private String startTime;
	/**
	 * 课程状态
	 */
	private int state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
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
	public String getArrangementDate() {
		return arrangementDate;
	}
	public void setArrangementDate(String arrangementDate) {
		this.arrangementDate = arrangementDate;
	}
	public String getOrderBeginTime() {
		return orderBeginTime;
	}
	public void setOrderBeginTime(String orderBeginTime) {
		this.orderBeginTime = orderBeginTime;
	}
	public String getOrderEndTime() {
		return orderEndTime;
	}
	public void setOrderEndTime(String orderEndTime) {
		this.orderEndTime = orderEndTime;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
	public int getDisplay() {
		return display;
	}
	public void setDisplay(int display) {
		this.display = display;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}


}
