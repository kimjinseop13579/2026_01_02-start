package Study20260106;

import java.util.Scanner;

public class LoopMain2 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
//		System.out.println("1~50중 입력 : ");
//		int user = scan.nextInt();
//		
//		int max = 50;
//		int min = 1;
//		
//		while(true) {
//			int com = (int)Math.floor(Math.random() * (max-min+1) )+min;
//			
//			if (com > user) {
//				max = com-1;
//				System.out.println("down");
//			}
//			if (com < user) {
//				System.out.println("up");
//				min = com+1;
//			}
//			if (com == user) {
//				System.out.println("정답 !");
//				break;
//			}
//		}
		
		
		System.out.println("======================= 숫자 야구 =========================");
		
		int com1 = (int)Math.floor(Math.random()*9)+1;
		int com2 =0;
		int com3 =0;
		
		
//		while (true) {
//			com2 = (int)Math.floor(Math.random()*9)+1;
//			com3 = (int)Math.floor(Math.random()*9)+1;
//			if (  com1 != com2 && com2 != com3 && com1 != com3)break;
//			
//		}
		do {
			com2 = (int)Math.floor(Math.random()*9)+1;
	        com3 = (int)Math.floor(Math.random()*9)+1;
		} while (  !(com1 != com2 && com2 != com3 && com1 != com3));
		
		
		while (true) {
			System.out.println("1~9까지의 숫자중 3개입력 : ");
			int user1 = scan.nextInt();
			int user2 = scan.nextInt();
			int user3 = scan.nextInt();
			
			int Strike = 0;
			int ball = 0;
			int out = 0;
			
			if (user1 == com1 ) Strike++;
			if (user2 == com2 ) Strike++;
			if (user3 == com3 ) Strike++;
			
			if (user1== com2 || user1 == com3) ball++;
			if (user2 == com1 || user2 == com3) ball++;
			if (user3 == com1 || user3 == com2) ball++;
			
			out = 3-Strike -ball;
			
			System.out.println("Strike :"+Strike);
			System.out.println("Ball :" +ball);
			System.out.println("Out :"+out);
			if (Strike == 3 )break;
		}
		
	
		System.out.println("성공");
		
		
		
		
		
	}

}


/*
 * 
*/