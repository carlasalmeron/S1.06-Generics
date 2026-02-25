package task1task2;

public class GenericMethods {

    public static <T, U, V> void printElements(T element1, U element2, V element3) {
        System.out.println(element1 + "\n" +
                element2 + "\n" +
                element3);
    }

    public static <T, U> void printElements(String message, T element1, U element2) {
        System.out.println("Message: " + message + "\n" +
                element1 + "\n" +
                element2);
    }

    @SafeVarargs
    public static <T> void printAll(T... elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static <T extends Number> void printNumber(T number) {
        System.out.println("The number is: " + number.doubleValue());
    }
}
