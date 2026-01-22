package exam17;

// 인스턴스 내부 클래스
// 외부 클래스의 인스턴스가 생성되어야만 내부 클래스도 존재할수있음
// - 특징 : 외부 클래스의 자원을 내 거처럼 사용함
// - 사용 방법 : 외부객체.new 내부 클래스()

public class _Exec {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.display();
		
		
	}

}
