package mskkingtake.bean;

import java.util.List;

public class DeptpartmentAndEmp {
	private String deptId;
	private String deptName;
	private List<EmpDept> empList;

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

	public List<EmpDept> getEmpList() {
		return empList;
	}

	public void setEmpList(List<EmpDept> empList) {
		this.empList = empList;
	}

	public void show() {
		StringBuffer sbf = new StringBuffer();
		sbf.append("deptId:").append(deptId).append("\n");
		sbf.append("deptName:").append(deptName).append("\n");
		for(EmpDept empDept : this.getEmpList()) {
			sbf.append("empName:").append(empDept.getName()).append("\n");
		}

		System.out.println(sbf.toString());
	}
}
