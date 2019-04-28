package mskkingtake.bean;

import org.apache.ibatis.type.Alias;

@Alias("deptpartment")
public class Deptpartment {
	private String deptId;
	private String deptName;

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void show() {
		StringBuffer sbf = new StringBuffer();
		sbf.append("deptId:").append(deptId).append("\n");
		sbf.append("deptName:").append(deptName).append("\n");

		System.out.println(sbf.toString());
	}
}
