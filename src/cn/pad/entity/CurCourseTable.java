package cn.pad.entity;
/**
 * 排课表
 * @author LJK
 *
 */
public class CurCourseTable {
	/**
	 * 排课id
	 */
	private int id;
	/**
	 * 门店id
	 */
	private int storeid;
	/**
	 * 课程id
	 */
	private int courseid;
	/**
	 * 讲师id
	 */
	private int instructorid;
	/**
	 * 排课人员
	 */
	private int userid;
	/**
	 * 排课时间
	 */
	private String createTime;
	/**
	 * 课程开始日期
	 */
	private String reservationDate;
	/**
	 * 课程开始时间
	 */
	private String beginTime;
	/**
	 * 课程结束时间
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
