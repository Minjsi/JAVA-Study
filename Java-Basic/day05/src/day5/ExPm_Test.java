package day5;

public class ExPm_Test {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int x : a)
			sum += x;
		System.out.println("합계 : " + sum);

		for (int each : a) {
			System.out.println(each);
		}
		
//		문제 2차원배열
		int[][] b = { { 1, 3, 5 }, { 7, 9 } };
//		내 방법
		for (int i = 0; i < b.length; i++) {
			int[] inArr = b[i];
			
			for (int j = 0; j < inArr.length; j++) {
				System.out.print(inArr[j] + " ");
			}
			
			System.out.println();
		}
		
//		by yoon 방법
		for(int i = 0; i<b.length; i++) {
			for(int j =0; j<b[i].length;j++) {
				System.out.println(b[i][j]);
			}
		}
		
//		String str indexOf(), lastIndexOf(), substring() 사용
		String str = "내 이름은 [김수연]입니다. 나이는 [15]살입니다";
		int name1 = str.indexOf('[');
		int name2 = str.indexOf(']');
		String name = str.substring(name1+1,name2);
		
		int age1 = str.lastIndexOf("[");
		int age2 = str.lastIndexOf("]");
		String age = str.substring(age1+1,age2);
		
		
		System.out.println(name);
		System.out.println(age);
		
		
		
		
//		///////////////////////////////////////////
	}
}
