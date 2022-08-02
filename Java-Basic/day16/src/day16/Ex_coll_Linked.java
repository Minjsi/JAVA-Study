package day16;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ex_coll_Linked {

	public static void main(String[] args) {
		/////////////////////////////////////////
		List<Integer> linkedlist1 = new LinkedList<>();
//		List<Integer> aList6 = new LinkedList<>(30); 저장 용량 지정 불가
		

		// 1. add - 끝에 계속 추가
		linkedlist1.add(3);
		linkedlist1.add(4);
		linkedlist1.add(5);
		System.out.println("aList1 끝에 추가 : "+linkedlist1.toString());
		
		// 2. add - 위치 지정 삽입
		linkedlist1.add(1, 6);
		System.out.println("aList1 위치 지정 후 추가 : "+linkedlist1.toString());		
		
		// 4. set - 값 변경하기
		linkedlist1.set(1, 5); //(index , value)
		System.out.println("aList3 에 위치 지정하여 값 바꾸기 : "+linkedlist1.toString());
		
		// 5. remove - 인덱스 위치 삭제
		linkedlist1.remove(1); //(index 삭제)
		System.out.println("aList3 에 위치 지정하여 삭제하기 : "+linkedlist1.toString());
		
		// 5. remove - 값을 삭제
		linkedlist1.remove(new Integer(2)); //(처음 등장하는 값 삭제)
		System.out.println("aList3 에 값을 삭제하기 : "+linkedlist1.toString());
		
		// 6. clear - 전부 삭제
		linkedlist1.clear(); //(처음 등장하는 값 삭제)
		System.out.println("aList3 전부 삭제하기 : "+linkedlist1.toString());
		
		// 7. isEmpty() - 비어있는지 확인
		System.out.println("aList3 비어있는지 확인 : "+linkedlist1.isEmpty());
		
		// 8. size - 크기를 확인
		System.out.println("aList1 크기 확인 : "+linkedlist1.size());
		
		linkedlist1.add(3);
		linkedlist1.add(4);
		linkedlist1.add(5);
		// 10. get - index로 가져오기
		System.out.println(linkedlist1.get(0));
		System.out.println(linkedlist1.get(1));
		System.out.println(linkedlist1.get(2));
		
		for(int i = 0; i<linkedlist1.size();i++) {
		System.out.println(i+"번째 값 :"+linkedlist1.get(i));	
		}
		
				
				
	}
}
