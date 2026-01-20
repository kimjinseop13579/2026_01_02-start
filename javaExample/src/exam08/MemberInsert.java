package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberInsert {

	// 회원등록프로그램
	public static void main(String[] args) {

//		int a = 5;
//		int b = 0;
//		try {
//			double c = a / b;
//			System.out.println("c : " + c);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(b + "으로 나누어서 종료");
//		} finally {
//			System.out.println("에러");
//		}
//		System.out.println("ㅡㅡ프로그램 종료ㅡㅡ");

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.println(id);

		System.out.print("비밀번호 : ");
		String passward = sc.nextLine();

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("전화번호 : ");
		String phone = sc.nextLine();

		String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		String dbUser = "javaUser";
		String dbPwd = "1234";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 예외처리
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
			// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			String sql = "";
			sql += "insert into member (no, id, passward, name, phone, createdData) values";
			sql += "(null,?,?,?,?, now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, passward);
			pstmt.setString(3, name);
			pstmt.setString(4, phone);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("등록 성공");
			} else {
				System.out.println("등록 실패");
			}
			
			

			// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println("ㅡㅡ 프로그램 종료 ㅡㅡ");

	}

}
