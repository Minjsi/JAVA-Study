package day5;

public class ExPm_equal {
	public static void main(String[] args) {
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str2 == str4);
//		전부 false 나옴
		
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str2.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
//		전부 true나옴
	}
}
