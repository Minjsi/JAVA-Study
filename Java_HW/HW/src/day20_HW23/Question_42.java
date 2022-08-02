package day20_HW23;

import java.util.Arrays;
import java.util.Scanner;

public class Question_42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 행복 왕국 왕실 정원 출력
		System.out.println("~ 행복 왕국 왕실 정원에 오신 것을 환영합니다. ~");
		for (int x = 97; x < 105; x++) {
			for (int y = 1; y < 9; y++) {
				char ch = (char) x;
				System.out.print(ch);
				System.out.print(y + "\t");
			}
			System.out.println();
		}

		// 나이트의 위치 값을 입력받음
		System.out.print("나이트는 어디에 있나요?? >>");
		String location = sc.next();

		// 입력 값을 숫자로 변경해서, 좌표가(1,1)부터 시작하여 (8,8)까지 존재하는 것으로 가정한다.
		int x = (int) (location.charAt(0)) - 96;
		int y = (int) (location.charAt(1)) - 48;

		// 나이트는 총 네 개의 점으로 이동할 수 있다. 각 네 개의 점은 좌표의 증감 정도가 다르므로 각각 if문을 만들어준다.
		// 네 개의 점까지 이동하는 데에 경우의 수는 두 가지이다. 어느 쪽으로 꺾냐에 따라 달라지기 때문.
		// 따라서 if를 통해 경로 이동이 가능하다면, 경우의 수에 2 씩 증가 시킨다.

		// 출력할 경우의 수 초기값 정의
		int possible = 0;

		// 왼쪽 위 대각선
		if ((x - 1) > 0 && (y - 2) > 0) {
			possible += 1;
		}
		// 오른쪽 아래 대각선
		if ((x + 1) < 9 && (y + 2) < 9) {
			possible += 1;
		}

		System.out.println("나이트는 " + possible + "가지의 경로로 이동이 가능합니다.");

	}

}