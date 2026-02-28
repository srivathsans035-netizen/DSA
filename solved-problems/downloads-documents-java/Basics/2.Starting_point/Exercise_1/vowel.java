import java.util.Scanner;

class vowel{

public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your string here: ");
	String str = sc.nextLine();
	boolean flag = false;
	for(int i = 0; i < str.length(); i++){
		char ch = Character.toLowerCase(str.charAt(i));
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			flag = true;
			break;
		}
	}
	System.out.println(flag);
	sc.close();
}
}