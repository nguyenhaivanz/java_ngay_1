//ines (12 sloc)  396 Bytes

import java.util.Scanner;

public class bai_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien can chuyen doi ");
        double usd;
        usd = scanner.nextDouble();
        int vnd = 23000;
        double rate = usd * vnd;
        System.out.println("So tien sau khi chuyen doi la: " + rate);
    }
}