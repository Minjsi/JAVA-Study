package day3;

import java.util.Scanner;

public class ExAm_WhileFor {
	public static void main(String[] args) {

//		int a = 0;
//		for (int i = 0; i < 10; i++) {
//			a++;
//			System.out.println(a);
//	}
//	int a;
//	a= 0;
//	while(a < 10) {
//		System.out.print(a + " ");
//		a++;
//	}
//	
//		for (int i = 0; i < 3; i++) {
//			for(int j = 0; j<5; j++) {
//				System.out.println(i + "  " + j);
//			}
//		}
//		int i = -1;
//		while (i < 2) {
//			++i ;
//			int j = -1;
//			while (j < 4) {
//				++j ;
//				System.out.println(i + "  " + j);
//			}
//		}
//		out: // 위치 지정 레이블
//		for(int i = 0; i <10; i++) {
//			for(int j =0; j<10; j++) {
//				if(j == 3) {
//					break out;
//				}
//				System.out.println(i + "  " + j);
//			}
//		}

//		for(int i = 0; i< 10; i++) {
//			if (i % 2 == 0)
//				continue;
//			System.out.print(i + " ");
//		
//		for (int i = 0; i<5;i++) {
//			for(int j =0; j<3; j++) {
//				if(i==2) {
//					 continue;
//				}
//				if(j == 1) {
//					break;
//				}
//				System.out.println("A");
//			}
//		}
//		out: 
//			for (int i = 0; i < 10; i++) {
//				for (int j = 0; j < 5; j++) {
//					if (i == 3 && j == 2) {
//						break out;
//					} else {
//						System.out.println(i + " " + j);
//
//				}
//			}
//		}

	Scanner sc = new Scanner(System.in);
	System.out.println("메뉴를 고르세요.\n1) 빅맥 \n2) 타코 \n3) 백반 \n0) 종료는  0번");
	int menu;
	
	menu = sc.nextInt();
	System.out.println(menu+"를 선택하셨습니다.");
	outerloop:
	while (true) {
		if (menu > 3) {
			System.out.println("잘못 선택 하셨습니다. 다시 고르세요.");
			System.out.println("메뉴를 고르세요.\n1) 빅맥 \n2) 타코 \n3) 백반 \n0) 종료는  0번");
			menu = sc.nextInt();
			System.out.println(menu+"를 선택하셨습니다.");
			continue;
			
		}
		else if (menu > 0) {
			System.out.println("메뉴를 고르세요.\n1) 빅맥 \n2) 타코 \n3) 백반 \n0) 종료는  0번");
			menu = sc.nextInt();
			System.out.println(menu+"를 선택하셨습니다.");
			continue;
		}break outerloop;
		
	}

	
//		///////////////
	}
}
