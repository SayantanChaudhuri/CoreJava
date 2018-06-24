package java8.Lambda;

import java.util.Arrays;
import java.util.List;

interface ConstructorRef {

	void show(Integer i);
}

public class MethodReferences {
		
	public MethodReferences() {
	}
	
	MethodReferences(int i) {
	
		show(i);
	}
	
	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(1, 2, 3);
		
		
		/*******************************
		 * Static Method Reference
		 ******************************/
		
		// Method reference
        list.forEach(MethodReferences::print);
        // Lambda expression
        list.forEach(number -> MethodReferences.print(number));
        // normal
        for(int number : list) {
        	MethodReferences.print(number);
        }
        
        /*******************************
		 * Instance Method Reference
		 ******************************/
        
        MethodReferences ref = new MethodReferences();
        
        // Method reference
        list.forEach(ref::show);
        // Lambda expression
        list.forEach(number -> ref.show(number));
        // normal
        for(int number : list) {
        	ref.show(number);
        }
        
        
        /*******************************
		 * Type Method Reference
		 ******************************/
        
        final List<Person> people = Arrays.asList(new Person("Sayantan"), new Person("John"));
        // Method reference
        people.forEach(Person::printName);
        // Lambda expression
        people.forEach(person -> person.printName());
        // normal
        for (final Person person : people) {
            person.printName();
        }
        
        
        /*******************************
		 * Constructor Reference
		 ******************************/
        
        ConstructorRef ref1 = MethodReferences :: new;
        
        //Method Reference
        list.forEach(ref1::show);
        // Lambda expression
        list.forEach(number -> ref1.show(number));
        // normal
        for(int number : list) {
        	ref1.show(number);
        }
	}

	
	public static void print(final int number) {
        System.out.println("In printing: " + number);
    }
	
	public void show(final int number) {
        System.out.println("In show: " + number);
    }
	
	private static class Person {
        private String name;
        
        public Person(final String name) {
            this.name = name;
        }
        public void printName() {
            System.out.println(name);
        }
    }
}
