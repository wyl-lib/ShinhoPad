package cn.pad.entity;
/**
 * ʵ����--�γ̷����
 * @author ���ֽ�
 * 
 */
public class CurCourseType {
	/**
	 * ����id
	 */
	private int id;
	/**
	 * �γ̷�������
	 */
	private String classIfyName;
	/**
	 * ����ͼ��Ĵ��·��
	 */
	private String iconUrl;
	
	/**
	 * �Ƿ񷢲� 0�� 1��
	 */
	private int isPublished;
	
	/**
	 * ������id
	 */
	private int createId;
	/**
	 * ����ʱ�� ��ȷ����������
	 */
	private String courteDate;
	
	//����Ϊ������
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassIfyName() {
		return classIfyName;
	}
	public void setClassIfyName(String classIfyName) {
		this.classIfyName = classIfyName;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public int getIsPublished() {
		return isPublished;
	}
	public void setIsPublished(int isPublished) {
		this.isPublished = isPublished;
	}
	public int getCreateId() {
		return createId;
	}
	public void setCreateId(int createId) {
		this.createId = createId;
	}
	public String getCourteDate() {
		return courteDate;
	}
	public void setCourteDate(String courteDate) {
		this.courteDate = courteDate;
	}
	
	
}
