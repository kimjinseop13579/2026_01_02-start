package homeWork2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		List<String[]> list = new ArrayList<>();
		Map<Integer, String> map = new HashMap<>();
		
		
		
		String[] comp1 = {"자바 회사","대구","기획"};
		String[] comp2 = {"생산 회사","대구","생산"};
		String[] comp3 = {"과학 회사","대구","기획"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.매칭, 2.회사조회, 3.정보수정, 4.종료");
		System.out.print("숫자를 입력해주세요 : ");
		String num = sc.nextLine();
		switch(num) {
		case "1":
			System.out.print("이름을 입력해주세요 : ");
			String user = sc.nextLine();
			
					
				
			
		case "2":
			
		case "3":
			
		case "4":
			
		}
		
		
		

		
	}

}

/*
 직장인의 정보는  이름, 소속, 나이, 연락처, 업무, 희망지역,희망업무 를  받는다. 
회사의 정보는  회사명, 지역,  채용 업무를 받는다.

프로그램 실행시  출력되는 메뉴는  
1.  매칭 
2. 회사조회
3. 정보수정
4. 종료

1번 메뉴를 선택하면  직장인의 이름 입력 후  희망업무에 맞는 회사명이 나타나야 한다. 
2번 메뉴 선택하면  회사명을 입력하게 하고 입력후  회사의 지역, 채용업무 가 출력되어야한다.
3번 메뉴를 선택하면  직장인 이름 입력후  정보수정 가능하다. 

로그인 안함,   아무나 정보수정가능한거에 대해 고려 하지 말것 
*/