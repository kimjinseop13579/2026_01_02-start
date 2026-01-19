package exam01;

import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.nextLine();
		System.out.print("주민번호를 입력하세요 : ");
		String ssn = scanner.nextLine();
		System.out.print("나이를 입력하세요 : ");
		String age = scanner.nextLine();

		
		System.out.println(name+"\t"+ssn+"\t"+age);
	}

}
