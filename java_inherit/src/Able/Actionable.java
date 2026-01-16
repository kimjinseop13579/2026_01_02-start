package Able;

public interface Actionable {
	
	
	//인터페이스는 기본적으로 추상메스드이기때문에 abstract를 생략해도 상관없다
	public abstract void move();
	public void drink();
	
//	 public int num = 0; //인스턴스 변수 불가 뒤에 =0으로 초기화를 해주면 
//	                     // static이 생략된채로 적용이된다.
//	public static int count=0;
//	
//	public final int a=20;

}


/*
   인터페이스 
   추상클래스의 일종
   기본적으로 추상메서드를 가진다
   인스턴스 변수, 인스턴스 메서드 불가
   static 변수, static 메서드, final 가능
   
   인터페이스 구현 하는 이유
   1. 프로그램 전반의 규칙을 강제
   2. 다형성
   3. 다중 상속
  
*/