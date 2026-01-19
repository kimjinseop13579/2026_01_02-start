package exam03;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	public static void main(String[] args) {
		// 리스트 : 큰가방
//		ArrayList<Integer> list = new ArrayList<>();
		//Generric (제너릭) 리스트에 들어가는 자료형에 제한을 검 ArrayList<> 의 <> 안에 타입을 넣어주면 
//		                  리스트에 그자료형만을 받아들이게 제한을 걸수있음 
		
		// List 와ArrayList는 상속 클래스로 List가 부모클래스
		List<Integer> list = new ArrayList<>(); //리스트 생성
		System.out.println( list ); // [] 가 결과로 나옴  (리스트는 배열과 다르게 주소가 아닌 내부의 내용이 보임)
		
		list.add(1);  //리스트 안에 값을 추가하려면 리스트이름.add()를 하면 그 값을 넣어줌
		System.out.println( list );  //[1]
		
		list.add(2);
		System.out.println( list ); //[1,2]
		 
		list.add(300);
		System.out.println( list ); // [1,2,300]
		
		System.out.println("리스트의 길이 :"+list.size()); //3 이 결과로 나옴 리스트 이름.size 는 
		                                                //리스트에 몇개의 값이 들어가있는지 보여줌 
		
		System.out.println(list.get(0)); //  1 이 나옴 리스트도 배열과같이 인덱스로 표현을 하기때문에 
		                                 // 리스트 내부에 값을 가져올때 배열표현과 같이 0 부터 크기를 보면됨
		System.out.println(list.get(1)); // 2
		System.out.println(list.get(2)); // 300
		
		for (int i=0; i<list.size(); i++) { // 시작값과 끝값을 알고있기 때문에 for문을 사용할수있음
			System.out.println("리스트의 "+(i+1)+" 번째값"+list.get(i));
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		list.remove(2);// 리스트 이름.remove(?) 리스트 의 ? 번째 인덱스 값을 지워라 라는 뜻이됨 
		
		for (int i=0; i<list.size(); i++) { 
			System.out.println("리스트의 "+(i+1)+" 번째값"+list.get(i));
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		list.set(0, 100); // list.set(x, y); 리스트의 x번째 인덱스의 값을 y로 바꿔라 
		
		for (int i=0; i<list.size(); i++) { 
			System.out.println("리스트의 "+(i+1)+" 번째값"+list.get(i));
		}
		//공통모듈
		
		int i = 0;
		for(Integer a : list) {  //[100,2] 
			System.out.println("리스트의 "+i+" 번째 인덱스값 "+a);
		}
		
	}

}
