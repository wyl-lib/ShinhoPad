package cn.pad.entity;
/**
 * ʵ����--�γ̱�
 * @author ���ֽ�
 *
 */
public class CurCourse {
	/**
	 * �γ�id
	 */
	private int id;
	/**
	 * �γ̷���ID
	 */
	private int courseTypeId;
	/**
	 * �γ�����
	 */
	private String courseName;
	/**
	 * �γ̱��
	 */
	private String courseNum;
	/**
	 * �γ̸�����
	 */
	private String description;
	/**
	 * �γ̵�ַ
	 */
	private String courseUrl;
	/**
	 * ͼƬ��ַ
	 */
	private String picUrl;
	/**
	 * �γ�����
	 */
	private String courseContent;
	/**
	 * �γ̵ȼ�
	 */
	private String courseLevel;
	/**
	 * �Ƿ񷢲� 0�� 1��
	 */
	private int isPublic;
	/**
	 * ������
	 */
	private String creater;
	/**
	 * ����ʱ�� 
	 * ��ȷ��������ʱ����
	 */
	private String createtime;
	/**
	 * ������
	 */
	private String updater;
	/**
	 * ����ʱ�� 
	 * ��ȷ��������ʱ����
	 */
	private String updateTime;
	
	
	//����Ϊ������
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCourseTypeId() {
		return courseTypeId;
	}
	public void setCourseTypeId(int courseTypeId) {
		this.courseTypeId = courseTypeId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCourseUrl() {
		return courseUrl;
	}
	public void setCourseUrl(String courseUrl) {
		this.courseUrl = courseUrl;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getCourseContent() {
		return courseContent;
	}
	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}
	public String getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(String courseLevel) {
		this.courseLevel = courseLevel;
	}
	public int getIsPublic() {
		return isPublic;
	}
	public void setIsPublic(int isPublic) {
		this.isPublic = isPublic;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getUpdater() {
		return updater;
	}
	public void setUpdater(String updater) {
		this.updater = updater;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	
	
	
}
