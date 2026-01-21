package exam14;

import java.util.Scanner;

public class DivisionQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===나눗셈 계산기===");
		//1. 첫번째 숫자 입력
		System.out.print("첫번째 정수를 입력하세요");
		String num1_ = sc.nextLine();
		
		int num1;
		
		try {
			num1 = Integer.parseInt(num1_);
			
		}catch(Exception e) {
			num1 = -1;
		}
		System.out.println("num1 : "+num1);
		
//		String s = num1_;
//		for(int i=0; i<=9; i++) {
//			s = s.replace(i+"","");
//		}
//		System.out.println("s : [ "+s+" ]");
//		
//		int num1 =0;
//		if (s.equals("")) {
//			num1 = Integer.parseInt(num1_);
//		} else {
//			System.out.println("숫자만 입력 가능 합니다");
//			return;
//		}
		
		
		System.out.println("num1 = "+num1);
		
		
//		System.out.print("두번째 정수를 입력하세요");
//		String num2 = sc.nextLine();
		
//		int result = num1 / num2;
//		System.out.println("결과 : "+num1+"/"+num2+"="+result);

	}

}
