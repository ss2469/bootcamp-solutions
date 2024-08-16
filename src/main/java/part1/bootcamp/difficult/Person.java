package part1.bootcamp.difficult;

// Used in QUICK SORT Algorithm (Program_03) - sort an array of Person objects based on their age using quicksort

public class Person {

	private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return name + ", " + "age = " + age;
    }
	
}
