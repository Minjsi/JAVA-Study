package day15_HW10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_7_18 {
	public static void main(String[] args) {
		// 요소 수 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("요소 수 : ");
		int arrNum = sc.nextInt();
		int[] array = new int[arrNum];
		
		// 난수로 어레이 생성
		Random rand = new Random();
		for(int i = 0; i<arrNum;i++) {
			array[i] = rand.nextInt(10)+1;
		}System.out.println("배열이 생성되었습니다.");
		
		// 어레이 번호 순대로 정렬
		for(int i = 0; i < array.length ; i++) {
			System.out.println("배열["+i+"] = "+array[i]);
		}
		
		// 객체 생성
		ArrayRmv arrayrmv = new ArrayRmv();
		
		// 삭제할 요소 번호 입력
		System.out.println("몇 번째 번호를 삭제??");
		int rmv = sc.nextInt();
		arrayrmv.aryRmv(array, rmv);
	}
}
		// 새로운 클래스와 메소드 정의
class ArrayRmv {
		// 메소드에는 어레이와 삭제할 번호를 입력받는다.
	void aryRmv(int[] a, int idx) {
		for(int i = idx; i<a.length-1 ; i++) {
			a[i] = a[i+1];
		}System.out.println(Arrays.toString(a));
	}
}