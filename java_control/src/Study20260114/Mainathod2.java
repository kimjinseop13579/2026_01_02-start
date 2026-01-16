package Study20260114;

public class Mainathod2 {

	public static void main(String[] args) {
		DBConnect2 connect2 = new DBConnect2();
		
		Item[] itme = connect2.finditem();
		
		System.out.println(itme[1]);

	}

}
