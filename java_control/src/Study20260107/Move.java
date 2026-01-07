package Study20260107;

import java.util.Scanner;

public class Move {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 가로 15 * 세로 13
		int[][] board = { 
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1 }, 
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } 
				};

		int posX = 0;
		int posY = 0;
		while (true) {
			for (int i = 0; i < board.length; i++) {
				for (int k = 0; k < board[i].length; k++) {

					if (board[i][k] == 1)
						System.out.printf("%c", '■');
					else if (board[i][k] == 0)
						System.out.printf(" ");
					else if (board[i][k] == 2) {
						System.out.printf("%c", '♂');
					posX = k;
					posY = i;
					}
				}
				System.out.println();

			}
			char key = scan.nextLine().charAt(0); // 키보드 입력
			
			

			// 이동하기 w 위, s 아래, a 왼쪽, d 오른쪽
			board[posY][posX] = 0;
			
			switch (key) {
			case 'w':
				if(board[posY - 1][posX] != 1)posY --;
				break;
			case 's':
				if (board[posY+1][posX] != 1)posY++;
				break;
			case 'd':
				if (board[posY][posX+1] != 1 )posX++;
				break;
			case 'a':
				if(board[posY][posX-1] != 1)posX--;
				break;
			default:
				System.out.println("올바른 이동키를 입력하세요");
			}
			board[posY][posX] = 2;
		}

	}

	// 2차원 배열
	// 2차원 배열은 1차원 배열에 1차원 배열을 할당하는것이다
	//

//		int[][] arr = new int [3][4];
//		//3의 크기인 1차원 배열에 4의 크기인 1차원 배열을 만듦
//		
//		arr[0][1]=1;
//		arr[0][1]=2;
//		arr[0][2]=20;
//		arr[0][3]=50;
//		
//		
//		for(int a =0; a<arr.length; a++) {
//			for (int b=0; b<arr[a].length; b++) {
//				System.out.println();
//			}
//		}

	// 90~100 A , 80 ~ 89 B , 70~79 C , 나머지 F

//		int score = 35;
//		
//		switch(score/10) {
//		case 10 :
//		case 9 :
//			System.out.println("A");
//			break;
//		case 8 :
//			System.out.println("B");
//			break;
//		case 7 :
//			System.out.println("C");
//			break;
//		
//		}
//		

}
