package day16_HW11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_7_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("요소 수? : ");
		int num = sc.nextInt();
		int[] a = new int[num];

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10) + 1;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

		System.out.println("삭제할 요소의 인덱스? : ");
		int idx = sc.nextInt();

		ArrayRmv16 array = new ArrayRmv16();
		for (int i = 0; i < a.length-1; i++) {
			System.out.println("y[" + i + "] = " + array.arrayRmvOf(a, idx)[i]);
		}
	}
}

class ArrayRmv16 {
	int[] arrayRmvOf(int[] a, int idx) {
		int[] last = new int[a.length - 1];
		for (int i = 0; i < idx; i++) {
			last[i] = a[i];
		}
		for (int i = idx; i < last.length; i++) {
			last[i] = a[i + 1];
		}
		return last;

	}
}