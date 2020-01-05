package cn.pad.entity;
/**
 * 视频存放路径表
 */
public class CfgVideoPath {
	/**
	 * 视频存放路径ID
	 */
	private int id;
	/**
	 * 放置位置
	 */
	private int positionId;
	/**
	 * 视频路径
	 */
	private String vdoPath;
	/**
	 * 封面路径
	 */
	private String phoPath;
	/**
	 * 序号
	 */
	private int ord;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPositionId() {
		return positionId;
	}
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	public String getVdoPath() {
		return vdoPath;
	}
	public void setVdoPath(String vdoPath) {
		this.vdoPath = vdoPath;
	}
	public String getPhoPath() {
		return phoPath;
	}
	public void setPhoPath(String phoPath) {
		this.phoPath = phoPath;
	}
	public int getOrd() {
		return ord;
	}
	public void setOrd(int ord) {
		this.ord = ord;
	}
	
}
