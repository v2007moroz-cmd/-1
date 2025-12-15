    int operate(int a, int b); 
{
    default void printOperation(int result) {
        System.out.println("-> Результат операції: " + result);
    }
}


public class JavaInnovationsDemo {

    public static void main(String[] args) {
        
        System.out.println("--- 1. Демонстрація Лямбда-виразів (Java 8) ---");
        
 
        Calculator adder = (x, y) -> x + y; 
        
        int sum = adder.operate(15, 7);
        System.out.println("15 + 7 = " + sum);
        

        adder.printOperation(sum); 


        Calculator multiplier = (x, y) -> x * y;
        int product = multiplier.operate(5, 4);
        System.out.println("5 * 4 = " + product);
        
        System.out.println("\n--- 2. Демонстрація Stream API (Java 8) ---");

        java.util.List<String> fruits = java.util.Arrays.asList("apple", "banana", "orange", "apricot");
        

        fruits.stream()
              .filter(s -> s.startsWith("a")) 
              .map(String::toUpperCase)        
              .sorted()
              .forEach(s -> System.out.println("Знайдено: " + s)); 
              
        System.out.println("\n--- 3. Концепція Records (Java 16+) ---");

    }
}