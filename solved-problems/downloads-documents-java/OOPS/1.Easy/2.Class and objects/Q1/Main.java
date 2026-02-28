class Main{
	
	public static void main(String args[]){
		
	Student s1 = new Student("Srivathsan", 23, 7.6);
	
	Student s2 = new Student("Ram Prasath", 23, 8.0);
	
	System.out.println(s1 + "\n" + s2);
	
	s1.setAge(24);
	
	s2.setGrade(8.22);
	
	System.out.println(s1 + "\n" + s2);
	
	}
}
	
	