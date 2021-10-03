// Viết chương trình nhập vào chuỗi ký tự. Đổi thành chữ Hoa và in ra màn hình

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) throws Exception {
        String chuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi ki tu: ");
        chuoi = sc.nextLine();
        System.out.println("chuoi in hoa: " + chuoi.toUpperCase());
        sc.close();
    }
}
