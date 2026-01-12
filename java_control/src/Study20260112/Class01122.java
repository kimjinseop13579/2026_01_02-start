package Study20260112;

public class Class01122 {
	
	private String name;
	private String ID;
	private int cardNum;
	private int callNum;
	
	public Class01122(String name, String iD, int cardNum, int callNum) {
		this.name = name;
		this.ID = iD;
		this.cardNum = cardNum;
		this.callNum = callNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	public int getCallNum() {
		return callNum;
	}

	public void setCallNum(int callNum) {
		this.callNum = callNum;
	}

	@Override
	public String toString() {
		return "이름 : " + name + "\n아이디 ; " + ID +
				"\n카드번호 : " +cardNum + "\n전화번호 : " + callNum ;
	}
	
	
	
	
	

}
