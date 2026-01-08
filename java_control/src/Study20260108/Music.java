package Study20260108;

public class Music {
	
	String musicName;
	String singer;
	int time;
	

	
	Music (String musicName, String singer, int time){
		this.musicName = musicName;
		this.singer = singer;
		this.time = time;
		//위와 같이 생산자 매서드 이름을 다 채운채로는 
		// Music music = new Music(); 를 사용할수없음
		// 사용하기 위해서는 Music (){} 를 외부 클래스에 따로 입력해 주어야함
		
	}
}



