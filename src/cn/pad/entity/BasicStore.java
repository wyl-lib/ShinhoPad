package cn.pad.entity;
/**
 * 实体类--门店表
 * @author DELL
 *
 */
public class BasicStore {
	/**
	 * 门店id
	 */
	private int id;
	/**
	 * 门店编号
	 */
	private String storeNum;
	/**
	 * 门店名称
	 */
	private String storeName;
	/**
	 * 门店类型
	 * H 欣和寒舍   S 水吧
	 */
	private String type;
	/**
	 * 店长id
	 */
	private int userId;
	/**
	 * 门店地址
	 */
	private String address;
	/**
	 * 图片的url
	 */
	private String picUrl;
	/**
	 * 门店简介
	 */
	private String summary;
	
	//访问器
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStoreNum() {
		return storeNum;
	}
	public void setStoreNum(String storeNum) {
		this.storeNum = storeNum;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
}
