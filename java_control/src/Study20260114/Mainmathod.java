package Study20260114;

public class Mainmathod {

	public static void main(String[] args) {
		DBConnect connect = new DBConnect();
		
		GameMamber[] gameMambers = connect.findall();
		
		System.out.println(gameMambers[2]);

	}

}
