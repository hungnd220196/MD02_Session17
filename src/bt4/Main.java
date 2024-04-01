package bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập chuỗi");
        String string = scanner.nextLine();
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            try {
                int n = Integer.parseInt(String.valueOf(string.charAt(i)));
                numberList.add(n);
            } catch (NumberFormatException e) {
                numberList.add(0);
                System.err.println("có 1 kí tự không phải số nguyên");
            }
        }
        System.out.println(numberList);
    }
}

