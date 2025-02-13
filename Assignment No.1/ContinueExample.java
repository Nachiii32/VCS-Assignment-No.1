//Write a Java program that demonstrates the use of the continue statement in a loop.
public class ContinueExample {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 1 and 10 are:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip the rest of the loop for even numbers
            }
            System.out.println(i); // This line executes on
            
            ly for odd numbers
        }
    }
}
