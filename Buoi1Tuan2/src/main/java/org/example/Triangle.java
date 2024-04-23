package org.example;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Nhập ba cạnh của tam giác
        System.out.print("Nhập cạnh thứ nhất: ");
    int canh1 = sc.nextInt();
        System.out.print("Nhập cạnh thứ hai: ");
    int canh2 = sc.nextInt();
        System.out.print("Nhập cạnh thứ ba: ");
    int canh3 = sc.nextInt();


    // Kiểm tra tính hợp lệ của ba cạnh
        if (canh1 <= 0 || canh2 <= 0 || canh3 <= 0 || canh1 + canh2 <= canh3 || canh2 + canh3 <= canh1 || canh1 + canh3 <= canh2) {
        System.out.println("Ba cạnh không hợp lệ để tạo thành tam giác.");
        return;
    }

    // Xác định loại tam giác
    String loaiTamGiac;
        if (canh1 == canh2 && canh2 == canh3) {
        loaiTamGiac = "Tam giác đều";
    } else if (canh1 == canh2 || canh2 == canh3 || canh1 == canh3) {
        loaiTamGiac = "Tam giác cân";
    } else {
        loaiTamGiac = "Tam giác thường";
    }

    // In ra kết quả
        System.out.println("Loại tam giác: " + loaiTamGiac);
}
}
