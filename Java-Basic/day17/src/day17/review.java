package day17;

public class review {
public static void main(String[] args) {
	D d = new D();
	
	d.print();
	d.print(3);
	d.print(5.8);
	d.print("안녕");
}
}

class D{
	void print() {
		System.out.println("입력값이 없습니다");
	}
	void print(int a) {
		System.out.println(a);
	}
	void print(double a) {
		System.out.println(a);
	}
	void print(String a) {
		System.out.println(a);
	}
}