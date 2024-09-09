public class W13_HW{
    public static void main(String[] args) {
    //นับจำนวนคู่คี่ใน Array ด้านล่าง
    int [] number = {1, 5, 6, 11, 8, 7, 2, 23, 55, 64, 98, 64, 67, 99, 78};

    int countOdd = 0;
    int countEven = 0;
    System.out.println();
    for (int i = 0; i < number.length ; i++ ){
         if(number[i] % 2 == 0){
                System.out.println(number[i] + " is Even ");//ใส่เงื่อนไขนับคู่คี่
                countEven++;
              }else{
                System.out.println(number[i] + " is Odd ");
                countOdd++;
         }
        }
        System.out.println("\nAmount of all Number : " + number.length);
        System.out.println("\nAmount of Odd Number : " + countOdd + " is Odd ");
        System.out.println("\nAmount of Even Number : " + countEven + " is Even ");
    }
}