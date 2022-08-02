package day16_HW11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_7_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("요소 수? : ");
		int num = sc.nextInt();
		int[] a = new int[num];

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10) + 1;
		}
		System.out.println(Arrays.toString(a));

		System.out.println("탐색할 값? : ");
		int find = sc.nextInt();

		Array16 array = new Array16();
		System.out.println(Arrays.toString(array.arraySrchIdx(a, find)));
	}
}

class Array16 {
	int[] arraySrchIdx(int[] a, int b) {

		System.out.println("일치하는 요소의 인덱스는  ");

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				sum += 1;
			}
		}
		int[] corr = new int[sum];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				corr[index] = i;
				index += 1;
				}
			}
		return corr;
	}
}