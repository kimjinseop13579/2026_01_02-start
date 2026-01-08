package Study20260108;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 이정도 까지는 해야 된다 - 배열 실습

		// 문제 1. 10개의 무작위 정수 값 저장하기(배열에)
		// 랜덤 범위는 1~ 50

//		int[]num = new int[10];
//		
//		for (int i=0; i<num.length; i++) {
//			num[i]= (int)Math.floor(Math.random()*50)+1;
//			System.out.println((i+1)+". "+num[i]);
//		}
//		for(int n:num)
//			System.out.println(n);
//		
		// System.out.println(Arrays.toString(num));

		// 문제.2
		// int[] score = {99,66,77,56,78,98,83}
		// 1학년 3반 학생들의 성적을 배열에 저장하였다.
		// 3반 학생들 성적의 평균값을 구하세요
		// 반복문을 이용하여 하세요

//		int[] score = { 99, 66, 77, 56, 78, 98, 83 };
//		int add = 0;
//		
//		for (int i = 0; i < score.length; i++) {
//			add += score[i];
//			//add= add+score[i];
//		}
//		int ave = add / score.length;
//		
//		System.out.println("3반 학생 성적의 총합 : " + add);
//		System.out.println("3반 학생의 점수 평균 : " + ave);
		
		// 문제3. 정수 10개를 저장할수 있는 배열 선언
		//       1~50까지의 무작위값 저장 하기
		//       배열의 첫번째 값과 마지막 값 출력
		
//		int[] num = new int[10];
//		
//		for(int i=0; i<num.length; i++) {
//			num[i] = (int)Math.floor(Math.random()*50)+1;
//			
//			
//		}
//		System.out.println("배열의 첫번째 숫자 :"+num[0]);
//		System.out.println("배열의 마지막 숫자 :"+num[num.length-1]);
//		
//		//문제 4번 문제 3번의 배열에 저장된 무작위 정수 중 짝수에 해당되는 정수만 출력하시오
//		
//		for(int i=0; i<num.length; i++) {// for (int n:num)
//			if (num[i]%2 ==0) {
//				System.out.println(num[i]);// for (int n:num)식으로 했을때 println(n)
//				                               //만 하여도 결과가 출력된다.
//			}
//		}
		
		//문제 5. 마지막
		//  int[]temp = { 6, 0, 5, -2, 0, 4, 8, 0, }
		//   temp 배열은 일별 최고기온을 저장한 것이다.
		//    배열에 저장된 기온중 가장 높은 기온과 가장 낮은 기온을 찾으시오
		//      0번 인덱스의 기온은 12월 11일  데이터이다
		//     가장 높은 기온의 날짜와 가장 낮은 기온의 날짜도 출력하시오
		//    ( 가장 높은 기온, 가장 낮은 기온 만 찾아서 출력하는 것만 해도 성공)
		
		// 힌트 int max = temp[0];
		//    int  min = temp[0];
		
		int[] temp = {6,0,5,-2,0,4,8,0};
		
		int max = temp[0];
		int min = temp[0];
		int day = 0;
		for(int i=0; i<temp.length; i++) {
			day = i+11;
			if (max < temp[i]) max = temp[i];
			
			if(min>temp[i]) min = temp[i];
		}
		System.out.println("가장 높은 기온"+max);
		System.out.println("가장 낮은 기온"+min);
		
		
		
		//      0번 인덱스의 기온은 12월 11일  데이터이다
		//   가장 높은 기온은 몇번째 인덱스에 있는지 찾아야 한다.
		for(int i=0; i<temp.length; i++) {
			if (temp[i]==max){
			System.out.println("가장 높은 기온 : "+max+" 날짜 : 12월 "+(i+11)+"일");
			}
			if (temp[i]==min){
			System.out.println("가장 낮은 기온 : "+min+" 날짜 : 12월 "+(i+11)+"일");
			}
		}
		
		int maxDay = Arrays.asList(temp).indexOf(max);
		int minDay = Arrays.asList(temp).indexOf(min);
		System.out.println("가장 높은 기온 : "+max+" 날짜 : 12월 "+maxDay+"일");
		System.out.println("가장 낮은 기온 : "+min+" 날짜 : 12월 "+minDay+"일");

	}

}
