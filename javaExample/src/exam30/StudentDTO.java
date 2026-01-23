package exam30;

import java.sql.Date;
import java.util.Scanner;

public class StudentDTO {
	private int hakbuun;
	private String name; 
	private String ssn; 
	private String phone;
	private String address;
	private Date createdDate;
	
	public StudentDTO() {
		inputField();
	}
	//method
	public void inputField() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 : ");
		this.name = scanner.nextLine();
		System.out.print("전화번호 : ");
		this.ssn = scanner.nextLine();
		System.out.print("주민번호 : ");
		this.phone = scanner.nextLine();
		System.out.print("주소 : ");
		this.address = scanner.nextLine();
	}
	
	public int getHakbuun() {
		return hakbuun;
	}
	public void setHakbuun(int hakbuun) {
		this.hakbuun = hakbuun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
