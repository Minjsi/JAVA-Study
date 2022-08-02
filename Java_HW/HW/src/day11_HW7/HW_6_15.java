package day11_HW7;

import java.util.Random;
import java.util.Scanner;

public class HW_6_15 {
	public static void main(String[] args) {
		int re = 1;
		while(re == 1) {
			Season11 season11 = new Season11(); // 인스턴스 생성?
			
			String a = season11.enter11();
			String b = season11.corr11();
			
			re = season11.answer11(a, b);
			
		}System.out.println("종료합니다 ^^");
	}
}
class Season11 {
	
	Random rand = new Random();	
	int month = rand.nextInt(12)+1;
	
	String corr11() { // 정답 생성
		int a = month;
		if(a == 1) {return "January";}
		else if(a == 2) {return "February";}
		else if(a == 3) {return "March";}
		else if(a == 4) {return "April";}
		else if(a == 5) {return "May";}
		else if(a == 6) {return "June";}
		else if(a == 7) {return "July";}
		else if(a == 8) {return "August";}
		else if(a == 9) {return "September";}
		else if(a == 10) {return "October";}
		else if(a == 11) {return "November";}
		else if(a == 12) {return "December";}
		else {return "";}
	}
	String enter11() { // 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("해당 월의 영어 단어를 입력하세요. \n첫글자는 대문자, 나머지는 소문자로 입력하세요.");
		System.out.println(month+" : ");
		String enter = sc.next();
		return enter;
	}
	
	int answer11(String a, String b) {
		Scanner sc1 = new Scanner(System.in);
		
		while(!a.equals(b)) { // 맞을 때 까지 입력 받아
			a = enter11();
		}System.out.println("정답입니다. 다시 한번?\n 1.. yes\n 0.. no");
		int ans = sc1.nextInt();
		return ans;
		
	}
}