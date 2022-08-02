package day06_HW3;

import java.util.Scanner;

public class HW_day6 {
public static void main(String[] args) {
//	3-15
	Scanner sc = new Scanner(System.in);
	System.out.println("첫번째 정수를 입력하세요");
	int num1 = sc.nextInt();
	System.out.println("두번째 정수를 입력하세요");
	int num2 = sc.nextInt();
	System.out.println("두번째 정수를 입력하세요");
	int num3 = sc.nextInt();
	
	int min;
	min = num1;
	if (num1 > num2) {min = num2;}
	if (num2 > num3) {min = num3;}
	if (num3 > num2) {min = num2;}
	if (num3 > num1) {min = num1;}
	if (num1 > num3) {min = num3;}
	
	System.out.println("최솟값은 "+min);
	
//	3-21
	System.out.println("몇월입니까?");
	int sea = sc.nextInt();
	String season = "겨울";
	if (sea / 3 == 1) {season = "봄";}
	if (sea / 3 == 2) {season = "여름";}
	if (sea / 3 == 3) {season = "가을";}
	System.out.println(season+"입니다.");
	
//	4-2
	System.out.println("세자리 수 입력하세요");
	int num = sc.nextInt();
	while((num<100)||(num>999)) {num = sc.nextInt();}
	System.out.println("입력한 값은 "+num+"입니다.");
	
//	4-14
	System.out.println("몇까지 더할까요");
	int sumnum = sc.nextInt();
	int sum=0;
	for (int i=0; i<(sumnum+1);i++) {sum += i;} 
	System.out.println(sumnum+" 까지의 합은 "+sum);
	
//	4-21
	System.out.println("정방형을 표시합니다. 단수는 몇으로 하시겠습니까?");
	int dan = sc.nextInt();
	int j =0;
	while(j < dan) {
	for(int i=0;i<dan;i++) {System.out.print("*");}
	j += 1;
	}
	
	
}
}
