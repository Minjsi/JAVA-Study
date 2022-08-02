package day16;

import java.util.HashSet;

public class Ex_coll_set {
	// HashSet 구현 클래스
	public static void main(String[] args) {
		HashSet hset1 = new HashSet();
		
		hset1.add("가");
		hset1.add("나");
		hset1.add("다");
		System.out.println(hset1);
		
		HashSet hset2 = new HashSet();
		
		hset2.add("나");
		hset2.add("다");
		System.out.println(hset2);
		
		hset1.addAll(hset1);
		
	}
}
