package bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập só phần tử mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("mời bạn nhập số thứ " + (i + 1));
            try {
                arr[i] = Integer.parseInt(scanner.nextLine());
                sum += arr[i];
            } catch (NumberFormatException e) {
                System.err.println("số bạn nhập k phải số nguyên");
            }
        }
        System.out.println("Tổng các phần tử mảng là " + sum);

    }
}
