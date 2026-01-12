package Study20260112;

public class Board {

	private String title; //게시판 제목
	private String Writer; // 게시글작성자
	private int hit; // 게시글 조회수
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "Board [title=" + title + ", Writer=" + Writer + ", hit=" + hit + "]";
	}
	public Board(String title, String writer, int hit) {
		super();
		this.title = title;
		this.Writer = writer;
		this.hit = hit;
	}
	
	// 조회수 증가 메서드 만들기
	// 사용자들이 해당 게시글을 보면 조회수 증가
	// 작성자가 게시글을 보면 조회수 증가 안함
	
	public void hitUp(String user) {
		if (!user.equals(Writer)) {
			hit++;
		}	
	}
	
	// 게시글의 제목 수정
	// 게시글의 작성자가 아니면 수정 할 수 없다.
	public void updateTitle(String who , String title) {
		if (who.equals(Writer)) {
			this.title = title;
		}
	}
	
	
	
}







/*
 
 1. 매개변수 없고, 반환(return) 없는 메서드
   public void 메서드이름( ){ }
   
 2. 매개변수만 있는 메서드
   public void 메서드이름(매개변수1,매개변수2){ }
   
 3. 반환(return)만 있는 메서드
   public Strign 메서드이름() { return String변수;}
   
 4. 매개변수 있고, 반환(return)도 있는 메서드
    public int 메서드이름(매개변수1, 매개변수2 ) {return int 변수;}    
 
 
 매서드
 
   특정 기능을 실행 되게 해주는것
   (기능이라면 출력, 계산, 데이터 필터, 데이터 찾기,
   데이터 옮기기, 데이터 삭제)
   
   매서드의 형태
   제어자 - 타입 - 메서드이름( 매개변수 ) {
       메서드 실행할 내용
   }
   
   public(메서드) int(데이터 타입) sum(메서드 이름)(int a, int b(매개변수이름)){
       int result = a+b;
   }
   
   public float sum(float a, float b){
         float result = a+b;
   }
   
   메서드의 형태 4가지
   
   // 매개변수만 있는 메서드
   public void 메서드 이름( 매개변수 ){
   
    }
   생년월일을 통해 나이 알아내기
   public void getAge(int birth){
        int age = 2026 - (birth/10000);
        System.out.println("나이 : "+age )
   }
   
   //매개변수는 없고 반환만 있는 메서드
   // 메서드를 만들때 타입은 반환되는 변수의 타입과 일치해야한다.
   public int total(){
     int kor = 55, mat =60, eng=70;
     
     int tot = kor+mat +eng;
     
     return tot;
   }
   
   //매개변수 없고 , 반환도 없는 메서드
   
   public void saveData(){
      int a=20;
      
      DBSave( a ) ;
      
   }
   
   // 매개변수있고, 반환도있는 메서드
   
   public Movie saveData(String title, int year){
         Movie movie = new Movie(title, year);
         
         return movie;
   }
   
 
 */



