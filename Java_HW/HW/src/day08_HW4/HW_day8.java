package day08_HW4;

import java.util.Scanner;

public class HW_day8 {
public static void main(String[] args) {
//	4-22
	Scanner sc1 = new Scanner(System.in);
	System.out.println("단수는? : ");
	int num = sc1.nextInt();
	
	String star = "*";
	for(int i = 0 ; i < num ; i++) {
		for(int j = 0 ; j < i+1 ; j++) {
		System.out.print(star);
	}System.out.println();
	}
	
//	4-25
	Scanner sc2 = new Scanner(System.in);
	System.out.println("소수로 판별할 숫자를 입력하세요. : ");
	int pos = sc2.nextInt();
	for(int i = 2 ; i < pos ; i++) {
	if(pos % i == 0) {
		System.out.println("소수가 아닙니다.");
		break;
	}else {System.out.println("소수가 맞습니다.");break;}
	}
	
//	4-26
	Scanner sc3 = new Scanner(System.in);
	System.out.println("정수를 더합니다.");
	
	System.out.println("몇 개를 더할까요?");
	int sumnum = sc3.nextInt();
	int sum = 0;
	int avg = 0;
	for(int i = 1; i < sumnum+1 ; i++) {
		System.out.println("정수(0으로 종료) : ");
		int posnum = sc3.nextInt();
		
		sum += posnum;
		avg = sum/i;
		if (posnum ==0) {avg = sum/(i-1); break;}
	}System.out.println("합계는 "+sum+" 입니다.");
System.out.println("평균은 "+avg+" 입니다.");
	
	

// 4-27
Scanner sc4 = new Scanner(System.in);
System.out.println("정수를 더합니다.");

System.out.println("몇 개를 더할까요?");
int sumnum2 = sc4.nextInt();
int sum2 = 0;
int avg2 = 0;
for(int i = 1; i < sumnum2+1 ; i++) {
	System.out.println("1000이하의 정수 : ");
	int posnum2 = sc4.nextInt();
	
	sum2 += posnum2;
	avg2 = sum2/i;
	if (sum2>1000) {
		sum2 -= posnum2; 
		avg2 = sum2/(i-1); 
		System.out.println("마지막 값은 무시합니다.");
		break;
		}
}
System.out.println("합계는 "+sum2+" 입니다.");
System.out.println("평균은 "+avg2+" 입니다.");

//	4-28
Scanner sc5 = new Scanner(System.in);
System.out.println("음수가 아닌 정수를 더합니다.");

System.out.println("몇 개를 더할까요?");
int sumnum3 = sc5.nextInt();
int sum3 = 0;
int avg3 = 0;

for(int i = 1; i < sumnum3+1 ; i++) {
	System.out.println("정수 : ");
	int posnum3 = sc5.nextInt();
	
	sum3 += posnum3;
	avg3 = sum3/sumnum3;
	if (posnum3 < 0) {
		sum3 += -posnum3; 
		i -= 1;
		System.out.println("음수는 더하지 않습니다.");
		}
}
System.out.println("합계는 "+sum3+" 입니다.");
System.out.println("평균은 "+avg3+" 입니다.");

	
	
	
//	
}
}
