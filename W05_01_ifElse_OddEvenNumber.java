import java.util.Scanner;

public class W05_01_ifElse_OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int result = number % 2;

        // case1
        if (result == 1) {
            System.err.println(number + " is an ood number. ");
        } else {
            System.err.println(number + " is an even number.");
        }

        // case2
        if (result != 0) {
            System.err.println(number + " is an ood number. ");
        } else {
            System.err.println(number + " is an even number.");
        }

        // case3
        if (result == 0) {
            System.err.println(number + " is an even number. ");
        } else {
            System.err.println(number + " is an ood number.");
        }

        // case4
        if (result != 1) {
            System.err.println(number + " is an even number. ");
        } else {
            System.err.println(number + " is an ood number.");
        }

    }
}