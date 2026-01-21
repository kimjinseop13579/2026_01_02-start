package exam11;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// Set - 중복을 허용하지 않는

		Set<String> set = new HashSet<>();
		System.out.println("set : " + set);
		set.add("사과");
		System.out.println("set : " + set);//[사과]
		set.add("바나나");
		System.out.println("set : " + set);//[사과, 바나나]
		set.add("포도");
		System.out.println("set : " + set);//[포도, 사과, 바나나]
		set.add("사과");
		System.out.println("set : " + set);//[포도, 사과, 바나나]
		System.out.println("담긴 갯수 : "+set.size());
		
		if(set.contains("사과")) {
			System.out.println("사과가 있다");
		}
		
		for (String s : set) {
			System.out.println(s);
		}
		
//		set.remove("포도");
//		set.remove("체리");
//		System.out.println(set);
		
		//set 는 따로 수정해주는 명령어가 없어 아래와 같이 
		// 그 단어를 찾아 체거 및 생성으로 수정을 대신해줄수있음
		if(set.contains("체리")) {
			set.remove("체리");
			set.add("cherry");
		}
		
		
		
	}

}
