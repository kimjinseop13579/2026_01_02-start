package exam30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _Exec {
// 이름 주민번호 전화번호 주소
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();

		while (true) {
			System.out.print("선택(1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제, 기타:종료) : ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				System.out.println("-목록-");
				break;
			case "2":
				System.out.println("- 상세보기 -");
				break;
			case "3":
				System.out.println("- 등록 -");
//				StudentDTO dto = new StudentDTO();
				
				String name = "이성순";
				String ssn = "123456-1234567";
				String phone = "010-1234-5678";
				String address = "서울";
				String[] arry = {name,ssn,phone,address};
				map.put(1, "이성순");
				map.put(2, ssn);
				map.put(3, phone);
				map.put(4, address);
				
				
				StudentDAO dao = new StudentDAO();
				dao.setMap(map);
				int result = dao.setInsert(arry);
				System.out.println("result :"+result);
				
				break;
			case "4":
				System.out.println("- 수정 -");
				break;
			case "5":
				System.out.println("- 삭제 -");
				break;
			default:
				System.out.println("- 프로그램 종료 -");
				return;

			}

		}

	}

}
