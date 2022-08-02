package day10_HW6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_6_14 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("요소 수 :");
		int num = sc.nextInt();
		int[] a = new int[num];
		int[] b = new int[num];

		// 어레이 생성하고 출력
		for (int i = 0; i < num; i++) {
			a[i] = rand.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < num; i++) {
			b[i] = a[(num-1) - i];
		}
		System.out.println("a의 모든 요소를 역순으로 복사했습니다.\n" + Arrays.toString(b));
	}
}
