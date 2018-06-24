package java8.Lambda;

import java.util.Arrays;
import java.util.function.Predicate;

class EventNumberLambda {
	static boolean isEvenNumber(int number) {
		return (number %2) == 0;
	}
	
	static int[] generateEventNumber(int [] eventNumberArray, Predicate<Integer> p) {
		
		int numberArrayLength = eventNumberArray.length;
		
		int generateNumber = 1;
		
		for(int index = 0; index < numberArrayLength; ) {
			
			if(p.test(generateNumber)) {
				eventNumberArray[index] = generateNumber;
				index++;
			}
			
			generateNumber++;
		}
		
		return eventNumberArray;
		
	}
	
	public static void main(String[] args) {

		int [] evenNumberArray = new int [10];
	
		evenNumberArray = generateEventNumber(evenNumberArray, (number) -> EventNumberLambda.isEvenNumber(number));
		
		System.out.println("Event Number Array (lambda expression) : " + Arrays.toString(evenNumberArray));
		
		evenNumberArray = new int [10];
		
		evenNumberArray = generateEventNumber(evenNumberArray, new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer number) {
				return EventNumberLambda.isEvenNumber(number);
			}
		});
		
		System.out.println("Event Number Array (Anonymous class)   : " + Arrays.toString(evenNumberArray));
		
		evenNumberArray = new int [10];
		
		evenNumberArray = generateEventNumber(evenNumberArray, EventNumberLambda::isEvenNumber);
		
		System.out.println("Event Number Array (Method Reference)  : " + Arrays.toString(evenNumberArray));
	}
}

