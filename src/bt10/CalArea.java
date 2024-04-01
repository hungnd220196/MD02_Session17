package bt10;

import java.util.Scanner;

public class CalArea {
    public static void main(String[] args) {
        while(true){
            System.out.println("mời bạn nhập bán kính hình tròn");
            try {
                double radius = Double.parseDouble(new Scanner(System.in).nextLine());
                if (radius>0){
                    System.out.printf("diện tích hình tròn là: %.2f ", Math.PI * radius * radius);
                    System.out.println();
                }else{
                    System.err.println("vui lòng nhập số lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.err.println(" bạn nhập số k hợp lệ");
            }
        }
    }
}
