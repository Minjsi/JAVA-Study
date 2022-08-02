package day28_HW29;

import java.util.*;

public class Question_264 {
	public static void main(String[] args) {
		// n을 입력받는다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 자동 정렬, 중복 제거해주는 TreeSet을 사용한다.
		TreeSet<Integer> aglySet = new TreeSet<>();
		
		// 2 * 3 * 5로 이루어지는 곱셈값을 구해야 한다.
		// 2, 3, 5로만 이루어진 수를 구하기 위해서는 2^지수 * 3^지수 * 5^지수 를 구해야하고,
		// 이를 통해 나올 수 있는 숫자의 가짓수는 지수^3이 된다.
		
		// 2, 3, 5의 지수로 나올 수 있는 수를 구하기 위해 각각 for문을 돌려 어글리 넘버를 구했다.
		// TreeSet의 크기는 n보다 크면 된다.
		// 어차피 지수^3이므로 for문의 조건은 넉넉히 해도 된다. (나는 대강 n/2로 했다)
		for(int i = 0 ; i < n/2 ; i++) {
			for(int j = 0 ; j < n/2 ; j++) {
				for(int k = 0 ; k < n/2 ; k++) {
					aglySet.add((int)Math.pow(2, i) // 2^0부터 n/2승까지
							*(int)Math.pow(3, j) // 3^0부터 n/2승
							*(int)Math.pow(5, k)); // 5^0부터 n/2승
				}
			}
		}
		// 문제에서 요구하는 index를 구하기 위해 변수 설정
		int index = 1;
		for (Integer k : aglySet) { // for문을 돌려서 index에 걸리는 숫자를 출력한다.
			if (index == n) {
				System.out.println(k);
			}
			index++;
		}
	}
}
