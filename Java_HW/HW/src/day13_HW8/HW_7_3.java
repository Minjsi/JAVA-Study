package day13_HW8;

import java.util.Scanner;

public class HW_7_3 {
	public static void main(String[] args) {
		Day13HW73 day13hw73 = new Day13HW73();
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a :");
		int a = sc.nextInt();
		System.out.println("정수 b :");
		int b = sc.nextInt();
		System.out.println("정수 c :");
		int c = sc.nextInt();
		
		System.out.println("중간값은 "+day13hw73.med(a, b, c));
	}
}
class Day13HW73 {
	static int med(int a, int b, int c) {
		int mid = b;
		if(b>a) {
			if(a>c) return a;
			else if(b>c) return c;
			else return b;
		}else if(a>c) {
			if(c>b) return c;
			else return b;
		}else if(c>b) {
			if(a>b) return a;
			else return b;
		}else return b;
	}
}