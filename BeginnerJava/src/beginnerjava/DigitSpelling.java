package beginnerjava;

import java.util.Scanner;

public class DigitSpelling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.println("Enter any Digit: ");
        digit = input.nextInt();

        switch (digit) {
            case 0 ->
                System.out.println("Zero");
            case 1 ->
                System.out.println("One");
            case 2 ->
                System.out.println("Two");
            case 3 ->
                System.out.println("Three");
            case 4 ->
                System.out.println("Four");
            case 5 ->
                System.out.println("Five");
            case 6 ->
                System.out.println("Six");
            case 7 ->
                System.out.println("Seven");
            case 8 ->
                System.out.println("Eight");
            case 9 ->
                System.out.println("Nine");
            default ->
                System.out.println("Not a digit");
        }
    }
}
