package Products2;

import Common2.Tree;

public class BeechTree extends Tree {
	public BeechTree(String name) {
		super(name);
	}
	
	public void tall() {
		System.out.println("높이 : 35m");
	}
	public void barkColor() {
		System.out.println("나무색 : 회백색");
	}
	public void life() {
		System.out.println("수명 : 900년");
	}

}
