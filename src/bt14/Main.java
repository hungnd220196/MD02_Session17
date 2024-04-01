package bt14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Bước 1: Khai báo biến và nhập dữ liệu
            System.out.print("Nhập số lượng phần tử của mảng: ");
            int n = scanner.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Số lượng phần tử của mảng phải lớn hơn 0.");
            }

            int[] arr = new int[n];

            // Bước 3: Nhập giá trị cho mảng
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            // Bước 4: Tính giá trị trung bình
            double average = calculateAverage(arr);

            // Bước 5: Hiển thị kết quả
            System.out.println("Giá trị trung bình của mảng là: " + average);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Đã xảy ra lỗi không xác định.");
        } finally {
            scanner.close();
        }
    }

    // Hàm tính giá trị trung bình của mảng
    private static double calculateAverage(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Mảng không có phần tử nào.");
        }
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }
}

