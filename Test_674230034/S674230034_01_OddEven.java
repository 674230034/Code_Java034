package Test_674230034;
import java.util.Scanner;
public class S674230034_01_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณาป้อนตัวเลข: ");
        int number = sc.nextInt();

        int result = number % 2;
         if(result == 0){
            System.out.println("ตัวเลข " + number + " เป็นเลขคู่");
         }else{
            System.out.println("ตัวเลข " + number + " เป็นเลขคี่");
         }
    }
}
