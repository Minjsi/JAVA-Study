package day10_HW6;

import java.util.Random;
import java.util.Scanner;

public class HW_6_12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	int n;
	
	do {
		System.out.println("요소 수  : ");
		n = sc.nextInt();
	}while (n > 10);
	int[] arr = new int[n];
	
	for(int i = 0 ; i < n ; i++) {
		int j;
		do {
			j = 0;
			arr[i]=1+rand.nextInt(10);
			for(; j < i; j++)
				if(arr[j] == arr[i]) break;
		}while(j < i);
	}
	
	
	for (int i = 0; i < n; i++)
		System.out.println("a[" + i + "] = " + arr[i]);
}
}
