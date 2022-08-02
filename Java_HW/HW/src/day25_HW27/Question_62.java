package day25_HW27;
import java.util.*;
public class Question_62 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// 수열의 개수 입력 및 배열 생성
	Integer[] arr = new Integer[sc.nextInt()];
//	sort(T[] a, Comparator <? super T> c) 에서 사용되는 T는 Generic Class로 어떠한 객체도 허용하게 해주었지만, 
//	int는 객체가 아닌 primitive type이었던 것이다.
//	그래서 해당 코드를 int[]가 아닌 Integer[]로 변경 해주면 컴파일 에러 없이 내림차순이 올바르게 된다.
	
	// 수열 입력
	for(int i = 0 ; i < arr.length ; i++) {
		do{
			System.out.println(i+1 + "번째 입력");
			arr[i] = sc.nextInt();
		}while(arr[i] > 100000 || arr[i] < 1);
	}
	
	// 정렬 후 출력
	 Arrays.sort(arr,Collections.reverseOrder());	
	for(int j = 0 ; j < arr.length ; j++) {
		System.out.print(arr[j] + "\t");
	}

}



}
