public class HW15_Factorial {
    // เมธอดหาค่าแฟกทอเรียลที่คืนค่าเป็น long และแสดงตัวคูณ
    static String factorial(int n) {
        long factorial = 1;
        StringBuilder equation = new StringBuilder(); // สร้างอ็อบเจกต์ StringBuilder ชื่อ equation ใช้ในการสร้างสตริงที่แสดงตัวคูณ

        for (int i = 1; i <= n; i++) {
            factorial *= i;  
            equation.append(i);  // สะสมตัวเลข
            if (i < n) {
                equation.append(" × ");  
            }
        }

        equation.append(" = ").append(factorial);  
        return equation.toString();  
    }
    
    public static void main(String[] args) {
        int[] numbers = {5, 10};  // กำหนดค่าที่ต้องการคำนวณ
        
        for (int number : numbers) {
            String factorialEquation = factorial(number);  // เรียกเมธอดหาค่าแฟกทอเรียล
            System.out.println("Factorial of " + number + " is " + factorialEquation);  // แสดงผล
        }
    }
}