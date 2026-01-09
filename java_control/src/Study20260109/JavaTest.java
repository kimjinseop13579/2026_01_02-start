package Study20260109;

public class JavaTest {

	public static void main(String[] args) {
		//문제 1
		
		String name = "홍길동";
		int age = 25;
		double cm = 175.5;
		String gender = "남";
		boolean student = true;
		
		System.out.println("이름 :"+name+"\n나이 :"+age+"\n키 :"+cm+"\n성별 :"+gender+"\n학생여부 :"+student);
		
		System.out.println();
		//문제 2
		
		int a=10;
		int b=20;
		
		int c = 0;
		if (a < b) {
			c=b;
			b=a;
			a=c;
			System.out.println("a :"+a);
			System.out.println("b :"+b);
		}
		System.out.println();
		
		//문제 3
		
		int width = 8;
		int high =5;
		
		int extent = width*high;
		
		System.out.println("넓이 :"+extent);
		
		System.out.println();
		//문제 4
		
		int kor = 85;
		int eng = 90;
		int mat = 78;
		
		int add = kor+eng+mat;
		int ave = add/3;
		
		System.out.println("총점 :"+add+" 평균 :"+ave);
		
		System.out.println();
		
		//문제 5
		
		int num = 3726;
		int minute1 = 3726 / 60;
		int minute = 0;
		int second =0;
		
		second = num %60;
		minute = minute1%60;
		int hour = minute1/60;
		
		System.out.println("시간"+hour+" "+minute+"분 "+second+"초");
		
		System.out.println();
		
		// 문제 6번 
		
		int score =59;
		if(score>=60)
			System.out.println("합격");
		else 
			System.out.println("불합격");
		
		System.out.println();
		
		// 문제 7번
		
		
		if (score>=90)
			System.out.println("학점 : A");
		else if (score>=80)
			System.out.println("학점 : B");
		else if (score>=70)
			System.out.println("학점 : C");
		else if (score>=60)
			System.out.println("학점 : D");
		else
			System.out.println("학점 : F");
		
		System.out.println();

		//문제 8번
		
		int n =10;
		int n1 = 0;
		for (int i=1; i<=n; i++) {
			n1 +=i;
			if (i == n) {
				System.out.println(i+" = "+n1);
			}else
			System.out.print(i+" + ");
		}
		
		System.out.println();
		//문제 9번
		
		int[] arr = {10,20,30,40,50};
		int arrAdd =0;
		
		for (int i=0; i<arr.length; i++ ) {
			arrAdd += arr[i];
		}
		int arrAve = arrAdd/arr.length;
		System.out.println("합 :"+arrAdd+"\n평균 :"+arrAve);
		
		System.out.println();
		
		//문제 10
		
		int[] scores = {87,65,92,100,74};
		int max = scores[0];
		int min = scores[0];
		
		for (int i=0; i<scores.length; i++) {
			if (max <scores[i]) 
				max = scores[i];
			
			if (min > scores[i])
			min = scores[i];
				
		}
		
		System.out.println("최대값 :"+max);
		System.out.println("최소값 :"+min);
		
		System.out.println();
		
		// 문제 11
		int[] nums = {3,8,15,22,7,10};
		int result = 0;
		for(int i=0; i<nums.length; i++) {
			if (nums[i] % 2 == 0)
				result += nums[i];
			else
				result -= nums[i];
		}
		System.out.println("result = "+result);
		
		// 중급 문제 1
		System.out.println();
		
		int[] monthlySales = {1200,950,1430,800,1600,1700,900,1100,1550,1800,1300,2000};
		
		
		int monthAdd = 0;
		int monthMax =monthlySales[0];
		int monthMaxMonth = 0;
		int monthMin =monthlySales[0];
		int monthMinMonth = 0;
		int monthaveCount =0;
		
		for (int i=0; i<monthlySales.length; i++) {
			monthAdd+=monthlySales[i];
			
			if (monthMax<monthlySales[i]) {
				monthMax=monthlySales[i];
				monthMaxMonth = i+1;
			}
			if(monthMin>monthlySales[i]) {
				monthMin = monthlySales[i];
				monthMinMonth = i+1;
			}
		}
		
		int monthAve =monthAdd/monthlySales.length;
		
		for (int i=0; i<monthlySales.length; i++) {
			if(monthlySales[i]>=monthAve) {
				monthaveCount++;
			}
		}
		System.out.println("연간 총매출 : "+monthAdd+"만원");
		System.out.println("월 평균매출 : "+monthAve+"만원");
		System.out.println("최고 매출 :"+monthMax+"원 "+monthMaxMonth+"월");
		System.out.println("최저 매출 :"+monthMin+"원 "+monthMinMonth+"월");
		System.out.println("평균 이상 매출인 월의 개수 :"+monthaveCount+"개");
		
		System.out.println();
		
		//중급문제 2
		
		int[] attendance = {1,1,2,1,3,1,2,3,1,1,1,2,3,3,1};
		
		int att =0; //출석
		int late =0; // 지각
		int abs =0; // 결석
		int attScore =0;
		
		for (int i=0; i<attendance.length; i++) {
			if(attendance[i] == 1) 
				att ++;
			else if (attendance[i]==2)
				late ++;
			else
				abs++;
		}
		attScore = att-abs;
		System.out.println("출결점수 :"+attScore);
		
		if(attScore<=8 || abs>=3)
			System.out.println("출결 위험");
		
		System.out.println();
		
		//중급문제 3
		
		int[] dayCounsel = {12,8,15,15,3,9,20};//일주일 일별 상담수
		int[] dayContract = {2,1,3,0,0,1,4};// 일주일 일별 계약수
		int[] dayClaim = {0,1,0,2,1,0,3};//일주일 일별 클래임수
		char[] day = {'월', '화','수','목','금','토','일'};
		
		int addDayCou=0;// 상담 총합
		int addDayCon=0;// 계약 총합
		int addDayCla=0;// 클래임 총합
		
		int rate = 0;
		int bestRate = 0; //최고 전환율
		char bestRateDay = 0;//최고 전환율 요일
		
		char bestPoint1 =0;
		char bestPoint2 =0;
		int dayPoint = 0;
		
		
		
		for (int i=0; i<dayCounsel.length; i++) {
			addDayCou += dayCounsel[i];
			addDayCon += dayContract[i];
			addDayCla += dayClaim[i];
			
			rate=(dayContract[i]*100)/dayCounsel[i];
			
			if (bestRate<rate) {
				bestRate=rate;
				bestRateDay = day[i];
			}
			
			dayPoint = (dayContract[i]*5)+(dayCounsel[i])-(dayClaim[i]*4);
			
			
			
			
				
			
		}
		
		
		//총합요약
		System.out.println("주간상담 총합 : "+addDayCou+" 회\n주간 계약 총합 : "+addDayCon+" 회\n주간클래임 총합 : "+addDayCla+"회");
		System.out.println();
		
		//전환율 최고 요일
		System.out.println("전환율 최고 요일 :"+bestRateDay+"요일 ("+bestRate+")");
		System.out.println();
		
		//위험요일
		System.out.println("위험요일 :");
		for(int i=0; i<dayCounsel.length; i++) {
			
			if (dayClaim[i]>=2 ||((dayCounsel[i]>=10)&&(dayContract[i]==0))) {
				System.out.println(day[i]+"요일");
				
			}
		}
		
		
		//베스트 2 일
		
		
		
		
	}

}
