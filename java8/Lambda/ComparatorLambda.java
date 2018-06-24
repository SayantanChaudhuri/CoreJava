package java8.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorLambda {

	public static void main(String[] args) {
		List<ComparatorLambda.Person> personList = createList();

		// comparator implementation as anonymous class
		// and sorting the list element on the basis of first name
		/*
		 * Collections.sort(personList, new Comparator<Person>() { public int
		 * compare(Person a, Person b) { return
		 * a.getFirstName().compareTo(b.getFirstName()); } });
		 */

		// Providing the comparator functional interface compare
		/// method as lambda exression
		Collections.sort(personList,
				(ComparatorLambda.Person a, ComparatorLambda.Person b) -> a.getFirstName().compareTo(b.getFirstName()));

		System.out.println("Sorted list with lambda implementation");
		// Using the new ForEach loop of Java 8
		// used with lambda expression
		personList.forEach((per) -> System.out.print(per.getFirstName() + " "));

	}

	// Utitlity method to create list
	private static List<Person> createList() {
		List<ComparatorLambda.Person> tempList = new ArrayList<ComparatorLambda.Person>();
		ComparatorLambda.Person person = new ComparatorLambda.Person("Ram", "Tiwari", 50);
		tempList.add(person);
		person = new Person("John", "Myers", 13);
		tempList.add(person);
		person = new Person("Tanuja", "Trivedi", 30);
		tempList.add(person);
		person = new Person("Amy", "Jackson", 40);
		tempList.add(person);
		System.out.println("List elements are - ");
		System.out.println(tempList);
		return tempList;
	}

	public static class Person {
		private String firstName;
		private String lastName;
		private int age;

		Person(String firstName, String lastName, int age) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public int getAge() {
			return age;
		}

		public String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append(getFirstName()).append(" ");
			sb.append(getLastName()).append(" ");
			sb.append(getAge()).append(" ");
			return sb.toString();
		}
	}
}
