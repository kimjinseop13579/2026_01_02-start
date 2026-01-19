package exam04;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	public static void main(String[] args) {
//		Student s1 = new Student("홍길동",80);
//		Student s2 = new Student("이성순",90);
//		Student s3 = new Student("장천용",100);
		
//		List<Student> list = new ArrayList<>();
//		list.add(s1);
//		list.add(s2);
//		list.add(s3); 
		// 위와 같이 두번에 나누어 수를 넣을수도 있고 아래처럼 바로 리스트에 넣을수도있다
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동",80));
		list.add(new Student("이성순",90));
		list.add(new Student("장천용",100));
		
		//람다를 이용한 정렬 (내림차순) 아직 몰라도 됨
		list.sort((s1,s2)->s2.score - s1.score);
		
		System.out.println("성적순 정렬 결과");
		System.out.println(list);
		
		//하나의 변수에 여러가지 값을 넣기위해서는 배열, 리스트, 객체 등이 있음
		
		
		

	}

}
