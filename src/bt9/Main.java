package bt9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Bước 1: Nhập giá trị n từ người dùng
            System.out.print("Nhập số Fibonacci thứ n: ");
            int n = scanner.nextInt();

            // Bước 2: Kiểm tra n là số nguyên dương
            if (n <= 0) {
                throw new IllegalArgumentException("n phải là số nguyên dương.");
            }

            // Bước 3: Tính số Fibonacci thứ n
            long fibonacci = calculateFibonacci(n);
            System.out.println("Số Fibonacci thứ " + n + " là: " + fibonacci);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Nhập không hợp lệ.");
        } finally {
            scanner.close();
        }
    }

    // Hàm tính số Fibonacci thứ n
    private static long calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long fibMinusTwo = 0;
        long fibMinusOne = 1;
        long fibonacci = 0;
        for (int i = 2; i <= n; i++) {
            fibonacci = fibMinusTwo + fibMinusOne;
            fibMinusTwo = fibMinusOne;
            fibMinusOne = fibonacci;
        }
        return fibonacci;
    }
}
