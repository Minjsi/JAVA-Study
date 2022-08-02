package day10_HW6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_6_13 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("요소 수 :");
		int num = sc.nextInt();
		int[] a = new int[num];

		// 어레이 생성하고 출력
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(a));
		int i = 0;
		int j = 1;
		do {
			for (i = 0; i < a.length; i++) {
				j = rand.nextInt(num);

				// 변수를 하나 더 만들어서 안 없어지게 보관
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		} while (i == j);
		System.out.println("요소를 섞었습니다.\n" + Arrays.toString(a));
	}
}
