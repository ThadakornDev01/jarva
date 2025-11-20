package Lab1;
import java.util.Scanner;   // นำเข้า Scanner เพื่อรับค่าจากคีย์บอร์ด

public class Lab1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   // สร้าง Object สำหรับรับค่า

        // รับค่าตัวเลขตัวที่ 1
        System.out.print("ป้อนตัวเลขที่ 1: ");
        int num1 = input.nextInt();               // อ่านค่าจากคีย์บอร์ด

        // รับค่าตัวเลขตัวที่ 2
        System.out.print("ป้อนตัวเลขที่ 2: ");
        int num2 = input.nextInt();               // อ่านค่าจากคีย์บอร์ด

        // คำนวณผลรวม
        int sum = num1 + num2;                    // นำค่ามาบวกกัน

        // แสดงผลลัพธ์
        System.out.println("รวมผลบวก = " + sum);  // แสดงผลรวม

        input.close();                            // ปิด Scanner
    }
}
