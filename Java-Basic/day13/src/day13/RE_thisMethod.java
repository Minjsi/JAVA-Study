package day13;

public class RE_thisMethod {
	public static void main(String[] args) {
		ThisM13 this13 = new ThisM13();
		System.out.println();
		ThisM13 this13_1 = new ThisM13(3);
	}
}

class ThisM13 {
	ThisM13(){
		System.out.println("첫번째 생성자");
	}
	
	ThisM13(int a){
		this(); // 첫줄에 위치
		System.out.println("두번째 생성자");
	}
}