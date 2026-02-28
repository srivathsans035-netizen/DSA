import java.util.Scanner;
class most_freq{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine().toLowerCase().replaceAll("\\s", "");
		int freq [] = new int[26];
		char [] arr = str.toCharArray();
		for(char ch : arr){
			if(ch >= 'a' && ch <= 'z'){
				freq[ch - 'a']++;
			}
		}
		int max = 0;
		int index = 0;
		for(int i = 0; i < freq.length; i++){
			if(freq[i] > max){
				max = freq[i];
				index = i;
			}
		}
		char mostfreq = (char) (index + 'a');
		System.out.print("The most frequent letter is : " + mostfreq);
		sc.close();
	}
}