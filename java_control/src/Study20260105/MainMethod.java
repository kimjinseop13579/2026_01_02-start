package Study20260105;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		
		//Integer.parseInt() 정수갑으로 변경
		//Math.floor() 소수점 자르기
		
//		int num = (int)Math.floor(Math.random()*10);
//		
//		System.out.println(num);
		
		//동전의 앞면 뒷면 맞추기
		Scanner sc = new Scanner(System.in);
		
//		int coin = (int)Math.floor(Math.random()*2)+1;
//		// 1 - 앞면 , 2 - 뒷면
//		System.out.println("동전 앞면 뒷면 맟추기");
//		System.out.println("1 - 앞면, 2 - 뒷면 \n 입력 :");
//		int user = sc.nextInt();
//		
//		if (user == coin)
//		System.out.println("맞추기 성공!!!");
//		else
//			System.out.println("맞추기 실패!!!");
		
//		int dice = (int)Math.floor(Math.random()*6)+1;
//		
//		System.out.println("주사위 맞추기 게임!!!");
//		System.out.println("1~6중에 하나 입력 :");
//	    int num = sc.nextInt();
//	    
//		if (num == dice)
//	    System.out.println("맞추기 성공");
//		else
//			System.out.println("맟추기 실패");
		
		//컴퓨터 주사위
//		int com = (int)Math.floor(Math.random()*6)+1;
//		
//		//나의 주사위
//		int user = (int)Math.floor(Math.random()*6)+1;
//		// 내가 컴퓨터 보다 큰가? 작은가? 아니면 비김?
//		
//		
//		if (user > com || (user==1 && com==6)) {
//			if ( user == 6 && com==1)
//				System.out.println("나의 패배");
//			else
//			System.out.println("나의 승");
//		}else if (user == com)
//			System.out.println("비김");
//		else
//			System.out.println("나의 패배");
		
		// 컴퓨터와 함께하는 가위 바위 보 게임!!!
		// 1 - 가위 , 2 - 바위 , 3 - 보
		
		//컴퓨터의 가위바위보 값은 키보드 입력으로
		//내가 이겼는지 , 졌는지 , 비겼는지 출력하시오
		
		int user = (int)Math.floor(Math.random()*3)+1;
		int com = (int)Math.floor(Math.random()*3)+1;
		
		System.out.println("사용자 :"+user);
		System.out.println("컴퓨터 :"+com);
		
//		if (user > com || (user == 1 && com == 3)) { 
//			if (user == 3 && com ==1)
//			System.out.println("패배");
//			else
//			System.out.println("승리");	
//		}else if (user < com)
//			System.out.println("패배");
//		else if (user == com)
//			System.out.println("무승부");
		
		int res = user - com;
		if (res == 0)
			System.out.println("무승부");
		else if (res == 2 || res == 1)
			System.out.println("승리");
		else 
			System.out.println("패배");
		
		
		

	}

}
