import java.util.Scanner;

public class W5_Test1_674230034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("My Name: ");
        String name = sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Diagonal1: ");
        double rhombus1 = sc.nextDouble();
        System.out.println("Enter Diagonal2: ");
        double rhombus2 = sc.nextDouble();

        double area;
        double base = 0.5;
        area = base * rhombus1 * rhombus2;
        System.out.println("พื้นที่สี่เหลี่ยมขนมเปียกปูนคือ" + area);
    }
}
