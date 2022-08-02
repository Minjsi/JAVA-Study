package day3;

import java.util.Scanner;
import java.util.Random;

public class ExPm_game2 {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력하세요 >>> ");
//		int number = sc.nextInt();
//		int score = number/10; //점수 앞자리 수 파악
//		int score2 = number %10;
//		String[] list =  {"D","C","B","A"};
//		String[] list2 =  {"-","-","-","0","0","0","+","+","+"};
//		try {
//		System.out.println("당신의 점수는  " +number+" 이고 학점은 "+ list[score-6]+list2[score2-1]+" 입니다.");
//		}catch(Exception e) {
//			System.out.println("당신의 점수는  " +number+" 이고 학점은  F입니다.");
//		}
////		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수 1번을 입력하세요 >>> ");
//		int num1 = sc.nextInt();
//		System.out.println("점수 2번을 입력하세요 >>> ");
//		int num2 = sc.nextInt();
//		if (num1>num2) {
//			System.out.println(num1+" 크다.");
//		}else if (num1<num2) {
//			System.out.println(num2+" 크다.");
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 100~999 사이의 숫자를 입력하세요 >>> ");
//		int num = 0;
//		do {
//			num = sc.nextInt();
//		} while( num > 999 && num < 100);
//		System.out.println(num);
		
		
		
//		if(num1 > num2) {int t = num1; num1 = num2; num2 = t;}
//		if(num2 > num3) {int t = num2; num2 = num3; num3 = t;}
//		if(num1 > num2) {int t = num1; num1 = num2; num2 = t;}
//		System.out.println(num1+ " "+num2+ " "+num3);
//		
		
		
//		int[] list =  {};
//		
//		for(int i=0;i<3;i++) {
//			System.out.println("정수"+(i+1)+"번을 입력하세요 >>> ");
//			int num1 = sc.nextInt();
//			list[i+1] = num1;
//		}
//		Arrays.sort(list);
//		System.out.println(list[1]+ list[1]+ list[2]);
		
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int machine = rand.nextInt(90)+10;
		int you = 0;
		
		do {
			System.out.println("숫자를 맞춰보세요");
			you = sc.nextInt();
			if(machine> you) {System.out.println("더 큰 숫자입니다.");}
			if(machine< you) {System.out.println("더 작은 숫자입니다.");}
		}while(you != machine);
		System.out.println("정답입니다.");
		
		
		
		

//		////////////////////////////////////////////////////////////
	}

}
