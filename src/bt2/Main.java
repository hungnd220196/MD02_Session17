package bt2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập só phần tử mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        try {
            if (n == 0) {
                System.err.println("mảng rỗng nhập lại");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("mời bạn nhập số thứ " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("số lớn nhất trong mảng là " + max);

    }
}
