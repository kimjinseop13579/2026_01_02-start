package exam24;

public class _Exec {

	public static void main(String[] args) {
		Entry<String,Integer> score = new Entry<>("홍길동",95);
		score.display();
		
		System.out.println("-------------------------");
		
		Entry<Integer, String> product = new Entry<>(1001,"노트북");
		product.display();
		
	}

}


/*
 wild card (와일드 카드)
 의미 : 어떤 타입이든 상관없이 다 받을수있음
 특징 : 타입에 의존하진 않는 단순 출력이나 개수 확인 같은 작업에 사용
 제약 : 타입을 알수없으므로 null 외에는 요소를 추가(add) 할수없음


*/