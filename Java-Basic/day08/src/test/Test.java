package test;

public class Test {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+",");
		System.out.println(a[i+1]);
		if ((i+1) == 4) {
			break;
		}
		}
	}
}
