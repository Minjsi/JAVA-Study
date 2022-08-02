package day21_HW24;

import java.util.*;
public class Question_44_test {
	public static int x, y;
	public static int [][] icepack = new int [1000][1000];
	public static void main(String[] args) {

		// 사용자에게 두 가지를 입력 받고, 얼음틀에 대한 설정을 한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("사이즈 입력");
		String input1 = sc.nextLine(); // 사이즈 입력
		String[] size_ar = input1.split("\\s+"); // 공백 기준으로 자름 (str 상태)
		x = Integer.parseInt(size_ar[0]); // 세로 길이 (str -> int로 바꿔서)
		y = Integer.parseInt(size_ar[1]); // 가로 길이 (str -> int로 바꿔서)

		System.out.println("얼음트레이 입력");
		int[][] icepack = new int[x][y]; // 좌표 처럼 쓰도록 2차원 배열 생성
		for (int i = 0; i < x; i++) { // 행마다
			String input2 = sc.nextLine(); // 얼음 트레이 상태 입력
			String[] input2_array = input2.split(""); // 사용자가 입력한 값을 한글자씩 배열에 따로 저장
			int y_index = 0; // icepack에 사용자가 입력한 0또는 1을 담기위한 인덱스 설정
			for (int j = 0; j < y; j++) { // 열 차례로 입력
				icepack[i][j] = Integer.parseInt(input2_array[y_index]); // 좌표에 사용자가 입력한 값을 넣음
				y_index++; // 두번쨰로 입력해서 넣은 배열의 인덱스를 증가시키기 위해 ++을 해줌
			}
		}

		// 이제 이웃한 곳에 0이 있는지 1이 있는지 확인
		int hole = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				// 현재 위치에서 DFS 수행
				if (dfs(i, j)) {
					hole += 1;
				}
			}
		}
		System.out.println(hole);
	}
		 // DFS로 특정 노드를 방문하고 상하좌우로 연결된 모든 노드들도 방문
        public static boolean dfs(int a, int b){
            // 주어진 범위를 벗어나는 경우에는 종료
            if(a <= -1 || a>= x || b <= -1 || b >= y)
                return false;
            
            //현재 노드를 아직 방문하지 않았다면
            if(icepack[a][b] == 0){
                //해당 노드 방문 처리
            	icepack[a][b] = 1;
                dfs(a -1, b);
                dfs(a, b -1);
                dfs(a + 1, b );
                dfs(a, b + 1);
                return true;
            }
            return false;

	}
}