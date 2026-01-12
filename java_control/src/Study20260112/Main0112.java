package Study20260112;

public class Main0112 {

	public static void main(String[] args) {
		//사용자 정보 저장 할수 있는 클래스 (  이름, 아이디, 비밀번호, 전화번호 )
		//상품정보 저장할수 있는 클래스 (  상품명,  상품 가격, 카테고리 , 수량)
		
		Class01122 class01 = new Class01122("이순신", "lees",3251, 787585);
		System.out.println(class01);
		
		Class0112 class02 = new Class0112("밀키스", 2000, "음료수", 20);
		System.out.println(class02);
		
	}

}
