public class W03_01_NetPrice {
    public static void main(String[] args) {
        // สร้างตัวแปรเพื่อเก็บค่าแต่ละอย่าง
        short price = 350;
        byte quantity = 10;
        byte percentDiscount = 5;

        int totalPrice = price * quantity;
        int discount = totalPrice * percentDiscount / 100;
        int netprice = totalPrice - discount;

        System.out.println("ราคาสินค้ารวม = " + totalPrice + " บาท");
        System.out.println("ราคาส่วนลด = " + discount + " บาท");
        System.out.println("ราคาสินค้าสุทธิ = " + netprice + " บาท");
    }
}
