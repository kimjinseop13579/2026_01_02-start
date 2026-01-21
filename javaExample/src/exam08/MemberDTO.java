package exam08;

import java.sql.Date;

public class MemberDTO {
	private int no;
	private String id;
	private String passward;
	private String name;
	private String phone;
	private Date createdData;
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}
	public MemberDTO(int no, String id, String passward, String name, String phone, Date createdData) {
		this.no = no;
		this.id = id;
		this.passward = passward;
		this.name = name;
		this.phone = phone;
		this.createdData = createdData;
	}


	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getCreatedData() {
		return createdData;
	}
	public void setCreatedData(Date createdData) {
		this.createdData = createdData;
	}
	
	
}
