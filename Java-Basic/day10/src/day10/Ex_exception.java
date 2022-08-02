package day10;

public class Ex_exception {
public static void main(String[] args) {
	A a = new A();
	B b = (B) a;
}
}
class A {}
class B extends A{}
//실행 시  ClassCastException: day10.A cannot be cast to day10.B 

/*
try {
• 일반 예외, 실행 예외 발생 가능 코드
catch (예외타입 1) {
• 예외가 발생했을 때 처리
catch (예외타입 2) {
• 예외가 발생했을 때 처리
finally {
}
*/