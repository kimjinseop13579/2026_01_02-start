package Study20260108;

public class JavaClass2 {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		//new.Movie()
		
		System.out.println( movie.title);
		
		movie.title = "아바타";
		movie.dir = "제임스 카메론";
		movie.year = 2009;
		movie.limitAge = 12;
		
		System.out.println(movie.title);
		

		
		Movie movie2 = new Movie("굿포츈",2026);
		
		System.out.println(movie2.title);
		System.out.println(movie2.year);
		
		
		//Music 클래스의 객체 생성하여
		//음악 제목, 가수, 재생시간(총몇분) 저장되게 하기
		// 매개변수 있는 생성자 매서드로 데이터 저장하고
		// 출력하기
		
		
		Music music = new Music("Beautiful Things", "Benson Boone", 3);
		
		System.out.println("제목 :"+music.musicName);
		System.out.println("가수 :"+music.singer);
		System.out.println("재생시간 :"+music.time+"분");
		
				
	}

}
