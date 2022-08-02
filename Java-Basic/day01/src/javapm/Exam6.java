package javapm;

public class Exam6 {
	public static void main(String[] args) {
//		문자 저장 방법
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println();
		
//	 	숫자로 문자 저장
		char value4 = 65;
		System.out.println(value4);
		System.out.println();
		
//		유니코드로 문자 저장
		char value5 = '\u0065';
		System.out.println(value5);
		System.out.println();
		
		float value21 = 3;
		long value22 = 5;
//		int value27 = 3.5; double -> int 다운캐스팅
		int value28 = (int)3.5;
//		float value29 = 7.5; 실수의 기본은 double형
		float value30 = (float)7.5;
		float value31 = 2.4532424F;
		
		int value40 = 3 + 5;
		int value41 = 8 / 5;
		float value43 = 3.0f + 5.0f;
		double value44 = 8.0 + 5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		
		System.out.println((double)(3/2));
	}
}
