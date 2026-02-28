import java.util.Scanner;

class isPalindrome{
	public static void checkPalindrome(String str){
		String c = "";
		int n = str.length();
		for(int i = 0; i < n; i++){
			if(str.charAt(i) != ' '){
				c += str.charAt(i);
			}
		}
		int i = 0;
		int j = c.length() - 1;
		boolean val = true;
		while(i < j){
			if(Character.toLowerCase(c.charAt(i)) != Character.toLowerCase(c.charAt(j))){
				val = false;
				System.out.println("Given string is not a palindrome");
				return;
			}	
			i++;
			j--;
		}
		if(val){
			System.out.println("The given string is palindrome");
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String str = sc.nextLine();
		checkPalindrome(str);
		sc.close();
	}
}
				
				