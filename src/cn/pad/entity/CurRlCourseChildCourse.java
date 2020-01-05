package cn.pad.entity;

/**
 * 实体类  套餐课配置表
 * @author 李林江
 *
 */
public class CurRlCourseChildCourse {
	/**
	 * 套餐课id  对应课程表中的套餐课
	 */
	private int packageId;
	/**
	 * 子课程id  对应课程表中的单节课
	 */
	private int  childCourseId;
	
	//访问器
	
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public int getChildCourseId() {
		return childCourseId;
	}
	public void setChildCourseId(int childCourseId) {
		this.childCourseId = childCourseId;
	}
	
	
}
