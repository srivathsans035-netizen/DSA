import java.util.Scanner;
class repeated{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine().replaceAll("\\s", "");
		int [] freq = new int[26];
		char [] arr = new char[str.length()];
		for(int i = 0; i < str.length(); i++){
			arr[i] = Character.toLowerCase(str.charAt(i));
		}
		for(int i = 0; i < arr.length; i++){
			if(arr[i] >= 'a' && arr[i] <= 'z'){
				freq[arr[i] - 'a']++;
			}
		}
		char ans = '\0';
		for(int i = 0; i < freq.length; i++){
			char ch = str.charAt(i);
			if(freq[ch - 'a'] == 1){
				ans = ch;
				break;
			}
		}
		if(ans == '\0'){
			System.out.print("No non repeated character found");
		}
		else{
			System.out.print("First non repeated character: " + ans);
		}
		sc.close();
	}
}
