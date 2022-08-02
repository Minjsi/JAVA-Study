package day21_HW24;

import java.util.*;

public class Question_44_Ans {
	public static int n, m; 
	public static int[][] graph = new int[1000][1000];

	// DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문
	public static boolean dfs(int x, int y) {
		if (x <= -1 || x >= n || y <= -1 || y >= m) {
			return false;// 주어진 범위를 벗어나는 경우에는 즉시 종료
		}
		if (graph[x][y] == 0) { // 현재 노드를 아직 방문하지 않았다면
			graph[x][y] = 1; // 해당 노드 방문 처리
			// 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
			dfs(x - 1, y);
			dfs(x, y - 1);
			dfs(x + 1, y);
			dfs(x, y + 1);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // N, M을 공백을 기준으로 구분하여 입력 받기
		m = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		for (int i = 0; i < n; i++) { // 2차원 리스트의 맵 정보 입력 받기
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				graph[i][j] = str.charAt(j) - '0'; 
				// 문자값에서 int로 변환시키면 아스키코드 값이 나온다. '0'을 빼서 int로 바꾸어준다.
				// 다시 말해, string형을 char형으로 문자 하나하나씩 받고 그걸 숫자형으로 변환하여 sum에 더함.
			}
		}
		int result = 0; // 모든 노드(위치)에 대하여 음료수 채우기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (dfs(i, j)) { // 현재 위치에서 DFS 수행
					result += 1;
				}
			}
		}
		System.out.println(result); // 정답 출력
	}
}
