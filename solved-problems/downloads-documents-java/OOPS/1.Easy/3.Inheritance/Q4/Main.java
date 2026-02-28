public class Main {
    public static void main(String[] args) {
        Student s = new Student("Arun", 16, "Chennai", "10th", "ABC School");

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Address: " + s.address);
        System.out.println("Grade: " + s.grade);
        System.out.println("School: " + s.school);
    }
}
