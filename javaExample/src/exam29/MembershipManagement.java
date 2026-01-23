package exam29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MembershipManagement {

	public static void main(String[] args) {
		// 회원관리 : 목록 상세보기 등록 수정 삭제
		// 아이디 비밀번호 이름 연락처 주소 : 대전 서울 충남;
		Scanner sc = new Scanner(System.in);

		Map<Integer, Membership> userMap = new HashMap<Integer, Membership>();

		int count = 0;

		while (true) {

			System.out.println("0.종료, 1.목록, 2.상세보기, 3.등록, 4.수정, 5.삭제");
			System.out.print("숫자를 입력해 주세요 : ");
			String num_ = sc.nextLine();
			int num = Integer.parseInt(num_);

			if (num == 1) {
				for (int i = 1; i <= userMap.size(); i++) {
					System.out.println("유저번호" + i + ". " + userMap.get(i).getUserId());
				}
			} else if (num == 2) {
				System.out.print("유저 번호를 입력해주세요");
				String userNum_ = sc.nextLine();
				int userNum = Integer.parseInt(userNum_);

				for (int i = 1; i <= userMap.size(); i++) {
					if (userNum == i) {
						userMap.get(i).userImpormation();
					}
				}

			} else if (num == 3) {
				System.out.print("아이디를 입력해주세요 : ");
				String userId = sc.nextLine();
				System.out.print("비밀번호를 입력해주세요 : ");
				String userPassword = sc.nextLine();
				System.out.print("연락처를 입력해주세요 : ");
				String userCallNum = sc.nextLine();
				System.out.print("주소를 입력해주세요 : ");
				String userAddress = sc.nextLine();

				Membership membership = new Membership(userId, userPassword, userCallNum, userAddress);
				count++;
				userMap.put(count, membership);

			} else if (num == 4) {
				// 수정
			} else if (num == 5) {
				// 삭제
			} else if (num == 0)
				break;
		}

	}

}
