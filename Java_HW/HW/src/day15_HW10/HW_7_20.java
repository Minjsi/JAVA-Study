package day15_HW10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_7_20 {
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
		ArrayRmv3 arrayrmv3 = new ArrayRmv3();
		
		// 삽입할 요소의 번호를 입력
		System.out.println("삽입할 요소의 인덱스??");
		int rmv = sc.nextInt();
		
		// 삽입할 값 입력
		System.out.println("삽입할 값 ??");
		int rmv2 = sc.nextInt();
		
		// 메소드 호출
		arrayrmv3.aryRmv(array, rmv, rmv2);
	}
}
		// 새로운 클래스와 메소드 정의
class ArrayRmv3 {
		// 메소드에는 어레이, 삽입할 요소의 인덱스, 삽입할 값을 입력받는다.
	void aryRmv(int[] a, int idx, int n) {
		
		// 입력받은 인덱스 값이 어레이의 인덱스 값을 넘지 않는다면,
		if(idx < a.length) {
		// idx 다음 순서부터 숫자를 밀어넣어준다.
		for(int i = a.length-1 ; i>idx ; i--) {
			a[i] = a[i-1];
		}a[idx] = n;
		System.out.println(Arrays.toString(a));
	}
	}
}