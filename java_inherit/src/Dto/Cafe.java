package Dto;

public class Cafe {
	
	private String cafeName;
	private String[] menu;
	
	public Cafe(String cafeName, String[] menu) {
		this.cafeName = cafeName;
		this.menu=menu;
		
	}
	//주문을 위한 메뉴 제공
	public void showMenu() {
		System.out.println("[ "+cafeName+" ] 메뉴판" );
		for(String m:menu) {
			System.out.println("ㅡ"+m);
		}
	}
}
