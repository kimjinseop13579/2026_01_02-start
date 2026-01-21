package exam08;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberList2 {
	public static void main(String[] args) {
		List<MemberDTO> list = new ArrayList<>();
		
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
			String sql = "select * from member order by no desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String id = rs.getString("id");
				String passward = rs.getString("passward");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				Date createdData = rs.getDate("createdData");
				
				MemberDTO memberDTO = new MemberDTO();
				memberDTO.getNo();
				memberDTO.getId();
				memberDTO.getPassward();
				memberDTO.getName();
				memberDTO.getPhone();
				memberDTO.getCreatedData();
				list.add(memberDTO);
				
				
//				memberDTO.setNo(rs.getInt("no"));
//				memberDTO.setId(rs.getString("id"));
//				memberDTO.setPassward(rs.getString("passward"));
//				memberDTO.setName(rs.getString("name"));
//				memberDTO.setPhone(rs.getString("phone"));
//				memberDTO.setCreatedData(rs.getDate("createdData"));
				//이런방법도있음
					
				
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
	    for (int i=0; i<list.size(); i++) {
	    	MemberDTO dto = list.get(i);
	    	System.out.printf("%s \t %s \t %s \t %s \t %s\n",dto.getNo(),dto.getId(),dto.getName(),dto.getPhone(),dto.getCreatedData());
	    }
		
		
		
		System.out.println("ㅡㅡ 프로그램 종료 ㅡㅡ");


	}

}
