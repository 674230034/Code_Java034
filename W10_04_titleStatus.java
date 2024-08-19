//ตรวจสอบคำนำหน้าชื่อ
//เด็กหญิง เด็กชาย นาย นาง นางสาว

package W10;

import java.util.Scanner;

public class W10_04_titleStatus {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("ระบุเพศ (male/female): ");
        String gender = kb.next();

        System.out.print("ระบุอายุ: ");
        int age = kb.nextInt();
        // scanner.nextLine(); // อ่านบรรทัดที่ค้างจาก nextInt()

        System.out.print("ระบุสถานะสมรส (single/married): ");
        String isMarried = kb.next();

        if (gender.equalsIgnoreCase("male")) {
            // ถ้าเป็นผช. เป็น ด.ช. นาย
            if (age < 15) {
                System.out.println("เด็กชาย");
            } else {
                System.out.println("นาย");
            }
        } else {
            // ถ้าเป็นผญ. เป็น ด.ญ. นาง นางสาว
            if (age < 15) {
                System.out.println("เด็กหญิง");
            } else if (isMarried.equalsIgnoreCase("married")) {
                System.out.println("นาง");
            } else {
                System.out.println("นางสาว");
            }
        }
    }
}

// การทำงานของโปรแกรม:
// 1. โปรแกรมจะขอให้ผู้ใช้ป้อนเพศ (ชาย/หญิง), อายุ และสถานะสมรส (โสด/แต่งงาน)
// 2. โปรแกรมจะทำการตรวจสอบข้อมูลที่ป้อนเข้ามา:
// - ถ้าเป็นเพศชายและอายุน้อยกว่า 15 ปี จะใช้คำว่า "เด็กชาย"
// - ถ้าเป็นเพศชายและอายุมากกว่า 15 ปี จะใช้คำว่า "นาย"
// - ถ้าเป็นเพศหญิงและอายุน้อยกว่า 15 ปี จะใช้คำว่า "เด็กหญิง"
// - ถ้าเป็นเพศหญิง, อายุมากกว่า 15 ปี และโสด จะใช้คำว่า "นางสาว"
// - ถ้าเป็นเพศหญิง, อายุมากกว่า 15 ปี และแต่งงานแล้ว จะใช้คำว่า "นาง"
// 3. โปรแกรมจะแสดงคำหน้าชื่อที่เหมาะสมตามเงื่อนไขที่ตรวจสอบได้
