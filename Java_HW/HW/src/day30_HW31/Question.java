package day30_HW31;
import java.util.*;
public class Question {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("v1 = ");
		String v1_input = sc.nextLine();
		String[] v1_arr = v1_input.split("\\s");
		List v1 = new ArrayList();
		for(String i : v1_arr) {
			v1.add(Integer.parseInt(i));
		}
		
		System.out.print("v2 = ");
		String v2_input = sc.nextLine();
		String[] v2_arr = v2_input.split("\\s");
		List v2 = new ArrayList();
		for(String i : v2_arr) {
			v2.add(Integer.parseInt(i));
		}
		
		ZigzagIterator zig = new ZigzagIterator(v1, v2);
	}
}

class ZigzagIterator {
	ZigzagIterator(List<Integer> v1, List<Integer> v2){
		this.hasNext();
		this.next();
	}
	boolean hasNext() {
		
	}
	
	int next()	{
		
	}
}