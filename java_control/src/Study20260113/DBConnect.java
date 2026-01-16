package Study20260113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {

	private Connection conn; // 데이터 베이스 연결유지
	private Statement st; // 데이터베이스에 쿼리문 전달 및 결과 받기
	private ResultSet rs; // 데이터베이스의 결과를 저장

	public DBConnect() {
		connect();

	}

	private void connect() {
		// 데이터 베이스 접속

		// 오류가 날거같은 코드가있을때 try 안에 넣어준다
		// 오류가 날경우 catch 에서 오류대신에 다른 개발자가 미리 catch에 넣어둔것을 실행함
		// 오류를 회피하는 코드로 해결코드는아님
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "kjs";
			String passward = "1234";
			String url = "jdbc:mysql://localhost:3306/kjs";
			
			conn = DriverManager.getConnection(url, username, passward);
		} catch (Exception e) {
			System.out.println("접속실패");
			e.printStackTrace();
		}
	}
	
	//product 테이블의 데이터 가져오기
	public Product[] selectData() {
		
		Product[] products = new Product[6];
		//쿼리문 작성하기
	    String sql = "select * from product";// product 테이블 모든 데이터 조회
	    
	    try {	    	
	    	//쿼리문 보내기
	    	st = conn.createStatement();// Statement 생성
	    	rs = st.executeQuery(sql); // 쿼리문 보내고 받은 결과를 ResultSet에 저장
	    	
	    }catch(Exception e){
	    	System.out.println("쿼리문 실패");
	    }
		// 결과 받기
		
		//데기터 들을 product 객체에 저장하기
	    try {
	    	int i = 0;
	    	while(rs.next()){
	    	
	    		Product temp = new Product(
	    				rs.getString("item_name") , rs.getInt("price"),
	    				rs.getInt("stock"), rs.getString("description")
	    				);
	    		products[i] =temp;
	    		i++;
	    	}
	    	
	    }catch(Exception e) {
	    	System.out.println("객체생성 실패");
	    	e.printStackTrace();
	    }
	    
	    
	    
		return products;
		
	}
	
}
