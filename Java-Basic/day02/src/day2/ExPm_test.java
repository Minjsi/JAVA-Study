package day2;

public class ExPm_test {
	public static void main(String[] args) {
//		String a = " ";
//		String j = "*";
//		for(int i = 1; i < 11 ; i++) {
//			System.out.println(a);
		int[] scores = {70,60,55,95,90,80,80,85,100};
		int sum = 0;
		int avg = 0;
		int max = scores[0];
		int min = scores[0];
		for(int i = 1; i<scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		
		for(int i = 1; i<scores.length; i++) {
			if(scores[i] < min) {
				min = scores[i];
			}
		}
		
		for(int score: scores) {
			sum += score;
			avg = sum/9;

		}
		System.out.println("합계 : "+sum);
		System.out.println("평균: "+avg);
		System.out.println("최대점수 : "+max);
		System.out.println("최소점수 : "+min);

	}
}
