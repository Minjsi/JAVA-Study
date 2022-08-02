package day18_HW21;

import java.util.Arrays;
import java.util.Scanner;

public class Question_40_1 {
	public static void main(String[] args) {
		// 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("n과 k를 입력하세요.");
		String enter = sc.next();

		// split 해서 공백 기준으로 잘라주기
		String[] num = enter.split("\\s");
		
		// 2개 들어가는 배열 만들어주기
		int[] nums = new int[2];

		for (int i = 0; i < 2; i++) {
			nums[i] = Integer.parseInt(num[i]);
		}
		int n = nums[0];
		int k = nums[1];

		System.out.println("n은 " + n + ", k는 " + k + " 입니다.");

		int count = 0;

		while (n > 1) {
			if (n % k == 0) {
				n = n / k;
				count += 1;
			} else {
				n -= 1;
				count += 1;
			}
		}
		System.out.println("총 " + count + "번의 과정을 수행 했습니다.");
	}
}