package day5;

public class ExPm_strKind {
	public static void main(String[] args) {
//		String str1 = "안녕"+"하세요"+"!";
//		System.out.println(str1);
//		
//		String str2 = "he";
//		str2 += "llo";
//		str2 += "!";
//		System.out.println(str2);
		
		String str1 = "Hello Java";
		
		System.out.println(str1.length());
		
		System.out.println(str1.charAt(1));
		
		System.out.println(str1.indexOf('a'));
		
		System.out.println(str1.lastIndexOf('a'));
		
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		String str6 = "Java Study";
		System.out.println(str6.toLowerCase());
		System.out.println(str6.toUpperCase());
		
		System.out.println(str6.replace("Study", "Learning"));
		
		System.out.println(str6.substring(0,5));
		
		System.out.println("     a      ".trim());
	}
}
