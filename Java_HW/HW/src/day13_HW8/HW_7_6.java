package day13_HW8;

import java.util.Scanner;

public class HW_7_6 {
	public static void main(String[] args) {
		Season season = new Season();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇월입니까 (1~12) : ");
		int a = sc.nextInt();
		season.printSeason(a);
	}
}
class Season {
	void printSeason(int m) {
		int seas = m/3;
		if((m > 12)||(m < 1)) {System.out.println();}
		else if(seas == 1) {System.out.println("해당 월의 계절은 봄입니다.");}
		else if(seas == 2) {System.out.println("해당 월의 계절은 여름입니다.");}
		else if(seas == 3) {System.out.println("해당 월의 계절은 가을입니다.");}
		else {System.out.println("해당 월의 계절은 겨울입니다.");}
	}
}