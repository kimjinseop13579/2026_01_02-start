package exam15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// 상품 이름, 상품 가격, 상품개수

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>(); 
		
		int total = 0;
		
		
		while(true){
			
		System.out.print("상품명을 입력해주세요 : ");
		String itemName = sc.nextLine();
		
		System.out.print("상품가격을 입력해주세요 : ");
		String itemPrice_ = sc.nextLine();
		
		System.out.print("상품개수를 입력해주세요 : ");
		String itemCount_ = sc.nextLine();
		
		int itemPrice = Integer.parseInt(itemPrice_);
		int itemCount = Integer.parseInt(itemCount_);
		
		int itemTotal = itemPrice * itemCount;
		total += itemTotal;
		
		list.add(itemName);
		list.add(itemPrice_+"원");
		list.add(itemCount_+"개");
		list.add(itemTotal+"원\n");
		
		System.out.print("물품을 추가하려면 1 그만두기를 원하시면 2번을 눌러주세요");
		String exit_ = sc.nextLine();
		int exit = Integer.parseInt(exit_);
		if(exit == 2)
			break;
		}
		
		System.out.println(list);
		System.out.println("---------------------------");
		System.out.println(total+"원");
		
		
		
		
	}

}
