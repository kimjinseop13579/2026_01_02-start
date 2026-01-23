package exam30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

public class StudentDAO {
	public int setInsert(String[] arry){
		System.out.println(arry[0]);
		System.out.println(arry[1]);
		System.out.println(arry[2]);
		System.out.println(arry[3]);
		return 0;
	}
	
	public int setMap(Map<Integer, String> map) {
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
//	String dbUser = "javaUser";
//	String dbPwd = "1234";
//
//	Connection conn = null;
//	PreparedStatement pstmt = null;
//	ResultSet rs = null;
//
//	// 예외처리
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
//		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		String sql = "";
//		sql += "insert into member (no, id, passward, name, phone, createdData) values";
//		sql += "(null,?,?,?,?, now())";
//		pstmt = conn.prepareStatement(sql);
//		pstmt.setString(1, id);
//		pstmt.setString(2, passward);
//		pstmt.setString(3, name);
//		pstmt.setString(4, phone);
//		int result = pstmt.executeUpdate();
//		if (result > 0) {
//			System.out.println("등록 성공");
//		} else {
//			System.out.println("등록 실패");
//		}
//		
//		
//
//		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//	} catch (Exception e) {
//		System.out.println("드라이버 로딩 실패 또는 접속 실패");
//	} finally {
//		try {
//			if (rs != null) {
//				rs.close();
//			}
//			if (pstmt != null) {
//				pstmt.close();
//			}
//			if (conn != null) {
//				conn.close();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}


}
