import java.util.Scanner;

public class IfElseActivity {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age;

        System.out.print("Input age: ");
        age = input.nextInt();

        if (age < 13) {
            System.out.println(age + " is a Child");
        } else if (age < 20) {
            System.out.println(age + " is a Teen");
        } else if (age < 60) {
            System.out.println(age + " is an Adult");
        } else {
            System.out.println(age + " is an Old Age");
        }

        input.close();
    }
}
