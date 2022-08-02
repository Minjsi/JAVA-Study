package day05_HW2;
import java.util.Random;
import java.util.Scanner;
public class HW_day5 {
	public static void main(String[] args) {
//		2-11
		Random random = new Random();
		int num = 9;
		int num1 = 90;
		System.out.println("한 자리 양의 정수 : "+(random.nextInt(num)+1));
		System.out.println("한 자리 음의 정수 : -"+(random.nextInt(num)+1));
		System.out.println("두 자리 양의 정수 : "+(random.nextInt(num1)+10));
		
//		2-14
		Scanner sc = new Scanner(System.in);
		System.out.println("성을 입력하세요.");
		String lname = sc.next();
		System.out.println("이름을 입력하세요.");
		String fname = sc.next();
		
		System.out.println("안녕하세요."+lname+fname+" 씨");
		
//		3-3
		Scanner scan = new Scanner(System.in);
		System.out.println("큰 수를 입력하세요.");
		int fnum = scan.nextInt();
		System.out.println("작은 수를 입력하세요.");
		int lnum = scan.nextInt();
		
		if (fnum%lnum ==0 ) {
			System.out.println(lnum+"is "+fnum+"의 약수가 맞습니다.");
		}else{
			System.out.println(lnum+"is "+fnum+"의 약수가 아닙니다.");
		}
		
//		3-5
		Scanner sca = new Scanner(System.in);
		System.out.println("정숫값 : ");
		int number = sca.nextInt();
		if(number > 0) {
			System.out.println("값이 양수입니다.");
		}else if(number < 0) {
			System.out.println("값이 음수입니다.");
		}else if(number == 0){
			System.out.println("값이 0입니다.");
		}
		
//		3-7
		Scanner scn = new Scanner(System.in);
		System.out.println("변수 a : ");
		int a = scn.nextInt();
		System.out.println("변수 b : ");
		int b = scn.nextInt();
		
		if (a>b) {
			System.out.println("a가 크다.");
		}else if (a<b) {
			System.out.println("b가 크다.");
		}else {
			System.out.println("a와 b가 같다.");
		}
	}
}
