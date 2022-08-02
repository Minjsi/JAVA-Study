package day19_HW22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

//		QUESTION(#42)
//		
//		좌표평면에서 나이트가 이동할 수 있는 경우의 수를 출력
//		
//		조건
//		1. 좌표 평면은 8*8
//		2. 나이트는 아래의 3,4 조건을 따른다
//		3. 수평으로 두칸 이동한 뒤에 수직으로 한칸 이동하기
//		4. 수직으로 두칸 이동한 뒤에 수평으로 한칸 이동하기
//		5. 행은 1~8로 표현
//		6. 열은 a~h 로 표현

//		입력 : a1
//		출력 : 2

//		BACKGROUND
//		• 구현, implementation
//		• 알고리즘을 소스코드로 바꾸는 과정
//		• 모든 범위의 코딩 문제 유형을 포함하는 개념
//		• 풀이를 떠올리는 것은 쉽지만 코드로 옮기기 어려운 문제

//		문제의 해결결과 에 대한 경우의 수 파악
//		1. 나이트는 ㄱ 또는 ㄴ 으로 움직인다.
//		2. 나이트 위치 기준 4방면 5*5 정사각형의 위치중 대각선에 해당하는 위치로 이동이 가능하다.
//		3. 이 범위를 벗어나서 이동은 불가능하며, 경우의 수에서 제외된다.

		Scanner sc = new Scanner(System.in);

		String[] VerificationX = { "a", "b", "c", "d", "e", "f", "g", "h" }; // 검증용 x축 좌표
		int[] VerificationY = { 1, 2, 3, 4, 5, 6, 7, 8 }; // 검증용 y축 좌표
		String knightX; // 행(x축) 값을 저장용 선언
		int knightY; // 열(y축) 값을 저장용 선언

		do {

			System.out.println("평면의 공간은 8*8입니다.\n행 : " + Arrays.toString(VerificationX) + "\n열 : "
					+ Arrays.toString(VerificationY));
			System.out.print("배치할 나이트의 좌표를 입력하시기 바랍니다. : ");

			String knight = sc.next(); // 나이트의 좌표값 입력
			String[] knightArr = knight.split(""); // 나이트의 좌표값 분해하여 리스트입력
			System.out.println(Arrays.toString(knightArr));
			knightX = knightArr[0]; // 행(x축) 값을 저장
			knightY = Integer.parseInt(knightArr[1]); // String을 int로 변환
														// 열(y축) 값을 저장

		} while (Arrays.toString(VerificationX).contains(knightX) == false
				&& Arrays.asList(VerificationY).contains(knightY) == false);
		// while의 조건

		int knightX2 = Arrays.asList(VerificationX).indexOf(knightX);
		// 문자열 VerificationX 인덱스 값으로 변환 이를 통해 따라서 행은 0~7 까지 번호로 사용
		// 예시) a=0 취급으로 해서 진행

		int[] MoveRowX = { 1, -1, 2, -2 }; // x축 이동 리스트 VerificationX의 인덱스 번호로 쓸 것임
		int[] MoveColumnY = { 1, -1, 2, -2 }; // y축 이동 리스트 VerificationY의 인덱스 번호로 쓸 것임

		int xc = 0; // 나이트 X의 위치값
		int yc = 0; // 나이트 Y의 위치값

		ArrayList<String> VerificationKnightCoordinate = new ArrayList<>(); // 좌표 저장 및 검증용

		int Knightcount = 0;
		
		for (int i : MoveRowX) { //행 이동을 했을시 이동가능한 경우의 수 측정
		if (i == 2) {
			xc = knightX2 + MoveRowX[i];
			yc = knightY + MoveColumnY[0];
	
			if (0 > xc || xc > 7) {
				continue;
			} else if (yc < 1 || yc > 8) {
				continue;
			} else {
				Knightcount++;
				VerificationKnightCoordinate.add(VerificationX[xc]+yc);
			}
		} else if (i == -2) {
			xc = knightX2 + MoveRowX[3];
			yc = knightY + MoveColumnY[0];
			if (0 > xc || xc > 7) {
				continue;
			} else if (yc < 1 || yc > 8) {
				continue;
			} else {
				Knightcount++;
				VerificationKnightCoordinate.add(VerificationX[xc]+yc);
			}
		}
	}
	
	
	
	for (int j : MoveColumnY) { //열 이동을 했을시 이동가능한 경우의 수 측정
		if (j == 2) {
			yc = knightY + MoveColumnY[j];
			xc = knightX2 + MoveRowX[0];
	
			if (0 > xc || xc > 7) {
				continue;
			} else if (yc < 1 || yc > 8) {
				continue;
			} else {
				Knightcount++;
				VerificationKnightCoordinate.add(VerificationX[xc]+yc);
			}
		} else if (j == -2) {
			yc = knightY + MoveColumnY[3];
			xc = knightX2 + MoveRowX[0];
			if (0 > xc || xc > 7) {
				continue;
			} else if (yc < 1 || yc > 8) {
				continue;
			} else {
				
				Knightcount++;
				VerificationKnightCoordinate.add(VerificationX[xc]+yc);
			}
		}
	
	}
	
	for (int i : MoveRowX) { //행 이동을 했을시 이동가능한 경우의 수 측정
		if (i == 2) {
			xc = knightX2 + MoveRowX[i];
			yc = knightY + MoveColumnY[1];
	
			if (0 > xc || xc > 7) {
				continue;
			} else if (yc < 1 || yc > 8) {
				continue;
			} else {
				Knightcount++;
				VerificationKnightCoordinate.add(VerificationX[xc]+yc);
			}
		} else if (i == -2) {
			xc = knightX2 + MoveRowX[3];
			yc = knightY + MoveColumnY[1];
			if (0 > xc || xc > 7) {
				continue;
			} else if (yc < 1 || yc > 8) {
				continue;
			} else {
				Knightcount++;
				VerificationKnightCoordinate.add(VerificationX[xc]+yc);
			}
		}
	}
	
	for (int j : MoveColumnY) { //열 이동을 했을시 이동가능한 경우의 수 측정
		if (j == 2) {
			yc = knightY + MoveColumnY[j];
			xc = knightX2 + MoveRowX[1];
	
			if (0 > xc || xc > 7) {
				continue;
			} else if (yc < 1 || yc > 8) {
				continue;
			} else {
				Knightcount++;
				VerificationKnightCoordinate.add(VerificationX[xc]+yc);
			}
		} else if (j == -2) {
			yc = knightY + MoveColumnY[3];
			xc = knightX2 + MoveRowX[1];
			if (0 > xc || xc > 7) {
				continue;
			} else if (yc < 1 || yc > 8) {
				continue;
			} else {
				
				Knightcount++;
				VerificationKnightCoordinate.add(VerificationX[xc]+yc);
			}
		}
	
	}


		System.out.println("나이트가 이동할 수 있는 위치 : " + VerificationKnightCoordinate);
		System.out.println("나이트가 이동할 수 있는 총 경우의 수 : " + VerificationKnightCoordinate.size());

	}
}
