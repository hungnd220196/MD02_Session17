package bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập số chia");
        int divisor = Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập số bị chia");
        try {
            int dividend = Integer.parseInt(scanner.nextLine());
            int quotient = divisor / dividend;
            System.out.println("kq phép chia là " + quotient);
        } catch (ArithmeticException e) {
            System.err.println("Số bị chia phải khác 0, vui lòng nhập lại");
        }
    }
}
