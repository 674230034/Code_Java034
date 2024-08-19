package W10;

import java.util.Scanner;

public class W10_03_Login {
    public static void main(String[] args) {
        // สร้างตัวแปร
        String username = "praew";
        String password = "1234";

        Scanner kb = new Scanner(System.in);
        // สร้างตัวแปรเก็บ usernmae,password ที่ผู้ใช้ป้อนมา
        System.out.print("กรุณาป้อนชื่อผู้ใช้: ");
        String inputUsername = kb.nextLine();
        System.out.print("กรุณาป้อนรหัสผ่าน: ");
        String inputPassword = kb.nextLine();

        // ตรวจสอบเงื่อนไข
        if (username.equals(inputUsername) && password.equals(inputPassword)) {
            System.out.println("เข้าสู่ระบบสำเร็จ");
        } else {
            if (!username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("ชื่อผู้ใช้ไม่ถูกต้อง");
            } else if (username.equals(inputUsername) && !password.equals(inputPassword)) {
                System.out.println("รหัสผ่านไม่ถูกต้อง");
            } else {
                System.out.println("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
            }
        }
    }

}
