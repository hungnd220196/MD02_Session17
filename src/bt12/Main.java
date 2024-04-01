package bt12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("mời bạn nhập số thứ 1");
            int number1 = scanner.nextInt();
            System.out.println("mời bạn nhập số thứ 2");
            int number2 = scanner.nextInt();
            try {
                if (number1 == 0 && number2 == 0) {
                    System.err.println("số nhập vào phải lớn hơn 0");
                    return;
                }
            } catch (NumberFormatException e) {
                System.err.println("số không hợp lệ");
            }
            int greatesCommonDivisor = 1;
            for (int i = 1; i <= number1; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    greatesCommonDivisor = i;
                }
            }
            System.out.println("Uoc chung lon nhat cua " + number1 + " va " + number2 + " la: " + greatesCommonDivisor);
        }
    }
}

