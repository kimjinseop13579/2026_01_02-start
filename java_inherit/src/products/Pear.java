package products;

import common.Fruit;

public class Pear extends Fruit {
	public Pear(String name) {
		super(name);
	}
	@Override
	public void color() {
		System.out.println(name+" (은)는 노란색이다");
	}

}
