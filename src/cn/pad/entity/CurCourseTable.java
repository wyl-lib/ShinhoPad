package cn.pad.entity;
/**
 * �ſα�
 * @author LJK
 *
 */
public class CurCourseTable {
	/**
	 * �ſ�id
	 */
	private int id;
	/**
	 * �ŵ�id
	 */
	private int storeid;
	/**
	 * �γ�id
	 */
	private int courseid;
	/**
	 * ��ʦid
	 */
	private int instructorid;
	/**
	 * �ſ���Ա
	 */
	private int userid;
	/**
	 * �ſ�ʱ��
	 */
	private String createTime;
	/**
	 * �γ̿�ʼ����
	 */
	private String reservationDate;
	/**
	 * �γ̿�ʼʱ��
	 */
	private String beginTime;
	/**
	 * �γ̽���ʱ��
	 */
	private String endTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public int getInstructorid() {
		return instructorid;
	}
	public void setInstructorid(int instructorid) {
		this.instructorid = instructorid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
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
	
}
