class Car extends Vehicle {
    String color;
    int numDoors;

    Car(String make, String model, int year, String color, int numDoors) {
        super(make, model, year);
        this.color = color;
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Make: " + make +
               "\nModel: " + model +
               "\nYear: " + year +
               "\nColor: " + color +
               "\nNumber of Doors: " + numDoors;
    }
}