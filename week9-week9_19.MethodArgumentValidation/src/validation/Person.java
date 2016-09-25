package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40)
            throw new IllegalArgumentException("Name length must be 0 < x < 40");
        if (age < 0 || age > 120)
            throw new IllegalArgumentException("Age must be 0 < x < 120");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
