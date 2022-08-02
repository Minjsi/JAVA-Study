package javaInterface;

public class OverloadingTest {
	public static void main(String[] args) {
		System.out.println();
	
		Print print = new Print();
		
		print.display(10);
		print.display(10, 20);
		print.display(3, 2.5);
		print.display(3, 'a'); // 두 번째, 세 번째 모두 호출 가능
		// char형 데이터라 int형과 double형으로 타입변환이 가능 
	}
}

// 메소드 오버로딩 예시
class Print {
	public void display(int num) {
		System.out.println(num);
	}
	
	public void display(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public void display(int num1, double num2) {
		System.out.println(num1 + num2);
	}
}