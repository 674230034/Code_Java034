package W13;
import java.util.Scanner;
public class W13_02_introArray {
    public static void main(String[] args) {
        //ประกาศตัวแปร array แบบที่ 2 - ไม่รู้จำนวนล่วงหน้า
        String [] brandCars = new String[3];

        Scanner kb = new Scanner(System.in);

        //กำหนดค่า array 
        brandCars[0] = "Toyota";
        brandCars[1] = "Honda";
        brandCars[2] = "Nissan";
        
        //แสดงผลใช้ loop
        System.out.println("Old Brand of cars in the array are: ");
        for (int i = 0; i < brandCars.length ; i++){
            System.out.print(brandCars[i] + " / ");
        }
        //รับค่าจากคีย์บอร์ด
        System.out.println("\n\nPlease enter the brand of the 3rd car");
            for (int i = 0; i < brandCars.length ; i++){
                System.out.print("Enter brand " + (i+1) + ": ");
                brandCars[i] = kb.next();
            }

        System.out.println("\nNew Brand of cars in the array are: ");
        for (String car : brandCars){
            System.out.print(car + " / "); //ใช้ for-each loop
        }
    }
}