package day15_HW10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_7_19 {
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
		ArrayRmv2 arrayrmv2 = new ArrayRmv2();
		
		// 삭제할 요소 번호 입력
		System.out.println("삭제를 시작할 인덱스??");
		int rmv = sc.nextInt();
		
		// 삭제할 숫자의 개수
		System.out.println("몇개를 삭제할까요??");
		int rmv2 = sc.nextInt();
		
		// 메소드 호출
		arrayrmv2.aryRmv(array, rmv, rmv2);
	}
}
		// 새로운 클래스와 메소드 정의
class ArrayRmv2 {
		// 메소드에는 어레이, 삭제를 시작할 번호, 삭제할 번호 개수를 입력받는다.
	void aryRmv(int[] a, int idx, int n) {
		
		// 삭제될 요소들이 어레이의 개수를 넘지않는다면,
		if(idx + n < a.length) {
		// 실행한 후 어레이를 출력한다.
		for(int i = idx; i<a.length-n ; i++) {
			a[i] = a[i+n];
		}System.out.println(Arrays.toString(a));
	}
	}
}