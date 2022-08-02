package day16_HW11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_7_25 {
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
		System.out.println("삭제할 요소의 개수? : ");
		int idxNum = sc.nextInt();

		ArrayRmvOfN16 array = new ArrayRmvOfN16();
		for (int i = 0; i < a.length-idxNum; i++) {
			System.out.println("y[" + i + "] = " + array.arrayRmvOfN(a, idx, idxNum)[i]);
		}
	}
}

class ArrayRmvOfN16 {
	int[] arrayRmvOfN(int[] a, int idx, int n) {
		int[] last = new int[a.length - n];
		for (int i = 0; i < idx; i++) {
			last[i] = a[i];
		}
		for (int i = idx; i < last.length; i++) {
			last[i] = a[i + n];
		}
		return last;

	}
}