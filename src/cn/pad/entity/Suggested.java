package cn.pad.entity;
/**
 *���鷴����
 */
public class Suggested {
	/**
	 * ���鷴��ID
	 */
	private int id;
	/**
	 * �ֻ���
	 */
	private String phone;
	/**
	 * ��������
	 */
	private String question;
	/**
	 * ��������
	 */
	private String description;
	/**
	 * ����ʱ��datetime
	 */
	private String createTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
}
