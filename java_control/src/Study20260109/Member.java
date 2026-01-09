package Study20260109;

public class Member {
	
	// 클래스 변수
	static String dept; //학과명
	
	// 인스턴스 변수
	String name;
	int age;
	String gender;
	int birthDate;
	
	Member(){}// 생산자 매서드
	//매개변수가 있는 생산자 매서드
	Member(String name, int age, String gender){// 그냥 변수이름만 적을 경우 지역변수가 가장 먼저 적용되기때문에
 //            ↑지역변수(매개변수)                       앞에 this 를 안넣어주면 매개변수에 매개변수를 넣어주는게됨
		                                         // 앞에 this. 을 넣어주면 인스턴스변수로 인식함
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	public String toString() {
		return "이름 : "+name+" 나이 :"+age+" 성별 :"+gender+
				" 생년월일 :"+ birthDate;
	}
}
		
		
	
/*
 * 제어자
 * static
 *     "공통의" 라는 뜻으로 사용되는 제어자이다.
 *     static 변수와 static 매서드가 있다.
 *      인스턴스 변수는 사용불가
 *     모든 객체가 공유해야 하는 데이터가 필요한 경우이거나
 *     클래스의 대표 데이터로 사용해야 하는경우
 *     다중 접속에의해 너무많은 생성을 방지하기 위해
 *     사용하는경우 
 *      
 *      static 은 "사용"
 *      public 은 "접근"
 *      을 위해 사용된다
 *      Member.dept = "컴퓨터공학과";
 *            ↑     ↑
 *      여기서 좌측 화살표 "."을 public 접근
 *      우측 화살표 "=" 을 사용 static 으로 생각해두면 편하다
 *       
 *       예시를 들어
 *       public class Member 라는 클래스가 있다
 *       그안에 static String dept; 라는 변수가 있다
 *       
 *       그러면 외부 클래스에서 Member.dept = "컴퓨터공학과";
 *       과 같은 식을 사용했을때 public은 Member 라는 클래스에 접근을 제어
 *       static은 dept 라는 변수를 가져가 사용할 권한을 쥐어준다
 *       
 *       
 *      
 * final
 *      "변경할수 없는" 이라는 뜻으로 사용되는 제어자이다.
 *      특정 데이터가 실수에 의해 변경 되지 않게 하고자 할때 사용
 *      개발과정에서 다른 팀원이 데이터변경 시키지 못하게 하기위한 용도
 *      
 *      
 *  접근 제어자
 *     권한 설정 하는거, 변수, 매서드, 클래스, 인터페이스 등에 사용된다.
 *     
 *      public
 *          "공공의" 라는 뜻 으로 사용되는 제어자
 *           
 *      default
 *          기본적으로 붙은 접근제어자
 *          같은 패키지 내에서만 사용이 가능함
 *          다른 패키지 에서 사용하고싶으면 앞에 public 을 붙여 사용해야함
 *          따로 적지않으면 기본적으로 모든 변수에 default 가붙어있기때문에 
 *          다른패키지에서 사용하려면 사용하고싶은 모든 변수앞에 
 *          public 붙여줘야함
 *         
 *      
 *      protected
 *           같은 패키지에서만 사용가능
 *           단, 상속 관계일경우는 사용가능
 *      
 *      private
 *          
 * 
 * abstract 
 *       추상화
 * 
 * 
 * 
	자바의 변수 종류
	인스턴스 변수 : 클래스의 맴버변수, 객체 생성시 존재하는 변수
	            객체 소멸시 같이 소멸되는 변수
	            
	            
 * 	지역변수 : 블럭 { } 영역에서 선언되는 변수
 *          for ( ) 소괄호 안에 선언되는 변수
 *          void sum(int a, int b) 메서드의 매개변수
 * 
 *  클래스 변수 : 클래스의 멤버변수, 프로그램 실행시 클래스 정의를 
 *            메모리(ram)에 로드(적재) 하면서 생성 
 *            클래스 변수가 소멸하는 시점은 프로그램 종료
 *            클래스 변수는 객체들이 공유 하는 변수 이다.
 *          
 */
	


