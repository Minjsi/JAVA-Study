package day10;

public class Ex_exception2 {
	public static void main(String[] args) {
		try {
			System.out.println(3/0); // 예외 발생 -> 자바 (예외 클래스로 객체 생성)
//			ArithmeticException excep = new ArithmeticException
			
			System.out.println("프로그램 종료"); 
		}
		catch(ArithmeticException e) { 		// 객체를 이 줄로 던져준다.
			System.out.println("숫자는 0으로 나눌 수 없다.");
			System.out.println("프로그램 종료");
		}
//	예외 X : 최초 try 구문이 실행되어 만약 예외가 발생하지 않으면 catch는 실행되지 않는다. 그리고 finally 블룩 구문을 실행한다.
//  예외 O : try 구문이 실행되어 만약 예외가 발생하면 자바가 먼저 인지하여 예외 타입의 객체를 생성 -> catch의 매개 변수로 전달

// 1. 단일 try-catch
	try {
		System.out.println(3/0);
	} catch (ArithmeticException e) {
		System.out.println("숫자는 0으로 나눌 수 없다.");
	} finally {
		System.out.println("프로그램 종료");
	}
	
// 2. 다중 try-catch
	try {
		System.out.println(3/0);
		int num = Integer.parseInt("10A");
	} catch (ArithmeticException e){
		System.out.println("숫자는 0으로 나눌 수 없다.");
		
	} catch (NumberFormatException e){
		System.out.println("숫자로 바꿀 수 없다.");
		
	} finally {
		System.out.println("프로그램 종료");
	}
	
//	3. 2개의 예외를 1개 catch() 블록으로 동시에 처리하도록 통합해보기
	try {
		System.out.println(3/1);
		int num = Integer.parseInt("10A");
		
	} catch (ArithmeticException | NumberFormatException e){ // |(or)을 이용
		System.out.println("숫자는 0으로 나눌 수 없다.");
		
	} finally {
		System.out.println("프로그램 종료");
	}
	
	
	
	
	
	}
}
