
package day2;

import java.util.Scanner;

public class ExPm_Scanner {
//	Scanner sc = new Scanner(System.in); // 개체 생성하여 입력받음
// crtl space : scanner 입력하면 다 알아서 해줌
// ctrl shift O : 임포트 모두 실행
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 고르세요.\n1) 빅맥 \n2) 타코 \n3) 백반 \n0) 종료는  0번");
		int menu;
		
		menu = sc.nextInt();
		System.out.println(menu+"를 선택하셨습니다.");
		outerloop:
		while (true) {
			if (menu > 0) {
				System.out.println("메뉴를 고르세요.\n1) 빅맥 \n2) 타코 \n3) 백반 \n0) 종료는  0번");
				menu = sc.nextInt();
				System.out.println(menu+"를 선택하셨습니다.");
				continue;
			}break outerloop;
		}
	}
	
}
