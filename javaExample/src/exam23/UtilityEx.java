package exam23;

public class UtilityEx {

	// 반환 타입 앞에 <T>를 붙여 제네릭 메서드임을 선언 
	public static void main(String[] args) {
		String[] strArray = {"java","python","C++"};
		Integer[] intArray = {1,2,3,4,5};
		
		Utility.printArray(strArray);
		Utility.printArray(intArray);
		
	}

}
