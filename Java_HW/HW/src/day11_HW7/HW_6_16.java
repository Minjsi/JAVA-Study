package day11_HW7;

import java.util.Random;
import java.util.Scanner;

public class HW_6_16 {
	public static void main(String[] args) {
		int re = 1;
		while(re == 1) {
			Week11 week11 = new Week11(); // 인스턴스 생성?
			
			String a = week11.enter11();
			String b = week11.corr11();
			
			re = week11.answer11(a, b);
			
		}System.out.println("종료합니다 ^^");
	}
}
class Week11 {
	
	Random rand = new Random();	
	int week = rand.nextInt(7)+1;
	
	String corr11() { // 정답 생성
		int a = week;
		if(a == 1) {return "Monday";}
		else if(a == 2) {return "Tuesday";}
		else if(a == 3) { return "Wednesday";}
		else if(a == 4) { return "Thursday";}
		else if(a == 5) { return "Friday";}
		else if(a == 6) { return "Saturday";}
		else if(a == 7) { return "Sunday";}
		else {return "";}
	}
	String enter11() { // 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("해당 요일의 영어 단어를 입력하세요. \n첫글자는 대문자, 나머지는 소문자로 입력하세요.");
		String name = "";
		if(week == 1) {name = "월요일";}
		else if(week == 2) {name = "화요일";}
		else if(week == 3) {name = "수요일";}
		else if(week == 4) {name = "목요일";}
		else if(week == 5) {name = "금요일";}
		else if(week == 6) {name = "토요일";}
		else if(week == 7) {name = "일요일";}
		System.out.println(name+" : ");
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

