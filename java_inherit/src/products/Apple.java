package products;

import common.Fruit;

public class Apple extends Fruit {
	
	public Apple(String name) {
		super(name);
	}
	
	@Override
	public void color() {
		System.out.println(name+"(은)는 빨간색이다");
	}
	
	

}
