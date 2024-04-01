package bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập số nguyên thứ 1: ");
        int number1 = 0;
        try {
            number1 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("gía trị vừa nhập không phải số nguyên, vui lòng nhập lại");

        }
        System.out.println("mời bạn nhập số nguyên thứ 2: ");
        int number2 = 0;
        try {
            number2 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("gía trị vừa nhập không phải số nguyên, vui lòng nhập lại");

        }
        System.out.println("Tổng 2 số là " + sumTwoNumber(number1, number2));

    }

    public static int sumTwoNumber(int a, int b) {
        return a + b;
    }
}
