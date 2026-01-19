package homeWork;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Notifier mail = null;
		while(true) {
			System.out.println("메일 종류를 골라주세요");
			System.out.println("1.이메일 2.휴대폰 메일 3.카카오톡");
			int num = sc.nextInt();
		if (num == 3) {
			mail = new App();
		}else if (num == 2) {
			mail = new PhoneMail();
		}else if (num == 1) {
			mail= new Email();
		}else {
			System.out.println("메일을 다시 골라주세요");
		}
		if (mail!=null)
			break;
		}
		
		mail.sendMail();
		
		

	}

}
