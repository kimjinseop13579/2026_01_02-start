package Products2;

import Common2.Tree;

public class GiantSequoia extends Tree {
	public GiantSequoia(String name) {
		super(name);
	}
	
	@Override
	public void tall() {
		System.out.println("높이 : 70m");
	}
	public void barkColor() {
		System.out.println("나무 색 : 적갈색");
	}
	public void life() {
		System.out.println("수명 : 2~3000년");
	}

}
