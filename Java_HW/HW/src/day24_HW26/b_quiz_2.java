package day24_HW26;
import java.util.*;
public class b_quiz_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("height : ");
		int height = sc.nextInt();
		
		Triangle triangle = new Triangle();
		triangle.tri(height);
		
	}
}

class Triangle {
	void tri(int h) {
		int num = 1;
		int max = h * (h+1)/2;
		int[] array = new int[h];
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = num;
			++num ;
		}
		
		int index = 0;
		for(int i = 1 ; i <= h ; i++) {
			for(int j = 0 ; j < i; j++) {
				System.out.print(array[index]+"\t\t");
				index += 1 ;
			}System.out.println();
		}
	}
}