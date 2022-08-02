package day11;

class FoolException extends RuntimeException {
//	디폴트 생성자를 자동으로 만들어준다.
//	상속을 받고 있으므로 자동으로 부모의 생성자를 호출한다.!!!!
}
public class Ex_throw2 {

public void sayNick(String nick) {
	if("fool".equals(nick)) {
		return;	
	}
	System.out.println("당신의 별명은 "+nick+" 입니다.");
}

public static void main(String[] args) {
	Ex_throw2 sample = new Ex_throw2();
	sample.sayNick("fool"); //예외 발생
	sample.sayNick("genious"); // 실행 조차 되지 XXXXXX
	
}
}
