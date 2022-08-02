package day19_HW22;

import java.util.*;
public class Question_41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// map, move 선언
		int map;
		String move;

		// 지도 칸 수 맞을 때 까지 입력 받음
		do {
			System.out.print("몇 칸 짜리 지도를 만들까요? 1 이상, 100 이하의 숫자를 말하세요. >> ");
			map = sc.nextInt();
		} while (map < 1 && map > 100);

		// 지도 칸 수 만큼 2차원 배열 생성
		int[][] maps = new int[map][map];
		System.out.println(map + " 칸 짜리 지도가 만들어졌습니다.");

		// nextLine으로 공백 입력을 받기 전 입력받았던 모든 값 초기화
		sc.nextLine();
		
		// 계획서 입력 받음
		System.out.println("L : 왼 쪽으로 한 칸\nR : 오른 쪽으로 한 칸\nU : 위로 한 칸\nD : 아래로 한 칸");
		System.out.println("사이에 공백을 넣어 계획서를 완성하세요. \n예시 > U D U L L R D L");
		move = sc.nextLine();
		
		// 공백 기준으로 잘라서 계획서 배열에 입력
		String[] moves = move.split("\\s+");
		
		// 계획서 출력해서 확인
		System.out.println("당신의 여행 계획은 " + Arrays.toString(moves));

		// 현재 위치
		int x = 0;
		int y = 0;
		int now = maps[x][y];

		// 계획에 맞춰 움직인다.
		for (int i = 0; i < moves.length; i++) {
			String go = moves[i];
			if (go.equals("L")) {
				if ((y - 1) > -1) {
					y -= 1;
				}
			} else if (go.equals("R")) {
				if ((y + 1) < map) {
					y += 1;
				}
			} else if (go.equals("U")) {
				if ((x - 1) > -1) {
					x -= 1;
				}
			} else if (go.equals("D")) {
				if ((x + 1) < map) {
					x += 1;
				}
			}
		}

		System.out.println("현재 위치는 " + x + "\t" + y + " 입니다.");

	}
}
