package Study20260102;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		
	
		// 바이킹 탑승 가능 : 145cm 이상
//	    int cm = 160;
//		
//		if(145 <= cm) {
//			System.out.println("바이킹 탑숭 가능");
//		}else {
//			System.out.println("바이킹 탑승 불가");
//		}
//		
//		int age = 33;
//		
//		if ((age/10) == 3  ) //30 <= age && age <40
//		      System.out.println("30대 이다");
//		else 
//			System.out.println("20대 이다");
//		
		// 주차장의 요금이 기본요금은 1000 원이다
		// 기본시간은 30분이다.
		
		// 초과시 10 분당 100원씩 추가 예) 39분은 1000원, 40분은 1100원
		
		// 단 4시간 이상 주차시 기본요금은 2500원 이다.
		
		// 예 3시간 50분 (230분) -> 1000원
		// 4시간 12분 (252분) -> 2600
		
		
		//데이터 입력
		
//		Scanner kbd = new Scanner(System.in);
//		
//		int Money1 = 1000; // 기본요금
//		int Money2 = 100; // 추가요금
//		int Time1 = 30; // 기본 주차시간
//		System.out.println("시간을 입력해주세요");
//		
//		System.out.print("시간 : "); 
//		int Hour = kbd.nextInt(); // 입력 시
//		
//		System.out.print("분 : ");
//		int Min = kbd.nextInt(); // 입력 분
//		
//		int Hr = (Hour * 60) + Min; // 입력 받은 시 - 분으로 변환
//		
//		//데이터 처리
//		
//		if (40 > Hr) {
//			System.out.println("요금 : "+Money1);
//		}else if( 40 <= Hr && 240 > Hr) {
//			Money2 = (Hr-30)/10*100;
//			System.out.println("요금 : "+(Money1+Money2));
//		}else if( 240 <= Hr) {
//			Money1 = 2500;
//			Money2 = (Hr-30)/10*100;
//			System.out.println("요금 : "+(Money1+Money2));
//		}
		
		
		int cost = 1000;
		int inc = 100, incTime = 10;
		int time = 30;
		
		//주차시간 총 몇분 입력
		
		Scanner scan = new Scanner(System.in);// 시스템(컴퓨터)으로부터 입력된키 값 받기
		
		System.out.println("총 몇분 주차 : ");
		int pTime = scan.nextInt();// 키보드로 입력받아서 정수로 변환하여 변수에 저장
		
		pTime/= 10; // pTime = pTime /10 - 3
		if( pTime >= 24) {//4시간 이상 주차했다면 pTime >= 240
			cost=2500;// 4시간 이상에 대한 기본요금 변경
			pTime -= 24; //4시간 빼기 , 4시간에 대한 요금은 2500원 나머지는 10분당 요금
		}else if(pTime > 3){
			//4시간 이상이 아니라면 , 기본시간이 30분으로 계산되어야 한다.
			pTime -= 3; //기본시간이 30분이니가 3빼기
		}else {//최초 기본시간 안에 주차 한 경우
			pTime=0;
		}
		
		int price = cost + pTime*100;
		System.out.println("주차요금 : "+price +"원");
		
		//주차 요금 계산
		
		
		
		
		
		
		

	}

}

/* 제어문
   
   조건문 - if , switch
   
   1.
   if (조건식) {
    조건식이 참일경우 코드;
   }
   2.
   if(조건식){
      조건식이 참일경우 실행하는 코드;
   }else{
       조건식이 거짓일때 실행하는 코드;
   }
   3.
   if(조건식1){
      조건식1이 참인경우 실행
   }else{
   조건식1이 거짓인 경우
          if(조건식2){
          조건식2 가 참인경우 실행
          }
   }
   4.
   if(조건식1){
      조건식1이 참인경우 실행
   }else if(조건식2){
   조건식2가 참인경우 실행
   }else{
   조건식
   }
   
   
   
*/