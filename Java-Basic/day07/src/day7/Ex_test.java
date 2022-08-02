package day7;

public class Ex_test {
	public static void main(String[] args) {
//		평균구하는 것 구하기 
		C c = new C();
		
		c.averageScore(1);
		c.averageScore(1,2);
		c.averageScore(1,2,3);
		c.averageScore(1,2,3,4);
	}
}


class C {
	void averageScore(int...Values) {
		double sum = 0.0;
		for(int each : Values) {
			sum+=each;
		}
		double avg = sum/Values.length;
		System.out.println("평균은" + avg);
	}
}