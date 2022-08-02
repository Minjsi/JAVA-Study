package day14_HW9;

import java.util.Scanner;

public class HW_7_9 {
	public static void main(String[] args) {
		int re;
		do {
			ReadPlusGame read = new ReadPlusGame();
			int output = read.readPlusInt();
			System.out.println("반대로 읽으면 ");
			while(output > 0) {
				System.out.print(output%10);
				output /= 10;
			}
			System.out.println("입니다.");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("다시 한번? < yes... 1 / No ... 0 >");
			re = sc.nextInt();
		}while(re == 1);
		System.out.println("종료~ ㅂㅂ");
	}
}

class ReadPlusGame {
	int readPlusInt() {
		Scanner sc = new Scanner(System.in);
		int input;
		do {
			System.out.println("양의 정수를 입력하세요 >> ");
			input = sc.nextInt();
		}
		while(input < 1);
	
		return input;
	}
}
