package cn.pad.entity;
/**
 *ԤԼ��
 */
public class OrdReserve {
	/**
	 * ԤԼid
	 */
	private int id;
	/**
	 * �γ̱��
	 */
	private int courseId;
	/**
	 * �ŵ���
	 */
	private int storeId;
	/**
	 * ԤԼʱ��date
	 */
	private String date;
	/**
	 * ԤԼ��ʼʱ��time
	 */
	private String beginTime;
	/**
	 * ԤԼ����ʱ��time
	 */
	private String endTime;
	/**
	 * �ſ�ʱ��date
	 */
	private String arrangementDate;
	/**
	 * �ſο�ʼʱ��time
	 */
	private String orderBeginTime;
	/**
	 * �ſν���ʱ��time
	 */
	private String orderEndTime;
	/**
	 * �������
	 */
	private int orderId;
	/**
	 * ����ʱ��datetime
	 */
	private String operateTime;
	/**
	 * ԤԼ��ʽ
	 */
	private int orderType;
	/**
	 * �Ƿ���ʾ
	 */
	private int display;
	/**
	 * ����ʱ��date
	 */
	private String startTime;
	/**
	 * �γ�״̬
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
