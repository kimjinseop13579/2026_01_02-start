package exam03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _Exec2 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(200); //[200]
		numbers.add(50); //[200,50]
		numbers.add(30); //[200,50,30]
		
		numbers.get(0); //200/
		
		//1.오름차순 정렬 (기본)
		Collections.sort(numbers);
		System.out.println("오름차순 : "+numbers);//[200,50,30]
		
		//2.내림차순 정렬
		

	}

}
