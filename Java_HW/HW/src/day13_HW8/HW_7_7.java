package day13_HW8;

import java.util.Scanner;

public class HW_7_7 {
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단수 : ");
		int a = sc.nextInt();
		tri.putStart(a);
	}
}
class Triangle {
	void putChar(String c, int n) {
		for(int i = 0; i < n ; i++) {
			System.out.print(c);
		}
	}
	
	void putStart(int n) {
		for(int i = 0; i < n+1; i++) {
			putChar("*", i);
			System.out.println();
		}
	}
}