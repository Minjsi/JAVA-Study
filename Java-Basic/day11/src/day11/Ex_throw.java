package day11;

public class Ex_throw {
	public static void main(String[] args) {
		B b = new B();
		b.bcd1();
		b.bcd2();
	}
}
/*
 * 예외를 강제로 발생시키기 throw Ex) int age = -1; 실제는 에외가 아니지만, 경우에 따라 나이가 -1살이 될 수 없으므로
 * 강제로 예외라고 인식 시킬 필요가 있다. 몸무게의 경우 너무 높은 수치가 나올 수 없기 때문에 예외로 인식 시킬 필요가 있다.
 * 
 * => 예외 클래스를 직접 정의해서 사용한다. 사용자 정의 예외클래스를 만들어보면 다른 예외 동작 매커니즘도 자연스레 이해할 수 있다.
 */

class MyException extends Exception { // 일반 예외
	public MyException() {
		super();
	}

	MyException(String s) {
		super(s);
	}
}

class MyRTException extends RuntimeException { // 실행 예외
	MyRTException() {
	}

	MyRTException(String s) {
		super(s);
	}
}

class B {
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메시지 : MyException");

	MyRTException mer1 = new MyRTException();
	MyRTException mer2 = new MyRTException("예외 메시지 : MyRTException");

	void abc_1(int num) {
		try {
			if (num > 70) {
				System.out.println("정상 작동");
			} else {
				throw me1;
			}
		} catch (MyException e) {
			System.out.println("예외 처리 1");
		}
	}

	void bcd1() {
		abc_1(1010);
	}


void abc_2(int num) throws MyException {
	if (num > 70) {
		System.out.println("정상 작동");
	}else {
		throw me1;
	}
}

void bcd2() {
	try {
		abc_2(65);
}catch(MyException e){
	System.out.println("예외 처리2");
}
}
}
