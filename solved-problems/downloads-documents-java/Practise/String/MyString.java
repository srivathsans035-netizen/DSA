final public class MyString{
	
	private final char [] arr;
	
	public MyString(){
		this.arr = new char[0];
	}
	
	public MyString(String str){
		arr = str.toCharArray();
	}
	
	public MyString(MyString obj){
		arr = obj.arr.clone();
	}
	//clone()
	
	public MyString(char [] arr){
		this.arr = arr.clone();
	}
	
	public int length(){
		if(arr == null){
			return 0;
		}
		else{
		return arr.length;
		}
	}
	
	public boolean isEmpty(){
		if( this.length() == 0){
			return true;
		}
		return false;
	}
	
	public boolean isBlank(){
		int n = this.length();
		if(n == 0){
			return false;
		}
		for(int i = 0; i < n; i++){
			if(arr[i] != ' '){
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(MyString str){
		if(str.length() != this.length()){
			return false;
		}
		else{
			int n = this.length();
			for(int i = 0; i < n; i++){
				if(this.charAt(i) != str.charAt(i)){
					return false;
				}
			}
			return true;
		}
	}
	
	public boolean equalsIgnoreCase(MyString str){
		if(str.length() != this.length()){
			return false;
		}
		else{
			int n = this.length();
			for(int i = 0; i < n; i++){
				char a = this.charAt(i);
				char b = str.charAt(i);
				if(Character.toLowerCase(a) != Character.toLowerCase(b)){
					return false;
				}
			}
			return true;
		}
	}
	
	public char charAt(int index){
		if(this.isEmpty() || isBlank()){
			System.out.println("The object is blank or empty");
			return ' ';
		}
		
		if(index < 0 || index >= this.length()){
			throw new IndexOutOfBoundsException();
		}
		
		else{
			return arr[index];
		}
	}
	
	public int indexOf(char c){
		int n = this.length();
		if(this.length() == 0){
			System.out.println("Empty MyString");
			return -1;
		}
		
		for(int i = 0; i < n; i++){
			if(this.charAt(i) == c){
				return i + 1;
			}
		}
		
		System.out.println("Character not found!");
		return -1;
	}
	
	public int lastIndexOf(char c){
		int n = this.length();
		if(this.length() == 0){
			return -1;
		}
		
		for(int i = n - 1; i >= 0; i--){
			if(this.charAt(i) == c){
				return i + 1;
			}
		}
		return -1;
	}
	
	public int hashCode(){
		int hash = 0;
		for (char c : arr) {
			hash = 31 * hash + c;
		}
			return hash;
	}
	//need to rewrite
	
	public MyString replace(char c, int index){
		if(this.length() == 0 || index <= 0 || index > this.length()){
			throw new IndexOutOfBoundsException();
		}
		char [] temp = new char[this.length()];
		for(int i = 0; i < this.length(); i++){
			if(i == index - 1){
				temp[i] = c;
			}
			else{
				temp[i] = arr[i];
			}
		}
		return new MyString(temp);
	}
	
	public MyString replaceAll(char p, char n){
		char [] temp = new char[this.length()];
		for(int i = 0; i < this.length(); i++){
			if(this.charAt(i) == p){
				temp[i] = n;
			}
			else{
				temp[i] = this.charAt(i);
			}
		}
		return new MyString(temp);
	}
	
	public boolean contains(String str){
		
		if(str.length() > this.length()){
			return false;
		}
		int i = 0;
		int j = 0;
		int k = 0;
		while(j < this.length() && k < str.length()){
			
			if(this.charAt(j) == str.charAt(k)){
				j++;
				k++;
			}
			else{
				i++;
				j = i;
				k = 0;
			}
		}
		return k == str.length();
	}
	
	public boolean contains(MyString str){
		
		if(str.length() > this.length()){
			return false;
		}
		int i = 0;
		int j = 0;
		int k = 0;
		while(j < this.length() && k < str.length()){
			
			if(this.charAt(i) == str.charAt(k)){
				j++;
				k++;
			}
			else{
				i++;
				j = i;
				k = 0;
			}
		}
		return k == str.length();
	}
	
	public String subString(int i, int j){
		String str = "";
		if(i <= 0 || i > this.length() || j <= 0 || j > this.length()){
			throw new IndexOutOfBoundsException();
		}
		i = i - 1;
		j = j - 1;
		while(i <= j){
			str += this.charAt(i);
			i++;
		}
		return str;
	}
	
	public MyString copyValueOf(String s){
		char [] temp = new char[s.length()];
		for(int i = 0; i < s.length(); i++){
			temp[i] = s.charAt(i);
		}
		return new MyString(temp);
	}
	
	public MyString copyValueOf(MyString s){
		char [] temp = new char[s.length()];
		for(int i = 0; i < s.length(); i++){
			temp[i] = s.charAt(i);
		}
		return new MyString(temp);
	}
	
	public boolean equalsIgnoreCase(String str){
		if(this.length() != str.length()){
			return false;
		}
		
		for(int i = 0; i < this.length(); i++){
			if(Character.toLowerCase(this.charAt(i)) != Character.toLowerCase(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(String str){
		if(this.length() != str.length()){
			return false;
		}
		
		for(int i = 0; i < this.length(); i++){
			if((this.charAt(i)) != (str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	public int compareTo(String str) {
		int i = 0;
		int minLen = Math.min(this.length(), str.length());
		while (i < minLen) {
			char a = arr[i];
			char c = str.charAt(i);
			if (a != c) {
				return a - c;
			}
				i++;
		}
		return this.length() - str.length();
	} 
    //need to rewrite

	public String toString(){
		
		if(this.isEmpty() || this.isBlank()){
			return new String();
		}
		else{
			return new String(arr);
		}
	}
	
}
				
		
		