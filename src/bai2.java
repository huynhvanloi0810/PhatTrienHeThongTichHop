// Viết chương trình nhập vào số nguyên. Kiểm tra xem số đó có phải là số nguyên tố hay không và thông báo ra màn hình

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so: ");
        int n = sc.nextInt();
        if (kiemtra(n) == 1) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong la so nguyen to");
        }
        sc.close();
    }
  
    public static int kiemtra(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
 }