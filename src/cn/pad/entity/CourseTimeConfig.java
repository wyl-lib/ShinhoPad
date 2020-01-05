package cn.pad.entity;
/**
 * 上课时间配置
 * @author LJK
 *
 */
public class CourseTimeConfig {
	/**
	 * 上课时间配置id
	 */
	private int id;
	/**
	 * 时间段1开始
	 */
	private String course1StartTime;
	/**
	 * 时间段1结束
	 */
	private String course1EndTime;
	/**
	 * 时间段2开始
	 */
	private String course2StartTime;
	/**
	 * 时间段2结束
	 */
	private String course2EndTime;
	/**
	 * 时间段3开始
	 */
	private String course3StartTime;
	/**
	 * 时间段3结束
	 */
	private String course3EndTime;
	/**
	 * 时间段4开始
	 */
	private String course4StartTime;
	/**
	 * 时间段4结束
	 */
	private String course4EndTime;
	/**
	 * 可上课人数
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
