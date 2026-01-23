package exam28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ProductDTO> productList = new ArrayList<>();
		int hap = 0;

		while (true) {
			System.out.println("선택 ( 0:종료, 1:목록, 2:등록, 3:수정, 4:삭제 )");
			System.out.print("숫자를 입력해주세요 : ");

			String num_ = sc.nextLine();
			int num = Integer.parseInt(num_);

			switch (num) {
			case 1:
				for (int i = 0; i < productList.size(); i++) {
					productList.get(i).display();
					hap += productList.get(i).getTotal();
				}
				break;
			case 2:
				System.out.print("상품명을 입력해주세요 : ");
				String itemName = sc.nextLine();
				System.out.print("상품가격을 입력해주세요 : ");
				String itemPrice_ = sc.nextLine();
				int itemPrice = Integer.parseInt(itemPrice_);
				System.out.print("상품 개수를 입력해주세요 : ");
				String itemCount_ = sc.nextLine();
				int itemCount = Integer.parseInt(itemCount_);

				ProductDTO dto = new ProductDTO(itemName, itemPrice, itemCount);

				productList.add(dto);

				break;
			case 3:
				System.out.println("-수정-");
				break;
			case 4:
				System.out.println("-삭제-");
				break;
			}

			if (num == 0) {
				break;
			}
			System.out.println("---------------------------------------------");
			System.out.println("합계" + hap);
		}
	}
}