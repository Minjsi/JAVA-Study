package day13_HW8;

import java.util.Scanner;

public class HW_7_4 {
	public static void main(String[] args) {
		HWSum hwsum = new HWSum();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 a까지의 합을 구하자.\na를 입력하세요");
		int a = sc.nextInt();
		
		System.out.println("1부터 "+a+"까지의 합은 "+hwsum.sumUp(a)+"입니다.");
}
}
class HWSum {
	int sumUp(int n) {
		int sum = 0;
		for(int i = 1 ; i < n+1 ; i++) {
			sum += i;
		} 
		return sum;
		}
	}