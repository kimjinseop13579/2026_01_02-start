package Study20260114;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect2 {

	private Connection conn;
	private Statement st;
	private ResultSet rs;

	public DBConnect2() {
		connect();
	}

	private void connect() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "kjs";
			String passward = "1234";
			String url = "jdbc:mysql://localhost:3306/kjs";
			conn = DriverManager.getConnection(url, username, passward);
		} catch (Exception e) {
			System.out.println("접속실패");
		}

	}

	public Item[] finditem() {
		Item[] item = new Item[7];

		String sql = "select * from item";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			int i = 0;
			while (rs.next()) {
				Item data = new Item(rs.getString("item_name"), rs.getInt("item_price"),
						rs.getString("item_main_image"), rs.getInt("item_stock"));
				item[i] = data;
				i++;
			}
		} catch (Exception e) {
			System.out.println("질의 실패 및 객체생성 실패");

		}
		return item;
	}
}
