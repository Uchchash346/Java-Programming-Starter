package beginnerjava;

import java.util.Scanner;

public class SeriesDemo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter the last number: ");
        n = input.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//            sum = sum + i;
//        }
//        System.out.println(sum);
        for (int i = 1; i <= n; i = i + 1) {
            System.out.println(i + "X" + i + " ");
            sum = sum + i * i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
