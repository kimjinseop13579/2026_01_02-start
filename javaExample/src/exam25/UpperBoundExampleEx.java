package exam25;

import java.util.Arrays;
import java.util.List;

public class UpperBoundExampleEx {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(10,20,30);
		List<Double> doubleList =Arrays.asList(1.5,2.5,3.5);
		
		System.out.println("Integer 합계 : "+UpperBoundExample.sumOfList(intList));
		System.out.println("Double 합계 : "+UpperBoundExample.sumOfList(doubleList));
	}

}

/*
 Wild card
<?> : 비제한
비제한 <?> 모든타입 타입에 무관한 단순 기능
목적 : 타입에 상관없이 공통적인 기능(출력,크기 확인 등) 을 수행할때사용

<? extends T> : 상한제한
상한제한 <? extends T> T와 그 자식들 데이터 읽기 전용
목적 : 특정 타입의 자식들을 모두 받아 데이터를 안전하게 읽기(read) 위해 사용

<? super T> : 하한제한
하한 제한 <? super T> T와 그 부모들 데이터 쓰기 전용
목적 : 특정 타입의 부모들을 받아 데이터를 안전하게 저장(write) 하기위해 사용



 */