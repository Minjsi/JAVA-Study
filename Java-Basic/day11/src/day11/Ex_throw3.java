package day11;

class FoolException extends RuntimeException {
//	디폴트 생성자를 자동으로 만들어준다.
//	상속을 받고 있으므로 자동으로 부모의 생성자를 호출한다.!!!!
}
public class Ex_throw3 {

public void sayNick(String nick) {
	try {
	if("fool".equals(nick)) {
		throw new FoolException();
	}
	System.out.println("당신의 별명은 "+nick+" 입니다.");
}catch(FoolException e) {
	System.out.println("FoolException이 발생 했습니다.");
}
}
public static void main(String[] args) {
	Ex_throw2 sample = new Ex_throw2();

	
	try {
	sample.sayNick("fool"); //예외 발생했으나 처리 했기 때문에
	sample.sayNick("genious"); // 잘 실행이 된다.
	} catch (FoolException e) {
		System.out.println("FoolException이 발생");
	}
}
}
