package lab3;

import java.util.Scanner;
public class MainScan {

   
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int base, height;
        double area;
        System.out.print("รับค่าฐาน: ");
        base = sc.nextInt();
        System.out.print("รับค่าสูง: ");
        height = sc.nextInt();
        area = 0.5* base * height ;
        System.out.println("ผลลัพธ์: "+area);
        
        
    }

}
