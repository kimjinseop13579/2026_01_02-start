package Study20260108;

public class JavaClasses {

	public static void main(String[] args) {
		
//		User u = new User();
//		User u2 = new User();
//		User u3 = u;
//		
//		u.age = 30;
//		System.out.println(u.age);
//		u.name = "이순신";
//		u.job = "군인";
//		System.out.println(u.name);
//		System.out.println(u.job);
		
		
		// 책 이름, 저자, 출판년도를 저장할수있는 클래스의 정의
		// 객체를 생성하여 데이터를 넣고 출려하기
		
		Book user = new Book();
		user.Name = "노인과 바다";
		user.Author = "어니스트 헤미웨이";
		user.Yera = 1952;
		
		System.out.println("책 이름 : "+user.Name);
		System.out.println("책 저자 : "+user.Author);
		System.out.println("책 출판 년도 : "+user.Yera);
		
		
		

	}

}




class Book{
	String Name;
	String Author;
	int Yera;
}






//class User{ //User 라는 이름의 클래스 정의
//	int age;
//	String name;
//	String job;
//}


/*
 * 자바 클래스
 * 
 * 데이터 저장 방법 - 변수 , 배열 , 구조체, 클래스
 * 
 * 
 * 
 */
