package test;
import java.util.*; // Scanner 사용을 위해  import 해준다
public class test5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // Scanner 사용
	System.out.print("Input : x = "); // input x는
	String x = sc.next(); // 사용자에게 x를 String으로 입력 받는다.
	
	Palindrome pal = new Palindrome(); // 회문을 판별하는 클래스로 객체 생성한다.
	System.out.println("output : "+ pal.check(x)); // boolean 형태를 입력받아 프린트한다.
}
}

class Palindrome { // 회문 판별하는 클래스
	boolean check(String x) { // 사용자에게 입력받은 x를 입력값으로, boolean을 return값으로 가진다.
		 int check = 0; // 회문이 맞으면 0, 틀리면 1로 나타내기 위해 check값을 0 으로 초기화한다.
	        char[] x_array = new char [10000]; // x를 배열로 바꾸기 위한 선언
	        x_array = x.toCharArray(); // x를 배열로 바꾸어 준다.
	        for(int i =0;i<x.length()/2;i++) { // 입력받은 x 길이의 절반만큼 for문을 루프한다.
	            if(x_array[i] != x_array[x.length()-i-1]) // array의 i번째와 끝자리가 같지 않다면
	                check = 1; // 회문이 아니므로 check를 1로 바꾼다.
	        }
	        if(check == 0) // check가 그대로 0이면
	            return true; //true를 리턴,
	        else // 아니면
	            return false; // false를 리턴
	}
}