class StaticVariables{
	
	private static int count = 0;
	
	public StaticVariables(){
		
		count = count + 1;
		
	}
	
	public static void print(){
		
		System.out.println(count);
		
	}
	
}