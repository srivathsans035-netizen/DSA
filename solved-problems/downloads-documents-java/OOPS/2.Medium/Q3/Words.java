import java.util.ArrayList;

class Words{
	
	private int occurence;
	
	private String word;
	
	private static ArrayList<Words> wordlist = new ArrayList<>();
	
	public Words(String word){
		
		this(word,0);
		
	}
	
	public Words(String word, int occurence){
		
		this.word = word;
		
		this.occurence = occurence;
		
	}
	
	public void setOccurence(int occurence){
		
		this.occurence = occurence;
		
	}
	
	public int getOccurence(){
		
		return occurence;
		
	}
	
	public void setWord(String word){
		
		this.word = word;
		
	}
	
	public String getWord(){
		
		return word.toLowerCase();
		
	}
	
	public static void addWord(Words obj){
		
		boolean pres = false;
		
		for(Words word : wordlist){
				
			if(word.getWord().equals(obj.getWord())){
				
				word.setOccurence(word.getOccurence() + 1);
				
				pres = true;
				
				break;
				
			}
			
		}
		
		if(pres == false){
			
			wordlist.add(obj);
		
	    }
	
	}
	
	public static void printList(){
		
		for(int i = 0; i < wordlist.size() - 1; i++){
			
			for(int j = 0; j < wordlist.size() - i - 1; j++){
				
				if(wordlist.get(j).word.compareToIgnoreCase(wordlist.get(j+1).word) > 0){
					
					Words temp = wordlist.get(j);
					
					wordlist.set(j,wordlist.get(j+1));
					
					wordlist.set(j+1,temp);
				}
			}
		}
		
		for(Words str : wordlist){
			
			System.out.println(str);
			
		}
		
	}
	
	@Override
	
	public String toString(){
		
		return word + " Occurences : " + occurence;
		
	}
	
}
		
	