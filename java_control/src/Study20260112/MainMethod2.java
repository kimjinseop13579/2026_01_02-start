package Study20260112;

import java.util.Scanner;

public class MainMethod2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Vending milk = new Vending("밀키스",1500,1);
		Vending aloe = new Vending("알로에",2000,2);
		
		System.out.println(milk);
		System.out.println(aloe);
		
		
		
		milk.sell(1500);
		System.out.println(milk);
		
		milk.check();
		System.out.println(milk);
		
		milk.plus(5);
		System.out.println(milk);
		
		
		
		
		
		

	}

}
