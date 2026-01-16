package products;

import common.Fruit;

public class Grape extends Fruit {
	
	public Grape(String name) {
		super (name);
	}
	@Override
	public void color() {
		System.out.println(name+" (은)는 보라색이다");
	}
	

}
