package day2;

import java.util.Scanner;

public class ExPm_switch {
	public static void main(String[] args) {
//		스위치문 기본
//		int a = 2;
//		switch(a) {
//		case 1:
//			System.out.println("A");
//			break;
//		case 2:
//			System.out.println("B");
//			break;
//		case 3:
//			System.out.println("C");
//			break;
//		default :
//			System.out.println("D");

//		사계절 찾기 프로그램
//			int mon = 3;
//			switch(mon/3) {
//			case 1:
//				System.out.println("봅입니다");break;
//			case 2:
//				System.out.println("여름입니다");break;
//			case 3:
//				System.out.println("가을입니다");break;
//			default:System.out.println("겨울입니다");
//			}

//		학점 매기기 스위치프로그램
//			int a = 88;
//			int b = a/10;
//			switch(b) {
//			case 9:
//				System.out.println("A"); break;
//			case 8:
//				System.out.println("B"); break;
//			case 7:
//				System.out.println("C"); break;
//			case 6:
//				System.out.println("D"); break;
//			default:
//				System.out.println("F");
//		}
//		
//		if문으로 하면?
//			int b = 8;
//			if(b < 11 && b > 6) System.out.println("pass");
//			else System.out.println("fail");
//		
		System.out.println("몇월?");
		Scanner sc = new Scanner(System.in);
		String mon = sc.next();
		switch (mon) {
		case "1":
			System.out.println("Jan");
			break;
		case "2":
			System.out.println("Feb");
			break;
		case "3":
			System.out.println("Mar");
			break;
		case "4":
			System.out.println("Apr");
			break;
		case "5":
			System.out.println("May");
			break;
		case "6":
			System.out.println("Jun");
			break;
		case "7":
			System.out.println("Jul");
			break;
		case "8":
			System.out.println("Aug");
			break;
		case "9":
			System.out.println("Sep");
			break;
		case "10":
			System.out.println("Oct");
			break;
		case "11":
			System.out.println("Nov");
			break;
		case "12":
			System.out.println("Dec");
			break;
		default:
			System.out.println("다시입력");

		}
	}
}

//switch(변수){
//case 값1 : 
//    실행문; 
//    break;
//case 값2 : 
//    실행문; 
//    break;  
//default;    
//}
//
//value의 값이 1일 경우 1을 출력하고, 2일 경우는 2를 출력하고, 
//3일 경우는 3을 출력하고, 그 외에는 그 외의 숫자가 출력된다.
//
//break를 제거하면 value가 1일 경우 1일 출력되고 switch문장을 빠져나가는 것이 아니라
//1,2,3, 그외의숫자가 연속해서 실행된다. break문장이 있을 경우와 없을 경우를 
//확실하게 구분할 수 있어야 합니다.
