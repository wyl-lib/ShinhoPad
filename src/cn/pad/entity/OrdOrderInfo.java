package cn.pad.entity;
/**
 * ������Ϣ��
 */
public class OrdOrderInfo {
	/**
	 * ������Ϣid
	 */
	private int id;
	/**
	 * ������
	 */
	private String orderNum;
	/**
	 * ��������datetime
	 */
	private String payTime;
	/**
	 * ����״̬
	 */
	private int status;
	/**
	 * ֧����ʽ
	 */
	private String paymentWay;
	/**
	 * ֧������
	 */
	private String paymentOrderNum;
	/**
	 * �ܽ��
	 */
	private double totalAmount;
	/**
	 * ʵ�����
	 */
	private double payAmount;
	/**
	 * �û��˺�ID
	 */
	private int userId;
	/**
	 * �û��ȼ�
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
