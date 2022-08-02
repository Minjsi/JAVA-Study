package day23_HW25;
import java.util.*;
public class Question {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	// Solution class 호출
	Solution solution = new Solution();

	// 사용자에게 버전 두 개 입력받음
	System.out.print("version1 = ");
	String v1 = sc.next();
	System.out.print("version2 = ");
	String v2 = sc.next();

	// 객체 호출해서 결과 프린트
	System.out.println(solution.version(v1, v2));
}
}

// 버전 비교하는 클래스
class Solution {
	// 사용자에게 입력받은 두 개의 버전을 입력값으로 가진다
	// 비교해서 0 또는 1 또는 -1을 return 한다.
	int version(String v1, String v2) {
		// 사용자에게 입력받은 v1과 v2를 split한다. array가 생성 되었으므로 Arrays.asList를 이용해
		// 새롭게 생성한 ArrayList에 바로 집어 넣어버린다.
		ArrayList<String> v1_list = new ArrayList<String>(Arrays.asList(v1.split("\\.")));
		ArrayList<String> v2_list = new ArrayList<String>(Arrays.asList(v2.split("\\.")));
		
		int output = 0; // 결과 값을 초기화 한다
		int size; // 두 버전을 비교하기 위해 for문을 돌리기 위해 size를 선언한다.
		
		// v1의 사이즈가 더 크면 for문은 v2.size()를 기준으로 돌린다.
		// v2의 사이즈가 더 크면 for문은 v1.size()를 기준으로 돌린다.
		if( v1_list.size() > v2_list.size()) {
			size = v2_list.size();
		} else {
			size = v1_list.size();
		}
		
		// for문을 실행해서 두 버전을 비교한다.
		for(int i = 0; i < size ; i++ ) {
			// 인덱스 0번부터 꺼낸다. 정수로 바꿔주는 과정을 거친다.
			int v1_num = Integer.parseInt(v1_list.get(i));
			int v2_num = Integer.parseInt(v2_list.get(i));
			
			// 두 숫자가 비교 가능하면 바로 1 또는 -1을 return하고 for문을 종료한다.
			if (v1_num > v2_num) {
				output = 1;
				break;
			}else if (v1_num < v2_num) {
				output = -1;
				break;
			// 대소 비교가 가능하면 바로 종료 !
				
			// for문을 다 돌렸는데도 두 버전의 값이 계속 같으면
			// size가 더 큰 버전에서, for문에서 확인하지 못한 뒤쪽 값들 중 0 이상인 것이 있는지 확인한다.
			}else if (v1_num == v2_num) {
				if( v1_list.size() > v2_list.size()) { // v1의 사이즈가 더 크면
					// v1 의 i+1번 인덱스부터 for문을 돌려서
					for(int j = i+1 ; j < v1_list.size() ; j ++) { 
						// 0 이상이면 바로 1을 return
						if (Integer.parseInt(v1_list.get(j)) > 0) output = 1;
					}
				} else if( v1_list.size() < v2_list.size()){ // v2의 사이즈가 더 크면
					// v2 의 i+1번 인덱스부터 for문을 돌려서
					for(int j = i+1 ; j < v2_list.size() ; j ++) {
						// 0 이상이면 바로 -1을 return
						if (Integer.parseInt(v2_list.get(j)) > 0) output = -1;
					}
				}
			// 위에서 1 또는 -1인 경우를 다 걸러주었으므로 나머지는 모조리 0으로 return
			}else {
				output = 0;
			}
		}
		// 위에서 정해진 output 리턴!!!
		return output;
	}
}

