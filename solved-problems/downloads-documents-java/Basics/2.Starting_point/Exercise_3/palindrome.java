import java.util.Scanner;

class palindrome{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String str = sc.nextLine();
		String text = str.replaceAll("\\s+", "");
		int i = 0;
		int j = text.length() - 1;
		boolean flag = true;
		while(j > 1){
			char ch = Character.toLowerCase(text.charAt(i));
			char ch2 = Character.toLowerCase(text.charAt(j));
			if(ch != ch2){
				flag = false;
				break;
			}
			else{
				i++;
				j--;
			}
		}
		System.out.println(flag);
		sc.close();
	}
}
