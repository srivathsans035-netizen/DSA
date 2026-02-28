class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        super(4);
        this.length = length;
        this.width = width;
        this.area = length * width;
    }

    @Override
    public String toString() {
        return "Rectangle Details:\n" +
               "Sides: " + numSides + "\n" +
               "Length: " + length + "\n" +
               "Width: " + width + "\n" +
               "Area: " + area;
    }
}
