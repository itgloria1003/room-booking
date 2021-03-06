package tutorial.domain;

import javax.validation.constraints.Size;

public class GlUser {

	public GlUser() {
		super();
	}
	public GlUser(String userCode) {
		this.userCode = userCode;
	}

	@Size(max=20)
	private String userCode;
	
	private String userName;
	private String dept;
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
