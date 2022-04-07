import java.util.Scanner;

public class InputProgram {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int iterations;
        int increment;

        System.out.print("Number of Iterations: ");
        iterations = input.nextInt();

        for (int j = 0; j <= iterations; j++) {
            System.out.println(j);
        }

        System.out.print("Increment Size: ");
        increment = input.nextInt();

        for (int j = 0; j <= iterations; j += increment) {
            System.out.println(j);
        }

        input.close();
    }
}
