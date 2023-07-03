package bai1;

import java.util.Scanner;

public class MyMainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất x = ");
        double x = scanner.nextDouble();

        System.out.print("Nhập số thứ hai y = ");
        double y = scanner.nextDouble();

        System.out.print("Nhập lệnh ACTION = ");
        String action = scanner.next();

        double result;

        switch (action) {
            case "CONG":
                result = CalculateUtils.tinhCong(x, y);
                System.out.println("Kết quả: " + result);
                break;
            case "TRU":
                result = CalculateUtils.tinhTru(x, y);
                System.out.println("Kết quả: " + result);
                break;
            case "NHAN":
                result = CalculateUtils.tinhNhan(x, y);
                System.out.println("Kết quả: " + result);
                break;
            case "CHIA":
                try {
                    result = CalculateUtils.tinhChia(x, y);
                    System.out.println("Kết quả: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Giá trị ACTION không hợp lệ");
                break;
        }

        scanner.close();
    }
}
