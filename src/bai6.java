/* Thiết kế lớp Diem (Point)(Điểm trong không gian 2 chiều) gồm:
- Thành phần dữ liệu: x, y kiểu int
- Các hàm thành viên gồm:
o Các phương thức khởi tạo
o Phương thức gán tọa độ cho một điểm
o Phương thức nhập tọa độ cho một điểm
o Phương thức in ra màn hình tọa độ điểm theo dạng (x,y)
o Phương thức tính khoảng cách từ điểm đó đến gốc tọa độ (0,0)
- Viết hàm main() khai thác lớp vừa định nghĩa
*/

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
    
        
    }
    float x;
    float y;
    void toado(float x, float y){
        this.x = x;
        this.y = y;
    }
    void nhaptoado(){
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.print("nhap toa do x: ");
        a = sc.nextFloat();
        System.out.print("nhap toa do y: ");
        b = sc.nextFloat();
        toado(a,b);
    }

    void intoado(){
        System.out.print("toa do = ("+x+";"+y+")");
    }

    void khoangcachden0(){
        System.out.print("....");
    }

    
}
