package Test_674230034;
import java.util.Scanner;
public class S674230034_03_MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ตัวที่ 1: ");
        int n1 = sc.nextInt();
        System.out.print("ตัวที่ 2: ");
        int n2 = sc.nextInt();
        System.out.print("ตัวที่ 3: ");
        int n3 = sc.nextInt();

        int min = n1;
        if(n2 < min){
            min = n2;
        }
        if(n3 < min){
            min = n3;
        }
        System.out.println("ค่าที่น้อยที่สุดคือ: " + min); 
    }
}

