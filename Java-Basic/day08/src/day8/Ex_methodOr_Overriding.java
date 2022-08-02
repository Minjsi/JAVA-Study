package day8;

public class Ex_methodOr_Overriding {
public static void main(String[] args) {
/*
 * 매서드 오버라이딩 method overriding
 * 메서드 덮어쓰기
 * 부모 클래스에게 상속 받은 메서드와 동일한 이름의 메서드를 재 정의하는 것
 * 1. 부모 클래스의 메서드와 타입과 갯수가 동일해야 한다.
 * 2. 부모 클래스의 매서드보다 접근 지정자의 범위가 같거나 넓어야 한다.
 * 
 * 		오버라이딩을 덮어쓰기라고 표현은 했지만 사실 차이가 있다. 
		덮어쓰기는 이전 내용이 완전히 삭제되고 새로운 내용으로 바뀌는 개념이지만
		오버라딩은 이전 print() 매서드 위에 새로운 매서드가 올라타는 개념이다. 
		사실은 부모의 print()매서드를 강제로 호출할수도 있다. 
		
 * 매서드 위에 새로운 매서드가 올라타는 개념
 * 
 * 장점
 * 1. 모든 객체를 부모 타입 한 가지로 선언하면 배열로 한 번에 관리할 수 있는 장점이 있다.
 * Animal[] animals = new Animal[] {bird, cat, dog};
 */
	
	Q q = new Q();// Q자료형 / Q생성자
	q.print();
	
	W w = new W();// W자료형 / W생성자
	w.print();
	
	Q qw = new W();// Q자료형 / W생성자
	qw.print();
}
}

class Q{
	void print() {
		System.out.println("Q class");
	}
}

class W extends Q{
	void print() {
		System.out.println("W class");
	}
}