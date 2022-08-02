package day8;

public class Ex_methodOl_Overloading {
public static void main(String[] args) {
	P p = new P();
	p.print1();
	p.print2();
	System.out.println();
	
	O o = new O();
	o.print1();
	o.print2();
	o.print2(3);
	System.out.println();
	
	P po = new O();
	po.print1();
	po.print2();
//	po.print2(3); // 에러 발 생
	System.out.println();
}
}

class P {
	void print1() {
		System.out.println("P class print 1");
	}
	void print2() {
		System.out.println("P class print 2");
	}
}

class O extends P {
	@Override //오버라이딩 할때는 annotaion 붙이는 센스
	// 컴퓨터가 읽는 주석이 Annotation!
	void print1() { // 메서드 오버라이딩
		System.out.println("O class print 1");
	}
	void print2(int a) { // 메서드 오버로딩
		System.out.println("O class print 2");
	}
}