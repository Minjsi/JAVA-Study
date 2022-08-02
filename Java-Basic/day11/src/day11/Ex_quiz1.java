package day11;


public class Ex_quiz1 {
public static void main(String[] args) {
	Over100 over100 = new Over100();
	over100.aa2();
	
}
}
class OverException extends Exception { // 일반 예외
	public OverException () {
		super();
	}

	OverException(String s) {
		super(s);
	}
}

class Over100 {
	OverException aa1 = new OverException("예외 메시지 : OverException");
	OverException aa2 = new OverException("예외 메시지 : MinException");
	
	void aa(int num) {
		try {
			if(num < 100 && num > 0) {
				System.out.println("정상적인 값입니다.");
			}else if(num < 0) {
				throw aa1;
			}else if(num > 100) {
				throw aa2;
			}
		}catch (OverException e) {
			System.out.println(aa1);
		}
	}
	void aa2() {
		aa(-1);
	}

}