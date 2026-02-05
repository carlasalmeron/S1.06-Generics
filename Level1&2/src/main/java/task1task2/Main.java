package task1task2;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Carla","Salmerón",27);
        Person person1 = new Person("Milagros","Bermúdez",39);

        System.out.println("-----Generic Method with Multiple Parameters-----");
        GenericMethods.printElements(2026, "First Test", person);

        System.out.println("\n-----Partial Generic Method-----");
        GenericMethods.printElements("Second Test", person1, 100);
        System.out.println();
        GenericMethods.printElements("Third Test", 3.5, "Hello");

        System.out.println("\n-----Generic Varargs Method-----");
        GenericMethods.printAll(person, person1);
        System.out.println();
        GenericMethods.printAll(1, 2, 3, 4, 5);
    }
}
