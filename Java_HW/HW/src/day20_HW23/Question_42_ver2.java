package day20_HW23;

import java.util.Scanner;

public class Question_42_ver2 {
	public static void main(String[] args) {
		// Move 클래스 객체를 만든다.
		Move move = new Move();
		// go 메서드를 실행해서 최종 결과를 출력한다.
		System.out.println("나이트는 " + move.Go() + "가지의 경로로 이동이 가능합니다.");
	}
}

class Move {
	// 나이트가 이동할 수 있는 경로의 경우의 수를 정의하는 메서드
	int night_possible(int x, int y) {
		// 나이트는 총 네 개의 점으로 이동할 수 있다. 각 네 개의 점은 좌표의 증감 정도가 다르므로 각각 if문을 만들어준다.
		// 네 개의 점까지 이동하는 데에 경우의 수는 두 가지이다. 어느 쪽으로 꺾냐에 따라 달라지기 때문.
		// 따라서 if를 통해 경로 이동이 가능하다면, 경우의 수에 2 씩 증가 시킨다.

		// 출력할 경우의 수 초기값 정의
		int possible = 0;

		// 왼쪽 위 대각선
		if ((x - 1) > 0 && (y - 2) > 0) {
			possible += 2;
		}
		// 오른쪽 아래 대각선
		if ((x + 1) < 9 && (y + 2) < 9) {
			possible += 2;
		}

		return possible;
	}

	// 프로그램을 시작하며, 지도를 보여주고 위치 입력을 받는 메서드
	String happyCountry() {
		// 행복 왕국 왕실 정원 출력
		Scanner sc = new Scanner(System.in);
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

		return location;
	}

	// 입력받은 위치 값을 가져와서 경우의 수를 리턴하는 메서드
	int Go() {
		int x;
		int y;
		do {
			String n = happyCountry();
			// 입력 값을 숫자로 변경해서, 좌표가(1,1)부터 시작하여 (8,8)까지 존재하는 것으로 가정한다.
			x = (int) (n.charAt(0)) - 96;
			y = (int) (n.charAt(1)) - 48;
		}while(((x < 1 || x > 8)) || ((y < 1 || y > 8)));
		return night_possible(x, y);
	}
}