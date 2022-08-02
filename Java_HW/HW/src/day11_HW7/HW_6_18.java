package day11_HW7;

import java.util.Arrays;
import java.util.Random;

public class HW_6_18 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = rand.nextInt(5) + 1;
			}
		}

		System.out.println("행렬 a");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("a["+i+"]["+j+"] = " + a[i][j]);
			}
		}System.out.println();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				b[i][j] = rand.nextInt(5) + 1;
			}
		}
		System.out.println("행렬 b");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("b["+i+"]["+j+"] = " + b[i][j]);
			}
		}
		int sum = 0;
		System.out.println("\n두 행렬의 곱은");
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 3; k++) {
					sum += a[i][k] * b[k][j];
				}
			System.out.print(sum+"\t");
			sum = 0;
			}
			System.out.println();
		}
		

	}
}
