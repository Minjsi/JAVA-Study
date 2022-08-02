package day16;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ex_coll_List {
	public static void main(String[] args) {
		/////////////////////////////////////////
		List<Integer> aList1 = new ArrayList<>();
		
		// 1. add - 끝에 계속 추가
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println("aList1 끝에 추가 : "+aList1.toString());
		
		// 2. add - 위치 지정 삽입
		aList1.add(1, 6);
		System.out.println("aList1 위치 지정 후 추가 : "+aList1.toString());
		
		// 3. addAll - 또 다른 리스트 통채로 넣기
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println("aList2 에  aList1 합치기: "+aList2.toString());
		
		// 3. addAll - 또 다른 리스트 위치 지정해서 통채로 넣기
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(2, aList2);
		System.out.println("aList3 에 위치 지정해서 aList2 합치기: "+aList3.toString());
		
		// 4. set - 값 변경하기
		aList3.set(1, 5); //(index , value)
		System.out.println("aList3 에 위치 지정하여 값 바꾸기 : "+aList3.toString());
		
		// 5. remove - 인덱스 위치 삭제
		aList3.remove(1); //(index 삭제)
		System.out.println("aList3 에 위치 지정하여 삭제하기 : "+aList3.toString());
		
		// 5. remove - 값을 삭제
		aList3.remove(new Integer(2)); //(처음 등장하는 값 삭제)
		System.out.println("aList3 에 값을 삭제하기 : "+aList3.toString());
		
		// 6. clear - 전부 삭제
		aList3.clear(); //(처음 등장하는 값 삭제)
		System.out.println("aList3 전부 삭제하기 : "+aList3.toString());
		
		// 7. isEmpty() - 비어있는지 확인
		System.out.println("aList3 비어있는지 확인 : "+aList3.isEmpty());
		
		// 8. size - 크기를 확인
		System.out.println("aList1 크기 확인 : "+aList1.size());
		System.out.println("aList2 크기 확인 : "+aList2.size());
		System.out.println("aList3 크기 확인 : "+aList3.size());
		
		// 10. get - index로 가져오기
		System.out.println(aList2.get(0));
		System.out.println(aList2.get(1));
		System.out.println(aList2.get(2));
		
		for(int i = 0; i<aList2.size();i++) {
		System.out.println(i+"번째 값 :"+aList2.get(i));	
		}
		
				
	}
}
