package day9;

public class Ex_finMetCla {

}
/*
final 메서드, final class

final 변수는 변수가 저장된 값이 최종값의 의미를 가진 것처럼 final method와 final class도 각각 최종 method, 최종 class의 의미를 갖는다.
최종 메서드의 의미 : 상속할 때 부모의 메서드를 오버라이딩 하면 자식 클래스에서는 메서드의 기능이 변경된다.
final 메서드는 메서드의 기능을 변경할 수 없는 메서드! 즉 자식 클래스에서 해당 메서드를 오버라이딩 할 수 없음

final 총정리
final 변수는 값을 변경할 수 없고
final 매서드는 오버라이딩 할 수 없고
final 클래스는 상속 받을 수 없다.
*/

class A315147 {
	void abc() {}
	final void bcd() {}
}

class B315147 extends A315147 {
	void abc() {} // 부모의 abc() 메서드를 오버라이딩
//	void bcd() {} // final 때문에 부모의 메서드 오버라이딩 할 수 없음. 
}

final class C315147 {
	
}
//class D315 extends C315 { // 부모 클래스의 final 때문에 상속이 안 됨! 
//	
//}

