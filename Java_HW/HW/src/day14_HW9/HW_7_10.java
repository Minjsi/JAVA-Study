package day14_HW9;

import java.util.Random;
import java.util.Scanner;

public class HW_7_10 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		int re = 0;
		do {
			System.out.println("암산 훈련!");
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			int p = rand.nextInt(4);

			int corr = 0;
			int answer = 0;

			do {
				if (answer != corr) {
					System.out.println("틀렸어 이 바보야~~~");
				}
				if (p == 0) {
					System.out.println(x + " + " + y + " + " + z + " = ");
					corr = (x + y + z);
				} else if (p == 1) {
					System.out.println(x + " + " + y + " - " + z + " = ");
					corr = (x + y - z);
				} else if (p == 2) {
					System.out.println(x + " - " + y + " + " + z + " = ");
					corr = (x - y + z);
				} else if (p == 3) {
					System.out.println(x + " - " + y + " - " + z + " = ");
					corr = (x - y - z);
				}
				answer = sc.nextInt();
			} while (answer != corr);
			System.out.println("정답정답\n다시 한번? <yes...1 / No...0>");
			re = sc.nextInt();
		} while (re == 1);
		System.out.println("바이 바이 ");
	}
}
