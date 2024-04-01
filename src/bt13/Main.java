package bt13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập chuỗi");
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(string);
        if (string.isBlank()) {
            throw new RuntimeException("chuỗi không hợp lệ");
        }
        System.out.println("Chuỗi đảo ngược là "+stringBuilder.reverse());


    }
}
