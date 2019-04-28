package mskkingtake.bean;

import org.apache.ibatis.type.Alias;

@Alias("msk")
public class MskTest {
	private String id;
	private String name;
	private String addr;
	private String email;
	private String tel;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void show() {
		StringBuffer sbf = new StringBuffer();
		sbf.append("id:").append(id).append("\n");
		sbf.append("name:").append(name).append("\n");
		sbf.append("addr:").append(addr).append("\n");
		sbf.append("email:").append(email).append("\n");
		sbf.append("tel:").append(tel).append("\n");
		
		System.out.println(sbf.toString());
	}
}
