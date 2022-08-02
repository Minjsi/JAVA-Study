package test;

import java.util.*;

public class test {
	public static int n, m; // 미로의 크기
	public static int search_count = 0; // 미로 탐색 수
	public static int[][] map = new int[1000][1000]; // 미로 사이즈 생성
	public static int min = n * m;

	// DFS 탐색
	public static int dfsRootSearch(int x, int y, int r) {
		int goal_x = n-1, goal_y = m-1;
		// 목표 지점에 도달했다면
		if (x == goal_x && y == goal_y) {
			++search_count;
			System.out.println(search_count + "차 미로 탐색 종료");

			// 목표 지점에 도착했음을 표시하기 위해, 2로 설정
			map[x][y] = 2;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();

			// 최단 경로값이 r보다 크면, r이 작은 것이므로 r을 최단 경로값으로 지정
			if (min > r) {
				min = r;
			}

			// 되돌아갈 경우
			// 방문했던 좌표를 방문가능한 상태로 되돌리기 위해 0을 값으로 설정
			map[x][y] = 1;
		}

		// 해당 좌표를 방문했음을 표시하기 위해 2를 값으로 설정
		map[x][y] = 2;

		// 미로의 상하좌우 탐색
		// 방문한 좌표값 : 2
		// 방문 불가능한 좌표값 : 0
		// 방문 가능한 좌표값 : 1
		// 해당 좌표로 이동이 가능할 경우, 이동할 좌표를 설정하고 길이를 1 증가시켜 dfsRootSeach() 호출

		// 위로 이동
		// x축의 좌표가 0보다 크고, 이동할 좌표가 이미 방문했거나, 불가능한 곳이 아닌 경우
		if (x > 0 && map[x - 1][y] != 2 && map[x - 1][y] != 0) {
			dfsRootSearch(x - 1, y, r + 1);
		}

		// 아래로 이동
		// x축 좌표가 미로의 세로 길이보다 작고, 이동할 좌표가 이미 방문했거나, 불가능한 곳이 아닌 경우
		if (x < n - 1 && map[x + 1][y] != 2 && map[x + 1][y] != 0) {
			dfsRootSearch(x + 1, y, r + 1);
		}

		// 왼쪽로 이동
		// y축의 좌표가 0보다 크고, 이동할 좌표의 값이 방문했거나, 불가능한 곳이 아닌 경우
		if (y > 0 && map[x][y - 1] != 2 && map[x][y - 1] != 0) {
			dfsRootSearch(x, y - 1, r + 1);
		}

		// 오른쪽로 이동
		// y축의 좌표가 미로 가로 길이보다 작고, 이동할 좌표의 값이 방문했거나, 불가능한 곳이 아닌 경우
		if (y < m - 1 && map[x][y + 1] != 2 && map[x][y + 1] != 0) {
			dfsRootSearch(x, y + 1, r + 1);
		}

		// 되돌아갈 경우
		// 방문했던 좌표를 방문가능한 상태로 되돌리기 위해 1을 값으로 설정
		map[x][y] = 1;
		
		return min;
	}
	
	
	public static void main(String[] args) {
		int[][] map = new int[1000][1000]; // 미로 사이즈 생성
		
		// map 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("N을 입력하세요 (4<=N, M<=200) : ");
		n = sc.nextInt();
		System.out.print("M을 입력하세요 (4<=N, M<=200) : ");
		m = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		
		for (int i = 0; i < n; i++) { // 2차원 리스트의 맵 정보 입력 받기
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = str.charAt(j) - '0';
				// 문자값에서 int로 변환시키면 아스키코드 값이 나온다. '0'을 빼서 int로 바꾸어준다.
				// 다시 말해, string형을 char형으로 문자 하나하나씩 받고 그걸 숫자형으로 변환하여 sum에 더함.
			}
		}
		// 미로의 좌표와 길이 l을 매개변수로 dfsRootSearch() 호출
		// 생성한 미로에서 map[0][0] 지점부터 탐색 시작
		// 경로의 길이 비교에 사용할 r의 초기값은 '1'로 설정

		
		// 최단 경로 출력
		System.out.println("\n\n미로의 최단 경로값 : " + dfsRootSearch(0, 0, 1)); // 정답 출력
	}
}
