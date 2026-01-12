package Study20260112;

public class Method1 {

	public static void main(String[] args) {
		
		Board board = new Board("점심메뉴는?","박문수",45);
		System.out.println(board);
		
		board.hitUp("이순신");
		System.out.println(board);
		
		board.hitUp("박문수");
		System.out.println(board);
		
		board.updateTitle("김춘추", "저녘뭐먹지");
		System.out.println(board);
		
		board.updateTitle("박문수","내일 뭐먹지");
		System.out.println(board);

	}

}
