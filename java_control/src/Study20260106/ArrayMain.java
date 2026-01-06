package Study20260106;

public class ArrayMain {

	public static void main(String[] args) {
		
//		String a = "good";
//		String aa = new String("member");
//		
//		char c = 'a';
//		char[]temp = new char[5];
//		
//		System.out.println(aa+"     "+a);
//		
//		
//		
//		String word = "i like banana";
//		
//		System.out.println(word);
//		
//		System.out.println( word.charAt(4) );
//		
//		System.out.println(word.indexOf('b') );
//		
//		System.out.println( word.substring(2));
//		
//		String name = "이순신-김유신-김춘추-이성계-박문수-박팽년";
//		
//		name.split(name);
//		String[] names =name.split("-"); // "" 내부에 - 기준으로 배열로 나누어라
//		
//		System.out.println( names[0] );
//		System.out.println();
//		
//		// 반복문으로 이름을 전부 출력하세요.(한줄에 하나씩)
//	    for (String Name : names ) {
//	    	if (Name.indexOf('신') != -1 )
//	    		System.out.println(Name);
//	    }
	    
		
	    String[] fruits = {
	    		"사과","딸기","배","수박",
	    		"바나나","복숭아","파인애플","아보카도",
	    		"오렌지","감","한라봉","망고"
	    		};
	    
	    // 문제1. fruits 배열에서 과일 이름이 3자 이상인것만 출력하시오. ( length() )
	    
	    for (String ful : fruits) {
	    	if (ful.length() >= 3)
	    	System.out.println(ful);
	    }
	    
	    // 문제2. fruits 배열에서 딸기와 수박은 제외하고 출력하시오
	    for (String ful : fruits) {
	    	if (!ful.equals("딸기")  &&  !ful.equals("수박") ) {
	    		
	    		System.out.println(ful);
	    	}
	    		
	    }
	    
	    
	    System.out.println("\n\n\n");
	    
	    // 과일을 한줄에 4씩 3줄로 출력할 것이다.
	    
	    
	    for (int i=0; i<fruits.length; i++) {
	    	if (i %4 ==0)
	    		System.out.println();
	    		
	    	System.out.print(fruits[i]+" ");
	    }
	    
	    
	    
	   
		
		
//		int[] arr = new int[5];
//		//arr 은 참조변수이다, 참조변수는 메모리 주소를 저장할수있는변수이다.
//		System.out.println(arr);
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=55;
//		arr[3]=11;
//		arr[4]=99;
//		
//		System.out.println(arr[2]);
//		
//		for(int i=0; i<=arr.length; i++) {
//			System.out.println(arr[i]);
//			}
//		
//		for(int num : arr ) {//향상된 for문
//			if (num > 50)
//			System.out.println(num);
//		}
		
		
	}

}
/*
 *  배열 - 동일한 데이터타입의 데이터 저장공간이 연속적으로 나열되어 있는구조
 * 
 * 
 * 
 */



