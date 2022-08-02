package day13;

public class RE_constructor {
	public static void main(String[] args) {
		recon13 r1 = new recon13();
		recon13 r2 = new recon13(3);
		recon13 r3 = new recon13(3,2);
	}
}
// 생성자 오버로딩
class recon13 {
	recon13(){
		System.out.println("첫번째 생성자");
	}
	
	recon13(int a){
		System.out.println("두번째 생성자");
	}
	
	recon13(int a, int b){
		System.out.println("세번째 생성자");
	}
}