package Study20260108;

public class Movie {
	String title;//영화제목 인스턴스 변수
	String dir;// 영화감독
	int limitAge;// 관람연령
	int year; //개봉년도

	//생산자 매서드
	Movie(){// 객체를 초기화
		title="주토피아";
	}
    //매개변수가 있는 생성자 매서드
	Movie(String title ,int year){// 오버로딩 String title = 지역변수 , main 
		this.title = title;
		this.year = year;
	}
}

