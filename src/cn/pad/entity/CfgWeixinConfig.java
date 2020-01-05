package cn.pad.entity;
/**
 * 微信接口支付配置
 * @author LJK
 *
 */
public class CfgWeixinConfig {
	/**
	 * 微信接口支付配置id
	 */
	private int id;
	/**
	 * 微信App id
	 */
	private String appId;
	/**
	 * 机器码
	 */
	private String machineId;
	/**
	 * paternerkey
	 */
	private String paternerKey;
	/**
	 * notifyurl
	 */
	private String notifyUrl;
	/**
	 * 创建者
	 */
	private String creater;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 更新者
	 */
	private String updater;
	/**
	 * 更新时间
	 */
	private String updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getMachineId() {
		return machineId;
	}
	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}
	public String getPaternerKey() {
		return paternerKey;
	}
	public void setPaternerKey(String paternerKey) {
		this.paternerKey = paternerKey;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
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
