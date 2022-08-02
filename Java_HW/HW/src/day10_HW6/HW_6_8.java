package day10_HW6;

import java.util.Scanner;

public class HW_6_8 {
	public static void main(String[] args) {

// 6-8
		int[] a = { 22, 57, 11, 32, 91, 32, 70 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 숫자 : ");
		int input = sc.nextInt();

		for (int i1 = 0; i1 < a.length; i1++) {
			System.out.println("a[" + i1 + "] = " + a[i1]);
		}

		for (int i1 = 0; i1 < a.length; i1++) {
			if (input == a[i1]) {
				System.out.println("그 값은 앞에서부터 찾았을 때 a[" + i1 + "] 에 있습니다.");
				break;
			}
		}

		for (int i1 = a.length-1 ; i1 > 0; i1--) {
			if (input == a[i1]) {
				System.out.println("그 값은 뒤에서부터 찾았을 때 a[" + i1 + "] 에 있습니다.");
				break;
			}
		}

	}
}
