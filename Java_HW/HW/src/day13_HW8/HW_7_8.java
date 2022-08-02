package day13_HW8;

import java.util.Random;
import java.util.Scanner;

public class HW_7_8 {
	public static void main(String[] args) {
		RandomHW randhw = new RandomHW();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("상한값 : ");
		int a = sc.nextInt();
		System.out.println("하한값 : ");
		int b = sc.nextInt();
		System.out.println("상한값 : "+a);
		System.out.println("하한값 : "+b);
		System.out.println("생성한 난수는 "+randhw.random(a, b)+" 입니다.");
	}
}

class RandomHW {
	int random(int a, int b) {
		Random rand = new Random();
		int ran = rand.nextInt(b)+a;
		return ran;
	}
}