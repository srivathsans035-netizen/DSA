class Dog extends Animal{
	
	private String color;
	private String breed;
	
	public Dog(String color, String breed,String name,int age,String species){
		super(name,age,species);
		this.color = color;
		this.breed = breed;
	}
	
	@Override
	public String toString(){
		return "Name : " + getName() + "\nAge : " + getAge() + "\nSpecies : " + getSpecies() + "\nColor : " + color + "\nbreed : " + breed;
	}
}