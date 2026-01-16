package common;

public abstract class Appliance {//전자제품

	protected boolean onoff = false;// 전원여부
	//protected 패키지가 다르더라도 부모자식의 관계라면 사용할수있음
	protected String name ;// 제품명
	protected int powerCon; //소비전력

	protected Appliance() { }
	protected Appliance(String name, int powerCon) {
		this.name=name;
		this.powerCon=powerCon;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Appliance [onoff=" + onoff + ", name=" + name + ", powerCon=" + powerCon + "]";
	}
	//abstratct 추상메서드
	public abstract void power(); 
//		onoff = !onoff;
//
//		String res = onoff ? "켜짐" : "꺼짐";
//		// if 문을 줄인 형태의 조건 연산자로 물음표를 기준으로
//		// 물음표 앞에 식이 들어가고 그식이 참이면 콜론( : )
//		// 앞의 것을 출력 거짓이면 뒤의것을 출력함
//
//		System.out.println("전원" + res);
		//추상클래스를 가진 클래스는 반드시 추상클래스여야 한다.
		// 클래스에도 추상메서드를 넣어줘야함
	}

