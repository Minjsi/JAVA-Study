package day29_HW30;

import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("nk입력");
		String nk = sc.nextLine();
		String[] nk_arr = nk.split("\\s");
		int n = Integer.parseInt(nk_arr[0]);
		int k = Integer.parseInt(nk_arr[1]);

		System.out.println("a입력");
		String a_input = sc.nextLine();
		String[] a_arr = a_input.split("\\s");
		int[] a = new int[n];

		System.out.println("b입력");
		String b_input = sc.nextLine();
		String[] b_arr = b_input.split("\\s");
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(a_arr[i]);
			b[i] = Integer.parseInt(b_arr[i]);
		}
		
		int maxsum = 0;
		int max_a = a[0];
		int max_b = b[0];
		for(int j = n-k ; j > 0; j--) {
			for (int i = 0; i < n; i++) {
				if (max_a < a[i]) {
					maxsum += a[i];
					a[i] = 0;
				}
			}
		}
		
		for(int j = k ; j > 0; j--) {
			for (int i = 0; i < n; i++) {
				if (max_b < b[i]) {
					maxsum += b[i];
					b[i] = 0;
				}
			}
		}
		
		System.out.println(maxsum);
	}
}