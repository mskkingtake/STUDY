package mskkingtake.bean;

import java.io.Serializable;
import java.sql.Date;

public class Emp implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2020758031541214941L;
	
	private Integer id;
	private String name;
	private String sex;
	private String email;
	private String addr;
	private String dept;
	private Integer cost;
	private String mark;
	private Date updDate;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	public void show() {
		StringBuffer sbf = new StringBuffer();
		sbf.append("id:").append(id).append("   ");
		sbf.append("name:").append(name).append("   ");
		sbf.append("sex:").append(sex).append("   ");
		sbf.append("email:").append(email).append("   ");
		sbf.append("addr:").append(addr).append("   ");
		sbf.append("dept:").append(dept).append("   ");
		sbf.append("cost:").append(cost).append("   ");
		sbf.append("mark:").append(mark).append("   ");
		sbf.append("updDate:").append(updDate);
		System.out.println(sbf.toString());
	}
}
