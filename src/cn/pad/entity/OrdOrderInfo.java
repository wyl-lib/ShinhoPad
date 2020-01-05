package cn.pad.entity;
/**
 * 订单信息表
 */
public class OrdOrderInfo {
	/**
	 * 订单信息id
	 */
	private int id;
	/**
	 * 订单号
	 */
	private String orderNum;
	/**
	 * 订单日期datetime
	 */
	private String payTime;
	/**
	 * 订单状态
	 */
	private int status;
	/**
	 * 支付方式
	 */
	private String paymentWay;
	/**
	 * 支付单号
	 */
	private String paymentOrderNum;
	/**
	 * 总金额
	 */
	private double totalAmount;
	/**
	 * 实付金额
	 */
	private double payAmount;
	/**
	 * 用户账号ID
	 */
	private int userId;
	/**
	 * 用户等级
	 */
	private String userLevel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPaymentWay() {
		return paymentWay;
	}
	public void setPaymentWay(String paymentWay) {
		this.paymentWay = paymentWay;
	}
	public String getPaymentOrderNum() {
		return paymentOrderNum;
	}
	public void setPaymentOrderNum(String paymentOrderNum) {
		this.paymentOrderNum = paymentOrderNum;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	
}
