package exam29;

public class Membership {
	
	private String userId;
	private String userPassword;
	private String userCallNum;
	private String userAddress;
	
	public Membership(String userId, String userPassword, String userCallNum, String userAddress) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userCallNum = userCallNum;
		this.userAddress = userAddress;
	}
	
	public void userImpormation() {
		System.out.println("유저 ID : "+userId+"\n전화번호 : "+userCallNum+"\n주소 : "+userAddress);
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserCallNum() {
		return userCallNum;
	}
	public void setUserCallNum(String userCallNum) {
		this.userCallNum = userCallNum;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	
	
	

}
