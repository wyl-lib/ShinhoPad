package cn.pad.entity;
/**
 * ��Ƶ���·����
 */
public class CfgVideoPath {
	/**
	 * ��Ƶ���·��ID
	 */
	private int id;
	/**
	 * ����λ��
	 */
	private int positionId;
	/**
	 * ��Ƶ·��
	 */
	private String vdoPath;
	/**
	 * ����·��
	 */
	private String phoPath;
	/**
	 * ���
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
