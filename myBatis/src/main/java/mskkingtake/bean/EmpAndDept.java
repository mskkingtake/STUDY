package mskkingtake.bean;

import org.apache.ibatis.type.Alias;

@Alias("empAndDept")
public class EmpAndDept {
	private Integer id;
	private String name;
	private String sex;
	private String email;
	private String addr;
	private String deptId;
	private String deptName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

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
		sbf.append("id:").append(id).append("   ");
		sbf.append("name:").append(name).append("   ");
		sbf.append("sex:").append(sex).append("   ");
		sbf.append("email:").append(email).append("   ");
		sbf.append("addr:").append(addr).append("   ");
		sbf.append("deptId:").append(deptId).append("   ");
		sbf.append("deptName:").append(deptName).append("   ");
		System.out.println(sbf.toString());
	}
}
