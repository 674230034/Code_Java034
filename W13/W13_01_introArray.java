package W13;

public class W13_01_introArray {
    public static void main(String[] args) {
        //ประกาศตัวแปร array แบบที่ 1 - รู้จำนวนล่วงหน้า
        String [] colors = {"Purple", "Cyan", "Blue", "Green", "Yellow", "Orange", "Red"};
        int [] banks = {20, 50, 100, 500, 1000};
        char [] alphabet = {'A', 'B', 'C', 'D', 'E'};

        //แสดงผลโดยใช้ index ของ array
        System.out.println("The first colors is " + colors [0]);
        System.out.println("The Third alphabet is " + alphabet [2]);

        //แสดงผลใช้ loop
        System.out.println("Colors in the array are: ");
        for (int i = 0; i < 7 ; i++){
            System.out.print(colors[i] + " ");
        }
        System.out.println();
        System.out.println("============================================");
        for (int i = 6; i >= 0 ; i--){
            System.out.print(colors[i] + " ");
        }
        System.out.println();
        System.out.println("============================================");
        System.out.println("Banks in the array are: ");
        for (int j = 0; j < banks.length ; j++){ //ใช้ .lenght หาขนาด array
            System.out.print(banks[j] + " ");
        }
    }
}