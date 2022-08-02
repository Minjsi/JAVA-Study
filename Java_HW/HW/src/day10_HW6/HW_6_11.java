package day10_HW6;

import java.util.Random;
import java.util.Scanner;

public class HW_6_11 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.println("요소 수 : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		a[0] = 1 + rand.nextInt(10);

		for (int i = 1; i < n; i++) {
			do {
				a[i] = 1 + rand.nextInt(10);
			} while (a[i] == a[i - 1]); // 핵심 !!!!!! 같지 않다는 조건으로 반복 !!!
		}

		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
