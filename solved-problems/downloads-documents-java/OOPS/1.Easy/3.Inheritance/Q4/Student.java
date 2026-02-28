class Student extends Person {
    String grade;
    String school;

    Student(String name, int age, String address, String grade, String school) {
        super(name, age, address);
        this.grade = grade;
        this.school = school;
    }
}
