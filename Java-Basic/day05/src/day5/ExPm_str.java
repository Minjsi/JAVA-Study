package day5;

import java.util.Arrays;

public class ExPm_str {
	public static void main(String[] args) {
//		int a = 12;
//		String b = "swift";
//		String c = new String("swift");
		
//		String str1 = new String("안녕");
//		String str2 = str1;
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		str1 = "안녕하세요";
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		int[] arr1 = new int[] {3,4,5};
//		int[] arr2 = arr1;
//		
//		arr1[0] =6; //arr1의 0번을 6으로 바꾼다.
//		arr1[1] =7;
//		arr1[2] =8;
//		
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
		
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str1);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
		
		
	}
}
