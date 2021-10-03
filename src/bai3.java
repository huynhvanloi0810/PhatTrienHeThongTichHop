// Viết chương trình giải phương trình bậc 2

import java.util.Scanner;
 
public class bai3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        //a2x + 2ab + c = 0
        System.out.print("Nhập a = ");
        a = sc.nextInt();
        System.out.print("Nhập b = ");
        b = sc.nextInt();
        System.out.print("Nhập c = ");
        c = sc.nextInt();
        giaiPT(a, b, c);
        sc.close();
    }
    public static void giaiPT(int a, int b, int c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}