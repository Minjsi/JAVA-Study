package day13;

public class RE_this {
	public static void main(String[] args) {
		This13  this13 = new This13();
		this13.init(3, 5);
		this13.work();
		System.out.println(this13.m);
		System.out.println(this13.n);
	}
}
/*
 * 모든 매서드는 자신이 포함된 클래스의 객체를 가리키는 this 참조 변수가 있다.
 * this를 따로 붙여주지 않아도 java가 알아서 붙여줌
 */

class This13 { // 생성자는 java가 자동으로 기본 작성!!!!
	int m;
	int n;

	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;
		this.n = b;
	}
	
	void work() {
		init(14,  3);
	}
}