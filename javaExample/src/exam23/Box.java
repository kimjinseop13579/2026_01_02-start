package exam23;

//제너릭 
// 데이터 티입(int, String 등)을 미리 정하지 않고,
// 상자를 만들때 결정하는 방식
//클래스명 옆에 <T>를 붙여서 "나중에 타입을 정할게" 라고 선언
public class Box<T> {
	private T item;
	
	public void set(T item) {
		this.item = item;
		
	}
	public T get() {
		return item;
	}
	
	
}


/*


제너릭 사용이유
타입의 안정성
 - 제너릭을 쓰면 엉뚱한 데이터가 들어오는것을 컴파일 단계어세 막을수있음(빨간줄이 미리뜸)
 
 번거러운 형변환
  - 과거에 데이터를 꺼낼때마다 (String) 처럼 형변환을 해야 했지만,
    제너릭을 쓰면 자바가 알아서 처리해줌

자주 사용하는 제너릭 기호 (관례)
이 기호들은 규칙은 아니지만 전 세계 개발자들의 '약속'

<T>: Tyip (일반적인 타입)
<E>: Element (리스트 같은 컬렉션 요소)
<K>: Key (맵의 키)
<V>: Value (맵의 값)


*/