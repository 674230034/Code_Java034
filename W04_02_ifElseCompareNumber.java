import java.util.Scanner; // นำเข้าคลาส Scanner จาก Package java.util

public class W04_02_ifElseCompareNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        int result = 0;

        if (num1 > num2) {
            result = num1 - num2;
            System.out.println("The number 1 is greater then the number 2");
        } else {
            result = num1 + num2;
            System.out.println("The number 1 is less then or equal the number 2");
        }
        System.out.print("The result is: " + result);
    }
}