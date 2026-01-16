package Products2;

import Common2.Tree;

public class BaobabTree extends Tree{
	
	public BaobabTree(String name) {
		super(name);
	}

	public void tall() {
		System.out.println("높이 : 20m");
	}
	public void barkColor() {
		System.out.println("나무 색 : 연갈색");
	}
	public void life() {
		System.out.println("수명 : 1000년");
	}
}
