record Person(String name, int age) {
    // Custom constructor for validation
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // Custom method
    public String greeting() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
}

// Main.java - The main class to run the program
public class Records {
    public static void main(String[] args) {
        // Creating an instance of the Person record
        Person person = new Person("John Doe", 25);

        // Accessing record components (fields)
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());

        // Using the custom method
        System.out.println(person.greeting());

        // Using the toString() method (automatically generated)
        System.out.println(person);
    }
}
