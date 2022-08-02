package day8;

public class Ex_methodOr_Test {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Bird bird = new Bird();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		animal.cry();
		bird.cry();
		cat.cry();
		dog.cry();
		System.out.println();
//		 
//		위, 아래 결과 같음
		Animal bb = new Bird();
		Animal cc = new Cat();
		Animal dd = new Dog();
		
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();

//		
//		자료형 배열
		Animal[] animals = {bb, cc, dd};
		for (Animal ani : animals) {
			ani.cry();
		}
	}
}
class Animal {
	void cry() {}
}

class Bird extends Animal {
	void cry() {
		System.out.println("ZZakZZak");
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("nya-ooo");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("MeongMeong");
	}
}
