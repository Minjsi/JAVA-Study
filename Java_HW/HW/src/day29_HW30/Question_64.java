package day29_HW30;

import java.util.*;

public class Question_64 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// n 과 k를 입력받고 int로 변환하한다.
		System.out.println("nk입력");
		String nk = sc.nextLine();
		String[] nk_arr = nk.split("\\s");
		int n = Integer.parseInt(nk_arr[0]);
		int k = Integer.parseInt(nk_arr[1]);
		// a 배열을 입력 받고 공백을 기준으로 split하여 배열에 넣는다. int a배열을 선언한다.
		System.out.println("a입력");
		String a_input = sc.nextLine();
		String[] a_arr = a_input.split("\\s");
		int[] a = new int[n];
		// b 배열을 입력 받고 공백을 기준으로 split하여 배열에 넣는다. int b배열을 선언한다.
		System.out.println("b입력");
		String b_input = sc.nextLine();
		String[] b_arr = b_input.split("\\s");
		int[] b = new int[n];
		// split되어 String 상태인 a와 b 배열 요소를 int로 바꾸어주는 작업을 한다.
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(a_arr[i]);
			b[i] = Integer.parseInt(b_arr[i]);
		}
		// 객체를 생성하고 결과값을 출력한다.
		Change change = new Change();
		System.out.println(change.max_sum(a, b, n, k));
	}
}
class Change {
	int max_sum(int[] a, int[] b, int n, int k) {
		int maxsum = 0; // 구해야하는 a배열의 최대값
		int max_a = a[0]; // a의 최대 원소 (n-k)개를 구하기 위한 변수 선언
		int max_b = b[0]; // b의 최대 원소 k개를 구하기 위한 변수 선언
		for(int j = n-k ; j > 0; j--) { // a배열에서는 남아있는 n-k개가 큰 값들이어야 한다. 따라서 (n-K)번 for문을 돌린다.
			for (int i = 0; i < n; i++) { // a배열을 돌면서
				if (max_a < a[i]) { // 큰 값을 거른다.
					maxsum += a[i]; // 큰 값은 maxsum에 넣는다.
					a[i] = 0; // 그 값은 0으로 바꿔준다.
				}
			}
		}
		for(int j = k ; j > 0; j--) { // b배열에서는 a로 가는 k개 숫자가 큰 값들이어야 한다. 따라서 k번 for문을 돌린다.
			for (int i = 0; i < n; i++) { // b배열을 돌면서
				if (max_b < b[i]) { // 큰 값을 거른다.
					maxsum += b[i]; // 큰 값은 maxsum에 넣는다.
					b[i] = 0; // 그 값은 0으로 바꿔준다.
				}
			}
		}
		return maxsum; // maxsum 리턴
	}
}