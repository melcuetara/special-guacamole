import java.util.Scanner;

class MyFirstJavaProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Addition");
        System.out.println("Input first number: ");
        int num = input.nextInt();
    
        System.out.println("Inupt second number: ");
        int num2 = input.nextInt();

        int sum = num + num2;
        System.out.println("Sum is: " +sum);
        
        System.out.println();
        System.out.println("Division");
        System.out.println("Input first number: ");
        double doubleNum = input.nextDouble();
    
        System.out.println("Inupt second number: ");
        double doubleNum2 = input.nextDouble();

        double quotient = doubleNum / doubleNum2;
        System.out.println("Quotient is: " +quotient);
        
        System.out.println();
        System.out.println("Multiplication");
        System.out.println("Input first number: ");
        float floatNum = input.nextFloat();
    
        System.out.println("Inupt second number: ");
        float floatNum2 = input.nextFloat();

        float product = floatNum * floatNum2;
        System.out.println("Product is: " +product);
        
        input.close();
    }
}