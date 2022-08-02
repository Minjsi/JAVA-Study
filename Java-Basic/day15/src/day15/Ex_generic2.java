package day15;

public class Ex_generic2 {
	public static void main(String[] args) {
		
		 MyClass<String> mc1 = new MyClass<String>();
		 mc1.set("안녕");
		 System.out.println(mc1.get());
		 
		 MyClass<Integer> mc2 = new MyClass<>();
		 mc2.set(100);
		 System.out.println(mc2.get());
		 
		 MyClass<Integer> mc3 = new MyClass<>();
		// mc3.set("안녕"); // 오류 발생
		 System.out.println(mc3.get());
		 /* 
		  단순하게 하나의 클래스로 다양한 타입의 객체를 저장하고 관리할수 있도록
		  하는것은 Object타입의 필드를 사용하는 것만으로도 가능하다. 
		  하지만 모든 객체는 Object타입이기때문에 실수로 엉뚱한 객체를 저장하더라도
		  오류를 발생하지는 않는다. getter매서드로 꺼내온 값도 Object 타입이므로
		  항상 다운캐스팅을 수행해야만 했다. 
		  하지만 제네릭 클래스를 사용한 mc1, mc2 객체 생성 예를 보면 입출력이 각각 객체를
		  생성할때 정해진 타입으로 확정되기 때문에 setter 매서드를 사용할때 
		  입력 타입을 정확히 확인 할수도 있고 출력도 해당 타입으로 리턴이 되기때문에
		  다운 캐스팅 자체가 필요없어진다. 
		  */

}

}


class MyClass<T> {
	private T t;
	public T get() {
		return t;	
	}
	
	public void set(T t) {
		this.t = t;
}
}
