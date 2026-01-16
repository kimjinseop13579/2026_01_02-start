package products;

import common.Fruit;

public class Orange extends Fruit {
	
	public Orange(String name) {
		super (name);
	}
	@Override
	public void color() {
		System.out.println(name+"(은)는 주황색이다");
	}

	
}
