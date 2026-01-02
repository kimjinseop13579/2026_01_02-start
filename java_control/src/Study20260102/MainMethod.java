package Study20260102;

public class MainMethod {

	public static void main(String[] args) {
		
	
		// 바이킹 탑승 가능 : 145cm 이상
	    int cm = 160;
		
		if(145 <= cm) {
			System.out.println("바이킹 탑숭 가능");
		}else {
			System.out.println("바이킹 탑승 불가");
		}
		
		int age = 33;
		
		if ((age/10) == 3  ) //30 <= age && age <40
		      System.out.println("30대 이다");
		else 
			System.out.println("20대 이다");
		
		// 주차장의 요금이 기본요금은 1000 원이다
		// 기본시간은 30분이다.
		// 초과시 10 분당 100원씩 추가 예) 39분은 1000원, 40분은 1100원
		// 단 4시간 이상 주차시 기본요금은 2500원 이다.
		// 예 3시간 50분 (230분) -> 1000원
		// 4시간 12분 (252분) -> 2600
		
		

	}

}

/* 제어문
   
   조건문 - if , switch
   
   1.
   if (조건식) {
    조건식이 참일경우 코드;
   }
   2.
   if(조건식){
      조건식이 참일경우 실행하는 코드;
   }else{
       조건식이 거짓일때 실행하는 코드;
   }
   3.
   if(조건식1){
      조건식1이 참인경우 실행
   }else{
   조건식1이 거짓인 경우
          if(조건식2){
          조건식2 가 참인경우 실행
          }
   }
   4.
   if(조건식1){
      조건식1이 참인경우 실행
   }else if(조건식2){
   조건식2가 참인경우 실행
   }else{
   조건식
   }
   
   
   
*/