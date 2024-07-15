import java.util.Scanner; // นำเข้าคลาส Scanner จาก Package java.util

public class W04_01_AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // สร้างอ๊อบเจ็กต์ของคลาส Scanner
        System.out.print("ป้อนค่ารัศมีวงกลม: "); // แสดงข้อความที่ให้ผู้ใช้ป้อนค่ารัศมี
        double radius = sc.nextDouble(); // รับค่ารัศมีจากผู้ใช้และเก็บในตัวแปร radius
        // double radius = 10; // ประกาศตัวแปรเก็บค่ารัศมี

        double area; // ประกาศตัวแปรเก็บค่าพื้นที่
        double PI = 3.14159; // ประกาศตัวแปรเก็บค่าคงที่
        if (radius > 0) {
            area = PI * radius * radius; // หาพื้นที่วงกลม
            System.out.println("พื้นที่วงกลมที่มีรัศมีเท่ากับ" + radius + "คือ " + area);
        } else {
            System.out.println("กรุณาใส่ตัวเลขที่มากกว่า 0");
        }
    }
}
