class Block{
	
	public int id;
	
	public static int initialValue = 0;
	
	public Block(){
		
		id = ++initialValue;
		
	}
	
	@Override
	public String toString(){
		
		return  id + "\n";
		
	}
	
}
	