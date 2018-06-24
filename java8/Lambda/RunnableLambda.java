package java8.Lambda;

public class RunnableLambda {
    public static void main(String[] args) {
        
    	Runnable r = ()->{System.out.println("Runnable as Lambda expression");};

        // Passing runnable instance
        new Thread(r).start();
        
     // Runnable using lambda
        new Thread(()->System.out.println("Runnable as Lambda expression")).start();
    }
}