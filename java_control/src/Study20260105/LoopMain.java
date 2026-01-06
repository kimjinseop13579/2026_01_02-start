package Study20260105;

import java.util.Scanner;

public class LoopMain {

	public static void main(String[] args) {

//		for(int i = 1; i<=10; i++) {
//			System.out.println( i );
//		}
//		for (int i =1; i <=100; i++) {
//			if(i %10 == 0 );
//			System.out.println( i );
//		}

		Scanner scan = new Scanner(System.in);

//		System.out.println("정수를 입력 :");
//		int num = scan.nextInt();
//		
//		for(int i=1; i<=num; i++) {
//			System.out.println( i );
//		}

		// 1부터 12까지 출력하는데
		// 4의 배수에는 four 라고 출력하시오

//		for (int i=1; i<=12; i++) {
//			if (i%4==0) {
//				System.out.println("four");
//			}else {
//				System.out.println( i );
//			}
//			
//		
//			
//		}
//		int count=0;
//		
//		for(int i=1; i<=1000; i++) {
//			
//			if(i%17==0) {
//				count++;	
//			}
//		}
//		System.out.println("17의 배수 :"+count+"개");

		// 문제
		// 동전 앞면 뒷면 맞추기 게임
		// 게임을 총 10판 진행 하기
		// 게임에서 내가 맟춘 횟수는 총몇번인진 출력하기

//		System.out.println("앞면 1,  뒷면 2,");
//
//		int count = 0;
//
//		for (int i = 1; i <= 10; i++) {
//			int coin = (int) Math.floor(Math.random() * 2) + 1;
//
//			System.out.print(i+".입력 :");
//			int num = scan.nextInt();
//
//			if (coin == num) {
//				count++;
//				System.out.println("성공!!");
//			} else {
//				System.out.println("실패");
//			}
//		}
//		System.out.println("맞춘횟수 : " + count);

		
		//무한루프 - 반복문은 조건식이 참인경우 계속 반복수행을 한다.
		//         무조건 참이 되게 조건식을 설정하면 무한반복을 할수있다.
		// 무한루프는 지정된 횟수가 없기에 멈추지 않고 계속 동작한다.
		// 그래서 무한루프 구현시 특정조건을 걸어 둔다.
		
//		for (;true;) {
//			
//		}
//		
//		for(;;) {
//			;
//		}
		
//		while(true) {
//			System.out.println("나는 무한 루프이다. ");
//		}
		
//		int i = 10;
//		while (true) {
//			System.out.println(i);
//			i++;
//			if (i==40)break;
//		}
		
//		int count = 0; 
//		
//		while(true) {
//			int num = (int)Math.floor(Math.random()*100)+1;
//			count++;
//			System.out.println(count+" 회 "+num);
//			if(num == 11 ) break;
//		}
		
		
//		int com = (int)Math.floor(Math.random()*50)+1;
//		
//		while(true) {
//			System.out.print("1~50 중 입력 :");
//			int user = scan.nextInt();
//			
//			if( user > com ) {
//				System.out.println("Down");
//			}
//			if( user < com ) {
//				System.out.println("up");
//			}
//			if(user == com) {
//				System.out.println("정답");
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 과제
//		 가위 바위 보 게임을 총 15 판 진행
//		 *  게임을 진행 하면서 1판 끝날때마다
//		 *  몇승, 몇패 , 몇무 출력하기
		
		// 1.가위  2.바위  3.보
		System.out.println("가위 : 1, 바위 : 2, 보 : 3");
		
		int Wincount = 0;
		int Losecount = 0;
		int Count = 0;
		
		
		for (int i=1; i<=15; i++) {
			int com = (int)Math.floor(Math.random()*3)+1;
			
			System.out.println(i+"회 입력");
			int user = scan.nextInt();
			
			if ( user - com == 1 || user - com == -2) {
				Wincount++;
			}else if(user - com == -1 || user - com == 2){
				Losecount++;
			}else {
				Count++;
			}
			System.out.println("승리 : "+Wincount+" 회");
			System.out.println("패배 : "+Losecount+" 회");
			System.out.println("무승부 : "+Count+" 회");
			
		}
		
		
		
		//과제 2
//		 *  내가 숫자 하나를 제시하고 컴퓨터가 그 숫자를 맞출수있도록 내가 범위를 점점 줄여가며
//		 *  컴퓨터가 맞출수있도록 내가 랜덤 범위를 계속 줄일수있는 코딩 짜기
//		 * 
		
		
		
//		System.out.println("1~50숫자 입력");
//		int Num = scan.nextInt();
//		
//		int com2 = 0;
//		int com = (int)Math.floor(Math.random()*50)+1;
//		System.out.println(com);
//		
//		while (true) {
//			
//			System.out.println("1.up 2.down");
//			System.out.println("up, down 입력 :");
//			int Button = scan.nextInt();
//			
//			if (Button ==1 ) {
//				com2 = com;
//				 com = (int)Math.floor(Math.random()*(50-com2+1))+1;
//			}else if (Button ==2) {
//				com2 = com;
//				 com = (int)Math.floor(Math.random()*(com2-1+1))+1;
//			}
//			
//		
//			if (Num == com)break;	
//		}
//		System.out.println("정답");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

/*
 *  1월 5일 과제
 *  
 *  가위 바위 보 게임을 총 15 판 진행
 *  게임을 진행 하면서 1판 끝날때마다
 *  몇승, 몇패 , 몇무 출력하기
 *  
 *  추과 과제
 *  
 *  내가 숫자 하나를 제시하고 컴퓨터가 그 숫자를 맞출수있도록 내가 범위를 점점 줄여가며
 *  컴퓨터가 맞출수있도록 내가 랜덤 범위를 계속 줄일수있는 코딩 짜기
 * 
 * 
 * 
 * 
 * 반복문 - for , while , do ~ while 반복문이란 특정코드를 정해진 횠수만큼 동작 시키는 과정이다. 또는 횟수의 제한
 * 없이는 동작시킬수없다
 * 
 * for 문
 * 
 * for ( 초기값; 조건식; 증감식 ) { 반복실행할 내용; 반복실행 할 내용; }
 * 
 * for (int i=3; i<=9; i++){
 * 
 * }
 * 
 * 1부터 시작하여 1씩 증가하는 형태로 반복문을 작성한다. 그래야 몇번 반복 시킬것인지 작성하기도 편하고 파악하기도 빠르고
 * 
 * 
 * for (Member m : MamberList){
 * 
 * } 자주 사용하게될 for 문의 형태
 * 
 */







