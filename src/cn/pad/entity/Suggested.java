package cn.pad.entity;
/**
 *建议反馈表
 */
public class Suggested {
	/**
	 * 建议反馈ID
	 */
	private int id;
	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * 问题类型
	 */
	private String question;
	/**
	 * 问题描述
	 */
	private String description;
	/**
	 * 创建时间datetime
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
