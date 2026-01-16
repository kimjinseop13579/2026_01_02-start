package common;

public abstract class Fruit {

	protected String name;// 이름 색 맛
	
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public final void tree() {
		System.out.println(name+ " (이)가 나무에 자란다");
	}
	public final void taste() {
		System.out.println(name+" 는 단맛이 난다");
	}
	public abstract void color();
	
	
	
}
