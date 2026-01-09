package Study20260109;

public class MainMethod {
	
	
	int score = 50;
	// static 이 붙은 매서드에서는 인스턴스 변수나 인스턴스 매서드
	// 사용불가 - 생성되는 시점이 다름
	
	//인스턴스 매서드에서 static 변수나, static 매서드 사용가능

	public static void main(String[] args) {
		

		Member member = new Member();
		member.name = "김유신";
		member.age = 24;
		
		
		
		
		
		
		
		Member member2 = new Member("이순신" ,34, "남");
		
		//클래스 외부에서 클래스 변수에 데이터 자장 하는 방법
		Member.dept = "컴퓨터공학과";
		System.out.println(member.dept);
		
		System.out.println(member2);
		
		//상수

		final int num = 0;	
//		num = 20;
		
		// static
		
		
			
		}
	}


