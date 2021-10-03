// Viết chương trình cho nhập vào 1 dãy số thực. Tính tổng của các số dương trong dãy đó.

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int n, tong = 0;;
        System.out.print("nhap so phan tu mang: ");
        n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.print("nhap phan tu thu " + i +" = ");
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(a[i]>=0)
                tong = tong + a[i];
        }
        System.out.println("tong cac so duong = " + tong);
        sc.close();
    }
}
