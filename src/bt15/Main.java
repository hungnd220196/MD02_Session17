package bt15;

import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            throw new IllegalTriangleException("Số đo các cạnh phải là số dương.");
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
            throw new IllegalTriangleException("Tổng độ dài của 2 cạnh phải lớn hơn cạnh còn lại.");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhập độ dài của 3 cạnh tam giác:");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Chu vi của tam giác là: " + triangle.getPerimeter());
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Nhập không hợp lệ.");
        }
    }
}

