class Cat extends Animal {
    private String color;
    private int numLives;

    public Cat(String name, int age, String species, String color, int numLives) {
        super(name, age, species);
        this.color = color;
        this.numLives = numLives;
    }
	
	@Override
    public String toString() {
        return "Name : " + name +
               "\nAge : " + age +
               "\nSpecies : " + species +
               "\nColor : " + color +
               "\nNumLives : " + numLives;
    }
}
