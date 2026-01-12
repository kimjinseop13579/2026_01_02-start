package Study20260112;

public class BingoGame {

	
	//사용자명 , 레벨 , 승, 패, 무
	// 저장할수 있는 객체가 생성될수 있게 만들기
	
	//모등 인스턴스 변수는 private으로 
	// 생성자 매서드를 통해 사용자명, 레벨 승, 패, 무
	// 입력받을수있게 하기
	//출력 매서드 만들기
	
	private String name;
	private int level;
	private int win;
	private int lose;
	private int drow;
	
	public BingoGame(String name, int level,int win,int lose,int drow) {
		this.name=name;
		this.level=level;
		this.win=win;
		this.lose=lose;
		this.drow=drow;
	}
	public String toString() {
		return "이름 :"+name+"\n레벨 :"+level+" 레벨\n승리 :"+win+" 회\n패배 :"+lose+" 회"
				+ "\n무승부 :"+drow+"회";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		if (win<0) {
			System.out.println("잘못된값입니다");
			return;
		}
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getDrow() {
		return drow;
	}
	public void setDrow(int drow) {
		this.drow = drow;
	}
	
	//private 지정된 변수 사용법
	//private 접근제어자는 내부에서만 사용가능하기때문에
	//외부에서 사용되기 위해 변수들의 set, get매서드를 만들어 사용한다
	// get 메서드로 데이터를 출력 set 매서드로 데이터를 저장한다.
	
	
}
