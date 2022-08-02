package day9;

public class Ex_final {


/*
 * final 필드, 메서드, 클래스 앞에 위치한다. 의미가 각각 다르다.
 * 
 * final 변수 변수를 선언할 때만 지정할 수 있고 한 번 대입된 값을 수정할 수 없다. 처음 대입한 값이 최종값이 된다. 변수를 상수로
 * 사용할 때 쓴다.
 * 값이 한 번 입력되고 나면 절대로 값을 수정할 수 없다.
 */

/*
final double c = 3.14;
어떤 필요에 따라서 복사본을 하나 만들어 원본이 삭제 된 후에도 그 값을 활용할 수 있도록 하는 것이 final의 기능이다.
 */
	public static void main(String[] args) {
		A1 a1 = new A1();
		A2 a2 = new A2();
		
		a1.a = 7;
		a2.a = 7;
//		a1.b = 9; //에러가 난다.
	}
}
class A1 { // 선언과 동시에 값 대입
	int a = 3;
	final int b = 5;

	A1() {
	} // A1 생성자

}

class A2 {
	int a;
	final int b;

	A2() {
		a = 3;
		b = 5;
	}
}

class A3{
	int a = 3;
	final int b = 5;
	A3 () {
		a = 7; // a는 변수... 그냥 변수!
//		b = 9; // final을 이용해 한 번 값을 위에서 대입했기 때문에 바꿀 수 없다.
	}
}

class B1 {
	void bcd() {
		int a = 3;
		final int b = 5;
		a = 7;
//		b = 9; // 에러남
//		b = 5; // 에러남
	}
}