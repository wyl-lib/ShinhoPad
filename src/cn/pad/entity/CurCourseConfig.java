package cn.pad.entity;
/**
 * ʵ����--�γ����ñ�
 * @author ���ֽ�
 *
 */
public class CurCourseConfig {
	/**
	 * �γ�����id
	 */
	private int id;
	/**
	 * �γ����� 0���ڿ� 1�ײͿ�
	 */
	private int courseTypeId;
	/**
	 * �γ̼۸�
	 */
	private double coursePrice;
	/**
	 * �γ̻���
	 */
	private int coursePoints;
	/**
	 * �γ�λ��  
	 * 1.��ҳ�ֲ�
	 * 2.��ҳ�ö�1��λ
	 * 3.��ҳ�ö�2��λ
	 */
	private int slidePosition;
	/**
	 * �Ƿ񷢲� 0�� 1��
	 */
	private int isPublished;
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
	
	
	//������
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
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	public int getCoursePoints() {
		return coursePoints;
	}
	public void setCoursePoints(int coursePoints) {
		this.coursePoints = coursePoints;
	}
	public int getSlidePosition() {
		return slidePosition;
	}
	public void setSlidePosition(int slidePosition) {
		this.slidePosition = slidePosition;
	}
	public int getIsPublished() {
		return isPublished;
	}
	public void setIsPublished(int isPublished) {
		this.isPublished = isPublished;
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
