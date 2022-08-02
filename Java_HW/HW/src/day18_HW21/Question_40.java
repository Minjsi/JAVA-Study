package day18_HW21;

import java.util.Random;
import java.util.Scanner;

public class Question_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하세요");
		int n = sc.nextInt();

		Random rand = new Random();
		int k = rand.nextInt(9) + 1;
		System.out.println("n은 " + n + ", k는 " + k + " 입니다.");

		int count = 0;
		
		while(n > 1) {
		if (n % k == 0) {
			n = n / k;
			count += 1;
		} else {
			n -= 1;
			count += 1;
		}
		}
		System.out.println("총 " + count + " 번의 과정을 수행 했습니다.");
	}
}