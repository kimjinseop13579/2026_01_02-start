package Study20260107;

import java.util.Arrays;
import java.util.Scanner;

public class BingoGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1차원 배열 25의 크기
		// 배열 무작위 숫자 저장하기

		int[] Bingo = new int[25];

		for (int i = 0; i < Bingo.length; i++) {
			Bingo[i] = (int) Math.floor(Math.random() * 100) + 1;
			for (int j = 0; j < i; j++) {
				if (Bingo[i] == Bingo[j]) {
					i--;
					break;
				}
			}
		}
		// 25개의 숫자 빙고판 모양으로 출력하기
		// 5줄 5칸으로 만들기

		// %d - 정수, %f - 실수 , %c- 문자 , %s - 문자열, %o - 8진수, %x - 16진수
		while (true) {
			System.out.println("┌─────┬─────┬─────┬─────┬─────┐");
			for (int i = 0; i < 5; i++) {
				for (int k = 0; k < 5; k++) {
					if (Bingo[i * 5 + k] == 0)
						System.out.printf("│ %3c ", '■');
					else
						System.out.printf("│ %3d ", Bingo[i * 5 + k]);
				}
				if (i == 4)
					System.out.println("│\n└─────┴─────┴─────┴─────┴─────┘");
				else
					System.out.println("│\n├─────┼─────┼─────┼─────┼─────┤");
			}

			// 빙고를 위해 숫자 입력 만들기
			System.out.print("입력 : ");
			int num = sc.nextInt();

			for (int i = 0; i < Bingo.length; i++) {// 배열에서 내가 입력한 숫자 찾기
				if (Bingo[i] == num) {// 입력한 갚이 배열에 있다면
					Bingo[i] = 0; // 화면에 체크표시를 위해 0으로 변경

				}

			}
			// 가로 세로 대각선 빙고확인하기

			int end = 0;// 현재 몇빙고인지
			int row = 0;// 가로 방향 (줄단위) 0의 갯수가 몇개인지 확인
			for (int i = 0; i < 5; i++) {// 줄단위
				row = 0;
				for (int k = 0; k < 5; k++) {// 줄단위
					if (Bingo[i * 5 + k] == 0)
						row++;
				}
				if (row == 5)
					end++;
			}

			// 세로방향 빙고확인
			int col = 0;

			for (int i = 0; i < 5; i++) {
				col = 0;
				for (int k = 0; k < 5; k++) {

					if (Bingo[k * 5 + i] == 0)
						col++;

				}
				if (col == 5)
					end++;
			}

			//대각선 방향 빙고 확인
			int cros = 0;
			int recros = 0;

			for (int i = 0; i < 5; i++) {
				
				for (int k = 0; k < 5; k++) {
					if (i==k) {
					if (Bingo[(i+k)*3] == 0)cros++;
					}
				}
				
				if (Bingo[i*4+4]==0)recros++;
				if (recros==5) end++;
				if (cros == 5)
					end++;
			}

			System.out.println("현재 완성 빙고 : " + end + "줄");
			
			if (end==5 ) {
				System.out.println("5줄 빙고 완성");
				break;
			}
//		System.out.println(Arrays.toString(Bingo));

		}

	}
}
