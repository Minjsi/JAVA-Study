package day16_HW11;

import java.util.Random;
import java.util.Scanner;

public class HW_7_27 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("a의 행? : ");
		int a1 = sc.nextInt();
		System.out.println("a의 열? : ");
		int a2 = sc.nextInt();
		System.out.println("b의 행? : ");
		int b1 = sc.nextInt();
		System.out.println("b의 열? : ");
		int b2 = sc.nextInt();

			int[][] a = new int[a1][a2];
			int[][] b = new int[b1][b2];
			for (int i = 0; i < a1; i++) {
				for (int j = 0; j < a2; j++) {
					a[i][j] = rand.nextInt(10) + 1;
					b[i][j] = rand.nextInt(10) + 1;
				}
			}
			System.out.println("행렬 a");
			for (int i = 0; i < a1; i++) {
				for (int j = 0; j < a2; j++) {
					System.out.print(a[i][j] + "\t");
				}
				System.out.println();
			}

			System.out.println("행렬 b");
			for (int i = 0; i < b1; i++) {
				for (int j = 0; j < b2; j++) {
					System.out.print(b[i][j] + "\t");
				}
				System.out.println();
			}
			
			int[][] z = new int[a.length][a[0].length];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					z[i][j] = a[i][j] + b[i][j];
				}
			}

			AddMatrix add = new AddMatrix();
			if(add.addMatrix(a, b, z)) {
				System.out.println("행렬 z");
				for (int i = 0; i < z.length; i++) {
					for (int j = 0; j < z[0].length; j++) {
						System.out.print(z[i][j] + "\t");
					}
					System.out.println();
				}
			}else {
				System.out.println(false);
			}
	}
}

class AddMatrix {
	boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		int x1 = x.length;
		int x2 = x[0].length;
		int y1 = y.length;
		int y2 = y[0].length;
		int z1 = z.length;
		int z2 = z[0].length;
		
		if ((x1 == y1) && (x2 == y2)&&(y1 == z1) && (y2 == z2)) {
			return true;
		} else {
			return false;
		}
	}
}