package test;

import java.util.*; // Scanner 사용을 위해  import 해준다

public class test6 {
	public static void main(String[] args) {
		int limit1 = 0; // 첫번째로 사용자에게 입력받을 숫자의 개수
		int[] input1; // 첫번째로 사용자에게 입력받을 숫자를 넣을 배열

		int limit2 = 0; // 두번째로 사용자에게 입력받을 숫자의 개수
		int[] input2; // 두번째로 사용자에게 입력받을 숫자를 넣을 배열

		Scanner scanner = new Scanner(System.in); // Scanner 생성

		// 첫번째 배열의 숫자 개수 입력받기
		System.out.println("첫 번째 배열입니다.");
		System.out.print("몇 개 숫자 입력할래요? : ");
		limit1 = scanner.nextInt();
		input1 = new int[limit1]; // 첫 번째 배열 길이 선언

		// 첫번째 배열의 숫자 입력받기
		System.out.print(limit1 + " 개 숫자를 입력하세요. : ");
		for (int i = 0; i < limit1; i++) { // 배열의 길이만큼
			input1[i] = scanner.nextInt(); // 입력받은 순서대로 배열에 넣는다
		}

		// 두번째 배열의 숫자 개수 입력받기
		System.out.println("두 번째 배열입니다.");
		System.out.print("몇 개 숫자 입력할래요? : ");
		limit2 = scanner.nextInt();
		input2 = new int[limit2]; // 두 번째 배열 길이 선언

		// 두번째 배열의 숫자 입력받기
		System.out.print(limit2 + " 개 숫자를 입력하세요. : ");
		for (int i = 0; i < limit2; i++) { // 배열의 길이만큼
			input2[i] = scanner.nextInt(); // 입력받은 순서대로 배열에 넣는다
		}

		Sort sort = new Sort(); // 배열을 정렬하기 위한 Sort class 객체 생성
		// sort메서드를 호출해서 return값을 받고, Arrays.toString 으로 배열 출력
	    System.out.println("배열을 합쳤습니다");
		System.out.println(Arrays.toString(sort.sort(input1, input2)));

	}
}

class Sort { // 배열 합치고 정렬하기 위한 Sort 클래스 선언
	int[] sort(int[] a, int[] b) { // 두 배열을 입력받고, 한 배열을 return한다.
		int[] sum_array = new int[a.length + b.length]; // 합치기
		for (int i = 0; i < a.length; i++) { // 첫번째 배열을 합칠배열에 넣는다.
			sum_array[i] = a[i]; // 인덱스 0번부터 넣는다.
		}
		for (int i = 0; i < b.length; i++) { // 두번째 배열을 합칠 배열에 넣는다.
			sum_array[i + a.length] = b[i]; // 첫번째 배열 다음의 인덱스부터 넣는다.
		}
		// 정렬
		java.util.Arrays.sort(sum_array);
		return sum_array; // 정렬된 합친 array를 리턴한다.

	}
}