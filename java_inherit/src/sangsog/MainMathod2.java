package sangsog;

import common.Animal;
import products.Bird;
import products.Cat;
import products.Dog;
import products.Rabbit;

public class MainMathod2 {

	public static void main(String[] args) {
		
		Animal[] animals = {
			new Dog("휜둥이","시츄"),
			new Cat("치즈"),
			new Rabbit("거북이"),
			new Bird("도도")
		};
		
		for(Animal a : animals) {
			a.sound();
			a.sleep();
		// 부모메서드로 for문을 돌릴때 자식클래스 내부의 특정
			//코드를 가지고오고싶다면 아래 instenceof
			//를 아래와 같은식으로 사용하면된다
			// 의미는 dog 는 a 의 인스턴스이다 라는 뜻이다
			if ( a instanceof Dog)
			((Dog)a).getBreed();
			
			System.out.println();
		}
		
//		int a = (int)3.14f;
//		float f = 24.5f;
//		System.out.println((int)f);
		
//		((Dog)animals[0]).getBreed();	
//		
//		Dog d = (Dog)animals[0];
//		Animal aa = d;

	}

}


// bird 클래스를 만드시오
// 짹짹 소리 나게 만드시오










