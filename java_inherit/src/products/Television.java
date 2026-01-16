package products;

import common.Appliance;

public class Television extends Appliance{//TV
	
	public int sound;
	public int ch;
	
	//컴퓨터에게 거는 주석이라고 생각하면 됨
	@Override
	public void power() {
		onoff = !onoff;
		if(onoff)
			System.out.println("TV전원이 켜집니다");
		else
			System.out.println("TV전원이 꺼집니다");
	}
	
	
	
}


