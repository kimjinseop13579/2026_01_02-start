package exam27;

import java.util.List;

public class UnboundedExample {
	public static void printAll(List<?> list) {
		// 어떤 타입의 리스트가 오든 전체 내용을 출력
		for (Object obj : list) {
			System.out.println(obj + "");
		}
		System.out.println();
	}

}
