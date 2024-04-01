package bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("mời bạn nhập số nguyên thứ 1: ");
            try {
                int number1 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(" số ban nhập k phải số nguyên, vui lòng nhập lại");
            }
        }
        while (true) {
            System.out.println("mời bạn nhập số nguyên thứ 2: ");
            try {
                int number2 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(" số ban nhập k phải số nguyên, vui lòng nhập lại");
            }
        }

    }
}
