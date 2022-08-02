package day15;
// 제너릭
public class Ex_generic {
	public static void main(String[] args) {
	  	Goods1 goods1 = new Goods1();
	  	goods1.set(new Apple());//Apple타입만 입력가능
	  	Apple apple = goods1.get();
	  		// 연필을 저장setter하고 가져오기 getter
	  	Goods2 goods2 = new Goods2();
	  	goods2.set(new Pencil());//Pencil타입만 입력가능
	  	Pencil pencil = goods2.get();
	}

}



class Apple {}

class Goods1 {
	private Apple apple = new Apple();
	
	public Apple get() {
		return apple;
		}
		
	public void set(Apple apple) {
	this.apple = apple;
	}
}
	
	class Pencil {}
	
	class Goods2 {
	  	private Pencil pencil = new Pencil();
	  	public Pencil get() {
	  		return pencil;
	  		}
	  	public void set(Pencil pencil){
	  		this.pencil = pencil;
	  		}
	}