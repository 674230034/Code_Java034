package W13;

public class W13_03_ArrayCountOddEven {
    public static void main(String[] args) {
    //นับจำนวนคู่คี่ใน Array ด้านล่าง
    int [] number = {1, 5, 6, 11, 8, 7, 2, 23, 55, 64, 98, 64, 67, 99, 78};

    int countOdd = 0;
    int countEven = 0;

    for (int i = 0; i < number.length ; i++ ){
         System.out.print(number[i] + " / ");
         if(number[i] % 2 == 0){
                countEven++;//ใส่เงื่อนไขนับคู่คี่
         }else{
                countOdd++;
         }
        }
        System.out.println("\nAmount of all Number : " + number.length);
        System.out.println("\nAmount of Odd Number : " + countOdd);
        System.out.println("\nAmount of Even Number : " + countEven);
    }
}