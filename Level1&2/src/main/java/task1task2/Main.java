package task1task2;

public class Main {
    public static void main(String[] args) {

        System.out.println("----- Record Person -----");
        Person person = new Person("Carla", "Salmerón", 27);
        Person person1 = new Person("Milagros", "Bermúdez", 39);
        System.out.println(person);
        System.out.println("Name: " + person.name());

        System.out.println("\n----- Generic Method with Multiple Parameters -----");
        GenericMethods.printElements(2026, "First Test", person);

        System.out.println("\n----- Partial Generic Method -----");
        GenericMethods.printElements("Second Test", person1, 100);
        System.out.println();
        GenericMethods.printElements("Third Test", 3.5, "Hello");

        System.out.println("\n----- Generic Varargs Method -----");
        GenericMethods.printAll(person, person1, "More elements", 42);

        System.out.println("\n----- Bounded Generic Method (Numbers Only) -----");
        GenericMethods.printNumber(10);
        GenericMethods.printNumber(15.5);

        System.out.println("\n----- Non-Generic Comparison -----");
        NoGenericMethods noGen = new NoGenericMethods("E1", "E2", "E3");
        System.out.println(noGen);
    }
}
