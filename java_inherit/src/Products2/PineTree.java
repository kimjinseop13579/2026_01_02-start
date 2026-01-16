package Products2;

import Common2.Tree;

public class PineTree extends Tree {
	
	public PineTree(String name) {
		super (name);
	};
	
	@Override
	public void tall() {
		System.out.println("높이 : 25m");
	}
	public void barkColor() {
		System.out.println("나무 색 : 적갈색");
	}
	public void life() {
		System.out.println("수명 : 200년");
	}

}
