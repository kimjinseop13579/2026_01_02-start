package exam28;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("선택 ( 0:종료, 1:목록, 2:등록, 3:수정, 4:삭제 )");
			System.out.print("숫자를 입력해주세요 : ");
			String num_ = sc.nextLine();
			int num = Integer.parseInt(num_);

			if (num <= 4 && num >= 1) {
				switch (num) {
				case 1:
					System.out.println("-목록-");
					break;
				case 2:
					System.out.println("-등록-");
					break;

				case 3:
					System.out.println("-수정-");
					break;

				case 4:
					System.out.println("-삭제-");
					break;
				}
				
			} else if (num == 0) {
				break;
			}

		}
	}
}