package day23_HW25;
import java.util.*;
public class test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);


	System.out.print("version1 = ");
	String v1 = sc.next();
	System.out.print("version2 = ");
	String v2 = sc.next();
	
	String[] v1_ar = v1.split("\\.");
	String[] v2_ar = v2.split("\\.");
	
	ArrayList<Integer> v1_list = new ArrayList<Integer>();
	ArrayList<Integer> v2_list = new ArrayList<Integer>();
	
	for (int i = 0; i < v1_ar.length; i++) {
		v1_list.add(i, Integer.parseInt(v1_ar[i]));
	}
	
	for (int i = 0; i < v2_ar.length; i++) {
		v2_list.add(i, Integer.parseInt(v2_ar[i]));
	}

	
		while(v1_list.contains("0") || v2_list.contains("0")) {
			v1_list.remove("0");
			v2_list.remove("0");
		}

		
		System.out.println("version1 의 사이즈는 " + v1_list.size());
		System.out.println("version2 의 사이즈는 " + v2_list.size());
		
		
		
		
}
}