package bt8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Mời bạn nhập số kiểm tra");
            boolean isPrime = true;
            int numberCheck;
            try {
                numberCheck = Integer.parseInt(new Scanner(System.in).nextLine());
                if (numberCheck < 2) {
                    return;
                } else {
                    for (int i = 2; i <= Math.sqrt(numberCheck); i++) {
                        if (numberCheck % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime) {
                    System.out.println(numberCheck + " là số nguyên tố");
                } else {
                    System.out.println(numberCheck + " không là số nguyên tố");
                }
            } catch (NumberFormatException e) {
                System.err.println("số bạn nhập không phải số nguyên");
            }
        }
    }
}
