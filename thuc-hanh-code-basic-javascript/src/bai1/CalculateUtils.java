package bai1;

import java.util.Scanner;

public class CalculateUtils {
    public static double tinhCong(double x, double y) {
        return x + y;
    }

    public static double tinhNhan(double x, double y) {
        return x * y;
    }

    public static double tinhTru(double x, double y) {
        return x - y;
    }

    public static double tinhChia(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
    }
}