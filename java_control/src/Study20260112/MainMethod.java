package Study20260112;

import java.util.Scanner;

public class MainMethod {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name2 = sc.nextLine();
		System.out.print("레벨을 입력하세요 : ");
		int level2 = sc.nextInt();
		System.out.print("승리 수를 입력하세요 : ");
		int win2 = sc.nextInt();
		System.out.print("패배 수를 입력하세요 : ");
		int lose2=sc.nextInt();
		System.out.print("무승부 수를 입력하세요 : ");
		int drow2=sc.nextInt();
		
		BingoGame bingogame=new BingoGame(name2,level2,win2,lose2,drow2);
		
		System.out.println(bingogame);
		
		bingogame.setName("김춘추");
		
		System.out.println(bingogame.getName());
		
	}

}
