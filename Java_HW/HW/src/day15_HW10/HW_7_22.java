package day15_HW10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_7_22 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 요소 수 입력
		System.out.println("요소 수 : ");
		int arrNum = sc.nextInt();
		int[] array = new int[arrNum];

		// 첫 번째 배열 정의
		for (int i = 0; i < arrNum; i++) {
			array[i] = rand.nextInt(10) + 1;
		}
		System.out.println("배열이 생성되었습니다.");
		System.out.println(Arrays.toString(array));
		
		ArrayClone arrayclone = new ArrayClone();
		System.out.println("첫번째 배열을 복사해서 배열 x를 만들었습니다.");
		System.out.println(Arrays.toString(arrayclone.arrayClone(array)));
	}
}

class ArrayClone{
	int[] arrayClone(int[] a) {
		int[] x = new int[a.length];
		for(int i=0; i<a.length;i++) {
			x[i] = a[i];
		}
		return x;
	}
}