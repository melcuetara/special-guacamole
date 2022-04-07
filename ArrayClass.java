import java.util.Scanner;

public class ArrayClass {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] arrName = new String[5];

        System.out.print(System.lineSeparator());
        for (int i = 0; i < arrName.length; i++) {
            System.out.print("Enter person name at index " + i + ": ");
            arrName[i] = input.nextLine();
        }
        System.out.print(System.lineSeparator());
        for (int i = 0; i < arrName.length; i++) {
            System.out.println("Person at index " + i + " is " + arrName[i]);
        }
        input.close();
    }
}