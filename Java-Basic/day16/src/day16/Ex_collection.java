package day16;

import java.util.List;
import java.util.Arrays;

public class Ex_collection {
	public static void main(String[] args) {
		
	// Arrays.asList()매서드를 이용한 정적 컬렉션 객체 생성
	List<Integer> aList = Arrays.asList(1,2,3,4);
	aList.set(1,7); // 1 7 3 4가 된다
	aList.add(5); // 오류
	aList.remove(0); // 오류
	}
}
