package cn.pad.entity;
/**
 * �Ͽ�ʱ������
 * @author LJK
 *
 */
public class CourseTimeConfig {
	/**
	 * �Ͽ�ʱ������id
	 */
	private int id;
	/**
	 * ʱ���1��ʼ
	 */
	private String course1StartTime;
	/**
	 * ʱ���1����
	 */
	private String course1EndTime;
	/**
	 * ʱ���2��ʼ
	 */
	private String course2StartTime;
	/**
	 * ʱ���2����
	 */
	private String course2EndTime;
	/**
	 * ʱ���3��ʼ
	 */
	private String course3StartTime;
	/**
	 * ʱ���3����
	 */
	private String course3EndTime;
	/**
	 * ʱ���4��ʼ
	 */
	private String course4StartTime;
	/**
	 * ʱ���4����
	 */
	private String course4EndTime;
	/**
	 * ���Ͽ�����
	 */
	private int ClassAttendance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse1StartTime() {
		return course1StartTime;
	}
	public void setCourse1StartTime(String course1StartTime) {
		this.course1StartTime = course1StartTime;
	}
	public String getCourse1EndTime() {
		return course1EndTime;
	}
	public void setCourse1EndTime(String course1EndTime) {
		this.course1EndTime = course1EndTime;
	}
	public String getCourse2StartTime() {
		return course2StartTime;
	}
	public void setCourse2StartTime(String course2StartTime) {
		this.course2StartTime = course2StartTime;
	}
	public String getCourse2EndTime() {
		return course2EndTime;
	}
	public void setCourse2EndTime(String course2EndTime) {
		this.course2EndTime = course2EndTime;
	}
	public String getCourse3StartTime() {
		return course3StartTime;
	}
	public void setCourse3StartTime(String course3StartTime) {
		this.course3StartTime = course3StartTime;
	}
	public String getCourse3EndTime() {
		return course3EndTime;
	}
	public void setCourse3EndTime(String course3EndTime) {
		this.course3EndTime = course3EndTime;
	}
	public String getCourse4StartTime() {
		return course4StartTime;
	}
	public void setCourse4StartTime(String course4StartTime) {
		this.course4StartTime = course4StartTime;
	}
	public String getCourse4EndTime() {
		return course4EndTime;
	}
	public void setCourse4EndTime(String course4EndTime) {
		this.course4EndTime = course4EndTime;
	}
	public int getClassAttendance() {
		return ClassAttendance;
	}
	public void setClassAttendance(int classAttendance) {
		ClassAttendance = classAttendance;
	}
	
}
