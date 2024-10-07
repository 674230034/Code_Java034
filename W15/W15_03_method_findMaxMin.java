package W15;

public class W15_03_method_findMaxMin {
    // 1) Method สำหรับหาค่ามากที่สุด
    static int findMax(int a, int b){
    //     if (a > b){
    //         return a;
    //     }else{
    //         return b;
    //     }
    return (a > b) ? a : b; // ใช้เงื่อนไขแบบ ternary operator
    }

    // 2) Method สำหรับหาค่าน้อยที่สุด
    static int findMin(int a, int b){
    //     if (a < b){
    //         return a;
    //     }else{
    //         return b;
    //     }
    }
    return (a < b) ? a : b; // ใช้เงื่อนไขแบบ ternary operator

    // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
    static int findMax(int a, int b, int c){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }

    // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
    static int findMin(int[] numbers){
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }

    // 5) Method สำหรับแสดงค่าใน array ทั้งหมด
    static void disPlayArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
        System.out.println(numbers[i] + " ");
    }
    }

    public static void main(String[] args) {
        // 1) Method สำหรับหาค่ามากที่สุด
        System.out.println("ค่ามากสุดของ [10,20] คือ " + findMax(10,20));

        // 2) Method สำหรับหาค่าน้อยที่สุด
        System.out.println("ค่าน้อยสุดของ [10,20] คือ " + findMin(10,20));

        // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
        System.out.println("ค่ามากสุดของ [10,20,15] คือ " + findMax(10,20,15));

        // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
        int[] numbers = {10,20,30,40,50};
        disPlayArray(numbers);
        System.out.println("min number in array is " + findMin(numbers));
       
    }
}

