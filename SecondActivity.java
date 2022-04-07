import java.util.Scanner;

public class SecondActivity {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] arrName = new String[5];
        int[] arrAge = new int[5];

        for (int i = 0; i < arrName.length; i++) {
            System.out.print(System.lineSeparator());
            System.out.print("Enter person " + i + "'s name: ");
            if (i != 0) {
                input.nextLine();
            }
            arrName[i] = input.nextLine();
            System.out.print("Enter " + arrName[i] + "'s age: ");
            arrAge[i] = input.nextInt();
        }
        System.out.print(System.lineSeparator());
        for (int i = 0; i < arrName.length; i++) {
            System.out.println(arrName[i] + " is " + arrAge[i] + " year old");
        }


        input.close();
    }
}
