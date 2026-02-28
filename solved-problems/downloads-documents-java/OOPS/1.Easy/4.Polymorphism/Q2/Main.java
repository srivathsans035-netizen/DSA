public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();   // Animal version

        Animal d = new Dog();
        d.speak();   // Dog version (overridden)

        Animal c = new Cat();
        c.speak();   // Cat version (overridden)
    }
}