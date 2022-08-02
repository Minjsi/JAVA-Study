package day16;

public class Ex_coll_hashcode {
public static void main(String[] args) {
	A a = new A(3);
	A b = new A(3);
	System.out.println(a == b); // 두 객체의 해시코드가 동일한지를 비교
	System.out.println(a.equals(b)); // 두 객체를 비교
}
}

class A {
	int data;
	public A(int data) {
		this.data = data;
		
	}
}