package day04_HW1;

import java.util.Scanner;

public class HW_day4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력하세요");
		int input = sc.nextInt();
		System.out.println(input+"를 입력했습니다.");
		System.out.println("10 더한 값 : "+(input+10));
		System.out.println("10 뺀 값 : "+(input-10));
		
		int last1 = input/10;
		int last2 = input%10;
		System.out.println("마지막 자릿수를 제외한 값은 "+last1);
		System.out.println("마지막 자릿수는 "+last2);
		
	}
	}