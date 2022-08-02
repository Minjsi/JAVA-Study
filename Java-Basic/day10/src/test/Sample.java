package test;
// 추상 클래스

abstract class Predator{
	abstract String getFood();
	
	 void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
	
	static int LEG_COUNT = 4;
	
	static int speed() {
		return LEG_COUNT * 30;
	}
}


interface Barkable {
	void bark();
}


class Animal {
	String name;
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Predator implements Barkable{
	public String getFood(){
		return "apple";
	}
	
	public void bark() {
		System.out.println("어흥");
	}
}

class Lion extends Predator implements Barkable{
	public String getFood(){
		return "banana";
	}
	public void bark() {
		System.out.println("으르렁");
	}
}

class Crocodile extends Predator implements Barkable{
	public String getFood(){
		return "strawberry";
	}
	public void bark() {
		System.out.println("크롱크롱");
	}
}

class Leopard extends Predator implements Barkable{
	public String getFood(){
		return "orange";
	}
	public void bark() {
		System.out.println("악엉악엉");
	}
}


class ZooKeeper {
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
//    void feed(Predator tiger) {  // 호랑이가 오면 사과를 던져 준다.
//        System.out.println("feed apple");
//    }
//
//    void feed(Predator lion) {  // 사자가 오면 바나나를 던져준다.
//        System.out.println("feed banana");
//        
//    }
//    void feed(Predator crocodile) {  // 호랑이가 오면 사과를 던져 준다.
//        System.out.println("feed strawberry");
//    }
//
//    void feed(Predator leopard) {  // 사자가 오면 바나나를 던져준다.
//        System.out.println("feed orange");
//        
//    }
}


class Bouncer {
	void barkAnimal(Barkable animal) {
		animal.bark();
	}
}
public class Sample {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger(); 
		Lion lion = new Lion();
		Crocodile crocodile = new Crocodile();
		Leopard leopard = new Leopard();
		Bouncer bouncer= new Bouncer();
		
		zooKeeper.feed(tiger); // feed apple 출력 // 메서드 오버로딩
		zooKeeper.feed(lion); // feed banana 출력
		zooKeeper.feed(crocodile);
		zooKeeper.feed(leopard);
		
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
        bouncer.barkAnimal(crocodile);
        bouncer.barkAnimal(leopard);

	}
}
