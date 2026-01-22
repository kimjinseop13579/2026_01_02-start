package exam26;

import java.util.List;

public class LowerBoundExample {
	public static void addIntegers(List<? super Integer> list) {
		for (int i=1; i<=3; i++) {
			list.add(i);//Integer를 안전하게 저장 가능
		}
	}

}
