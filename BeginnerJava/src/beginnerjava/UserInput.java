package beginnerjava;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int number;
//        System.out.println("Enter any number: ");
//        number = input.nextInt();
//        System.out.println("Number = " + number);

        String name;
        System.out.print("Enter your Name: ");
        name = input.nextLine();
        System.out.println("Welcome : " + name);
    }
}
