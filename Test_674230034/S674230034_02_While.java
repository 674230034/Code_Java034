package Test_674230034;
import java.util.Scanner;
public class S674230034_02_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณาใส่จำนวนเต็ม: ");
        int number = sc.nextInt();

        int sum = 0;
        int n = 1;
        while(n <= number){
            System.out.print(" ");
            sum += n;
            n++;
        }
        System.out.println("ผลรวมตั้งแต่ 1 ถึง " + number + " คือ " + sum);
    }
}
