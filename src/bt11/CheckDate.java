package bt11;

import java.util.Scanner;

public class CheckDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập tháng ");
        int month = Integer.parseInt(scanner.nextLine());
        try {
            if (month < 1 || month > 12) {
                System.err.println("tháng k nằm trong khoảng 1->12,vui lòng nhập lại");
            }
        } catch (NumberFormatException e) {
            System.err.println("nhập tháng không hợp lệ");
        }
        System.out.println("mời bạn nhập ngày ");
        int day = Integer.parseInt(scanner.nextLine());
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                try {
                    if (day >= 1 && day <= 31) {
                        System.err.println("ngày hợp lệ");
                    } else {
                        System.err.println("ngày phải trong khoảng 1 -> 31");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("nhập ngày không hợp lệ");
                }
                break;
            case 2, 4, 6, 9, 11:
                try {
                    if (day >= 1 && day <= 30) {
                        System.err.println("ngày hợp lệ");
                    } else {
                        System.err.println("ngày phải trong khoảng 1 -> 31");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("nhập ngày không hợp lệ");
                }

                break;
        }
        System.out.println("mời bạn nhập năm ");
        try {
            int year = Integer.parseInt(scanner.nextLine());
            if (year < 0) {
                System.err.println("năm phải lớn hơn 0");
            }
        } catch (NumberFormatException e) {
            System.err.println("năm không hợp lê");
        }
    }
}
