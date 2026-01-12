 package Study20260112;

public class Student {

	static String schoolName; // 클래스 변수

	public String name; // 인스턴스
	public String age; // 인스턴스
	private int tall; // 인스턴스 변수 private는 private 변수를 사용한 클래스 내에서만 사용가능
	private int grade = 100; // 인스턴스 명시적 초기화
	
	{//인스턴스 초기화 블럭을 이용한 변수 초기화
		name = "이성계";
	}
	
	//인스턴스변수의 초기값을 넣는방법
	// 생성자매서드를 사용하거나, 변수를 만들때 직접 수를넣어 명시적 초기화를 사용하거나
	// 초기화 블럭을 사용한다.
	// 변수초기화의 순서는 
	// 명시적초기화 -> 초기화 블럭 -> 생성자매서드 
	/*age=30; 이라는 명시적초기화가되어있는 변수가있다
	 * 그뒤에 초기화 블록으로 { age = 28; } 이라고 되어있고
	 * 생성자매서드에 age 를 34로 바꾼다면
	 * age 는 30 -> 28 -> 34 순으로 변경이 된다.
	 * 
	 */

	public Student() {
	}

	public Student(String name, String age, int tall) {

		this.name = name;
		this.age = age;
		this.tall = tall;
	}

	public Student(String name, int tall) {

		this.name = name;
		this.tall = tall;
	}
//위와같이 생산자 매서드의 개수는 몇개든 상관없지만
// 생산자 매서드 내부의 변수 개수가 다르거나 수가같다면 타입이 달라야한다
// 만약 public student (String name,String age)
//     public Student(String name, int tall )
// 와 같다면 개수는 같으나 타입이 다르기때문에 괜찮다.

//클래스 객체에 저장되어 있는 값을 출력할때
//자바에서는 일반적으로 toString 매서드를 사용한다.
	public String toString() {
		return name + " : " + age + " : "+tall;
	}
}
