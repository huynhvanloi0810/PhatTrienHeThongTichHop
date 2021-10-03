// Viết chương trình tính tổng của dãy số từ 1 đến n. (Với n được nhập từ bàn phím)

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int tong = 0;
        System.out.print("nhap n = ");
        n = sc.nextInt();
        for(int i = 1;i<=n;i++)
            tong = tong + i;
        System.out.println("tong = " + tong);
        sc.close();
    }
}
