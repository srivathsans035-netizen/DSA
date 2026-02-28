class Main{
	
	public static void main(String [] args){
		
		Rectangle r1 = new Rectangle(10,15);
		
		Rectangle r2 = new Rectangle(15,20);
		
		double area = r1.getArea();
		
		double perimeter = r1.getPerimeter();
		
		System.out.print(area + "\n" + perimeter);
		
	}
	
}