package day15_HW10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_7_21 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 요소 수 입력
		System.out.println("첫 번째 배열의 요소 수 : ");
		int arrNum1 = sc.nextInt();
		System.out.println("두 번째 배열의 요소 수 : ");
		int arrNum2 = sc.nextInt();
		int[] array1 = new int[arrNum1];
		int[] array2 = new int[arrNum2];

		// 첫 번째 배열 정의
		for (int i = 0; i < arrNum1; i++) {
			array1[i] = rand.nextInt(10) + 1;
		}
		System.out.println("첫 번째 배열이 생성되었습니다.");
		System.out.println(Arrays.toString(array1));
		
		// 두 번째 배열 정의
		for (int i = 0; i < arrNum2; i++) {
			array2[i] = rand.nextInt(10) + 1;
		}
		System.out.println("두 번째 배열이 생성되었습니다.");
		System.out.println(Arrays.toString(array2)+"\n");
		// 객체 생성
		ArrayRmv4 arrayrmv4 = new ArrayRmv4();

		// 메소드 호출
		arrayrmv4.aryRmv(array1, array2);
	}
}

// 새로운 클래스와 메소드 정의
class ArrayRmv4 {
	void aryRmv(int[] a, int[] b) {

		if(a.length > b.length) {
			for (int i = 0; i < b.length ; i++) {
				a[i] = a[i] - b[i];
	            b[i] = a[i] + b[i];
	            a[i] = GetAbsoluteValue(a[i] - b[i]);
		}
		}else {
			for (int i = 0; i < a.length ; i++) {
				a[i] = a[i] - b[i];
	            b[i] = a[i] + b[i];
	            a[i] = GetAbsoluteValue(a[i] - b[i]);
		}
		}
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
	}

	private int GetAbsoluteValue(int i) {
		// TODO Auto-generated method stub
		return Math.abs(i);
	}
}