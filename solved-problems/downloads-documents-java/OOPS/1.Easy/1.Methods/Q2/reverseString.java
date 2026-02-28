import java.util.Scanner;

class reverseString{
	
	public static String reverse(String str){
		String rev = "";
		int n = str.length();
		int j;
		for(int i = n - 1; i >= 0; i--){
			rev += str.charAt(i);
		}
		return rev;
	}
	
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String str = sc.nextLine();
		String rev = reverse(str);
		System.out.println("Reversed String : " + rev);
		sc.close();
	}
}
		