package day13;

public class RE_instance {
	public static void main(String[] args) {
		Ins13A a = new Ins13A(); // 클래스명 객체명 = new 생성자명();
		System.out.println(a.m);
		a.print();
		
		System.out.println(a.n);
		
		a.work1();
	}
}

class Ins13A {
	int m = 3; // 필드, 전역변수
	int n = 4;
	
	void print() {
		System.out.println("create and use instance!!!");
	}
	
	void work1() {
		int k = 5; // 지역 변수
		System.out.println(k);
		work2(2);
	}
	
	void work2(int i) {
		int j = 4; // 지역 변수
		System.out.println(i + j);
	}
}