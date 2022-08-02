package day09_HW5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class HW_day9 {
	public static void main(String[] args) {

		// 4-30
		Random rand = new Random();
		int quiz = rand.nextInt(100);

		Scanner sc = new Scanner(System.in);

		for (int j = 10; j > 0; j--) {
			System.out.println("남은 횟수 " + j + "회, 어떤 숫자 일까?\n0부터 99사이의 숫자를 맞추세요.");
			int num = sc.nextInt();
			if (num == quiz) {
				System.out.println(j + "회만에 맞추었습니다.");
				break;
			} else if (num > quiz) {
				System.out.println("더 작은 숫자입니다.");
			} else if (num < quiz) {
				System.out.println("더 큰 숫자입니다.");
			}
			if (j == 1) {
				System.out.println("정답은 " + quiz + " Game Over");
			}

		}
		
		// 6-1
		double a[] = new double[4];
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

		// 6-2
		int b[] = new int[5];
		int kk = 0;
		for (int k = 5; k > 0; k--) {
			b[kk] = k;
			kk += 1;
		}
		for (int kkk = 0; kkk < b.length; kkk++) {
			System.out.println("b[" + kkk + "] = " + b[kkk]);
		}

		// 6-3
		double c[] = new double[5];
		int cc = 0;
		for (double k = 1.1; k > 0; k += 1.1) {
			c[cc] = k;
			cc += 1;
			if (cc == 4) {
				break;
			}
		}
		for (int ccc = 0; ccc < c.length; ccc++) {
			System.out.println("b[" + ccc + "] = " + c[ccc]);
		}

		// 6-6
		System.out.println("요소 수  : ");
		int num = sc.nextInt();

		int d[] = new int[num];
		int dd = 0;
		for (int f = 0; f < d.length; f++) {

			System.out.println("개별 요소  : ");
			int num2 = sc.nextInt();

			d[dd] = num2;
			if (dd == (num - 1)) {
				break;
			}
			dd += 1;
		}
		System.out.println("d = " + Arrays.toString(d));

	}
}
