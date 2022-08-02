package day9;

public class Ex_abstract {
public static void main(String[] args) {
	

/*
abstract 추상 : 구체적이지 않다.
abstract method
중괄호 없는 메서드
메서드 기능 정의되지 X
그냥 ; 으로 끝남

absctract 리턴타입 매서드명();

 추상 클래스도 클래스이므로 상속 가능
 추상 클래스로는 객체를 생성할 수 없다.
*/

/*
class Animal315 {
	void cry() {
	} // 기능을 구현하지 않음 : 추상 메서드로 정의하는 것이 효율적. 추상 메서드를 포함하는 클래스는 반드시 추상 클래스로 정의!!!
}

class Cat315 extends Animal315 {
	void cry() {
		System.out.println("야옹");
	}
}

class Dog315 extends Animal315 {
	void cry() {
		System.out.println("멍멍");
	}
}

Animal315 animal1 = new Cat315();
animal1.cry(); // 야옹
Animal315 animal2 = new Dog315();
animal2.cry(); // 멍멍

*/
	
	Animal animal1 = new Cat();
	Animal animal2 = new Dog();
	
	animal1.cry();
	animal2.cry();
}
}
abstract class Animal { // 추상 클래스 선언
	abstract void cry(); // 추상 메서드 선언
	// 내용 없이 이름만 적음!!!!!!!!11
	// 인터페이스에서도 등장하는 개념
}

class Cat extends Animal {
	void cry() {
		System.out.println("Miyaoooo");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("MeongMeong");
	}
}

/* 추상 메서드의 장점
*/