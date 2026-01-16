package products;

import common.Appliance;

public class Aircon extends Appliance{//에어컨
	
	public Aircon() {   }
	
	public Aircon(String name,int powerCon) {
		super(name,powerCon);  //super 는 부모클래스를 의미한다
		
		
	}
	@Override
	public void power() {
		onoff = !onoff;
		if(onoff) 
			System.out.println("냉방을 시작합니다");
		else 
			System.out.println("자동건조를 시작합니다");
		
		
	}
	
	
	

}
