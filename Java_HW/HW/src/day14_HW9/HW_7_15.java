package day14_HW9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_7_15 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("요소 수 :");
		int len = sc.nextInt();
		int[] a = new int[len];
		
		for(int i=0;i<len;i++) {
			a[i] = rand.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(a));
		SumOf sum = new SumOf();
		System.out.print("모든 요소의 합은 ");
		System.out.print(sum.sumOf(a));
		System.out.print("입니다.");
	}
}

class SumOf{
	int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i<a.length;i++) {
			sum+=a[i];
		}return sum;
	}
}