package Study20260114;

//import java.sql.Connection; 이렇게 3개를 넣어줘도 되고
//import java.sql.ResultSet;
//import java.sql.Statement;

import java.sql.*; //이렇게 끝에 별을 하나 넣어주면 3개의 역할을 다해줌




public class DBConnect {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	
	public DBConnect() {
		connect(); //데이터 베이스 연결을 위한 메서드
	}
	
	private void connect() {
		// 데이터베이스 드라이버 실행 - 연결
		// 계정 로그인
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// com.myspl.cj.jdbc.Driver
		                                              //  정해져있기때문에 외워두면 좋음
			String username="kjs";
			String pasward = "1234";
			String url = "jdbc:mysql://localhost:3306/kjs";
			conn = DriverManager.getConnection(url, username, pasward);
			
			
		}catch(Exception e) {                         
			System.out.println("접속실패");
			
		}
	}

	public GameMamber[] findall() {
		GameMamber[] gameMambers = new GameMamber[10];
		
		//쿼리문 작성하기
		//쿼리문 보내기
		//결과 받기
		// 데이터를 클래스 객체에 저장하고 배열에 저장 하기
		
		String sql = "select * from game_mamber";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			int i = 0;
			while(rs.next()){
				GameMamber data = new GameMamber(
						rs.getString("name"),rs.getString("birth"), rs.getString("nick_name"),
						rs.getInt("level")
						);
				 gameMambers[i] = data;
				 i++;
			}
		}catch(Exception e) {
			System.out.println("질의 실패 및 객체생성 실패");
		}
		
		return gameMambers;
	}
}




