package day17;

import java.util.Random;

public class review2 {
public static void main(String[] args) {
	F f = new F();
	int[] a = new int[10];
	Random rand = new Random();
	
	for(int i = 0; i < a.length ; i++) {
		a[i] = rand.nextInt(10)+1;
	}
	f.arraySum(a);
	System.out.println(f.arraySum(a));
}
}
class F{
	int arraySum(int[] a){
		int sum = 0;
		for(int i = 0; i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
}