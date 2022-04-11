//1.Print sum of all numbers from 1 to 10
//2.Print sum of all numbers from m to n
//3.Print sum of all the even numbers from m to n
//4.Print sum of all the odd numbers from m to n
package beginnerjava;

import java.util.Scanner;

public class EvenNumberDemo {

    public static void main(String[] args) {
// solve of 1
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum = sum + i;
//        }
//        System.out.println("The sum is = " + sum);

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int m, n;
        System.out.println("Enter Initial Number: ");
        m = input.nextInt();
        System.out.println("Enter Final Number: ");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
