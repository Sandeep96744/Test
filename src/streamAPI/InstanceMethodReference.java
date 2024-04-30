package streamAPI;

class Person {
    private int age;
    public Person(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }
}

interface AgeChecker {
    boolean checkAge(Person person);
}

public class InstanceMethodReference {
    public static void main(String[] args) {
        Person person = new Person(25);

        AgeChecker ageChecker = Person::isAdult;
        System.out.println(ageChecker.checkAge(person));

    }
}
