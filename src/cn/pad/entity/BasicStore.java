package cn.pad.entity;
/**
 * ʵ����--�ŵ��
 * @author DELL
 *
 */
public class BasicStore {
	/**
	 * �ŵ�id
	 */
	private int id;
	/**
	 * �ŵ���
	 */
	private String storeNum;
	/**
	 * �ŵ�����
	 */
	private String storeName;
	/**
	 * �ŵ�����
	 * H ���ͺ���   S ˮ��
	 */
	private String type;
	/**
	 * �곤id
	 */
	private int userId;
	/**
	 * �ŵ��ַ
	 */
	private String address;
	/**
	 * ͼƬ��url
	 */
	private String picUrl;
	/**
	 * �ŵ���
	 */
	private String summary;
	
	//������
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
