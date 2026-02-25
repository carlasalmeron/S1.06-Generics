package task1task2;

public record Person(String name, String surname, int age) {

    @Override
    public String toString() {
        return "Person: " + name + " " + surname + ", " + age;
    }
}
