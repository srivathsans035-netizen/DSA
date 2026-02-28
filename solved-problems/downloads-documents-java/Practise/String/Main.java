import java.util.Scanner;

class Main{
	
	public static void main(String [] args){
		
		Scanner sc    = new Scanner(System.in);
		
		MyString str  = new MyString(new char [] {'h','e','l','l','o'});
		
		MyString str2 = new MyString(new char [] {'h','e','l','l','o'});
		
		MyString str4 = new MyString(str2);
		
		MyString str5 = str4;
		
		MyString str3 = new MyString();   
		
		MyString str6 = new MyString(new char [] {' ',' '});
		
		MyString str7 = new MyString("Hello");
		
		System.out.println(str.length());
		
		System.out.println(str.equals(str2));
		System.out.println(str4.equals(str2));
		System.out.println(str4.equals(str5));
		
		System.out.println(str3.isEmpty());
		System.out.println(str.isEmpty());
		
	
		System.out.println(str2.charAt(0));
		System.out.println(str2.charAt(2));
		
		System.out.println(str.equalsIgnoreCase(str2));
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str.indexOf('c'));
		System.out.println(str.indexOf('e'));
		System.out.println(str3.indexOf('c'));
		
		System.out.println(str3.isBlank());
		System.out.println(str2.isBlank());
		System.out.println("Is Blank : " +str6.isBlank());
		
		System.out.println(str.lastIndexOf('l'));
		System.out.println(str.lastIndexOf('L'));
		
		System.out.println(str7);
		System.out.println(str5 == str4);
		System.out.println(str2 == str4);
		
		System.out.println(str7.hashCode());
		System.out.println(str7.hashCode());
		
		
		System.out.println(str.equalsIgnoreCase("Hello"));
		
		MyString str8 = new MyString("Hello");
		
		System.out.println(str.equals("hello"));
		System.out.println(str7.replace('e',3));
		
		System.out.println(str8.replaceAll('e','o'));
		
		System.out.println(str8.copyValueOf("Hello"));
		
		MyString str9 = new MyString("");
		System.out.println(str9);
		
		System.out.println(str.subString(1,3));
		
		System.out.println(str9.copyValueOf(str));
		
		System.out.println(str.contains("elo"));
		
		System.out.println(str.contains(str2));
		
		System.out.println(str.compareTo("hel"));
		
		
	}
}
		
		