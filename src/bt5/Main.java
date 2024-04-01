package bt5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo mảng cho sẵn phần tử
        int[] arr = {1, 2, 3, 4, 5, 9, 6, 8};
        //sort
        System.out.println((Arrays.toString(Arrays.stream(arr).sorted().toArray())));

        System.out.print("Nhập số cần tìm trong mảng: ");
        try {
            int target = scanner.nextInt();
            int result = binarySearch(arr, target);
            if (result != -1) {
                System.out.println("Số " + target + " được tìm thấy tại vị trí " + result);
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("số bạn tìm nằm ngoài mảng");
        }
    }

    // Phương thức thực hiện tìm kiếm nhị phân trong mảng đã sắp xếp
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Kiểm tra xem phần tử ở giữa có phải là số cần tìm không
            if (arr[mid] == target) {
                return mid; // Trả về vị trí nếu tìm thấy
            } else if (arr[mid] < target) {
                left = mid + 1; // Nếu số ở giữa nhỏ hơn số cần tìm, loại bỏ nửa bên trái của mảng
            } else {
                right = mid - 1; // Nếu số ở giữa lớn hơn số cần tìm, loại bỏ nửa bên phải của mảng
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
