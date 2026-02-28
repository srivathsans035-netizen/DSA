import java.util.Scanner;
class anagram{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String a = sc.nextLine().replaceAll("\\s", "").toLowerCase();
		System.out.print("Enter the second string : ");
		String b = sc.nextLine().replaceAll("\\s", "").toLowerCase();
		if(a.length() != b.length()){
			System.out.print("Not an anagram");
			sc.close();
			return;
		}
		char [] arr_1 = new char[a.length()];
		char [] arr_2 = new char[b.length()];
		int n = a.length();
		for(int i = 0; i < n; i++){
			arr_1[i] = a.charAt(i);
			arr_2[i] = b.charAt(i);
		}
		int [] freq = new int[26];
		for(char c : arr_1){
			freq[c - 'a']++;
		}
		for(char c : arr_2){
			freq[c - 'a']--;
		}
		
		boolean isAnagram = true;
		for(int i : freq){
			if(i != 0){
				isAnagram = false;
				break;
			}
		}
		if(!isAnagram){
			System.out.print("Not an anagram");
		}
		else{
			System.out.print("Anagram");
		}
		sc.close();
	}
}
		
		