package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    public class TriangleHelper {

        public static String xacDinhLoaiTamGiac(int canh1, int canh2, int canh3) {
            // Kiểm tra tính hợp lệ của ba cạnh
            if (canh1 <= 0 || canh2 <= 0 || canh3 <= 0 || canh1 + canh2 <= canh3 || canh2 + canh3 <= canh1 || canh1 + canh3 <= canh2) {
                return "Ba cạnh không hợp lệ để tạo thành tam giác.";
            }

            // Xác định loại tam giác
            if (canh1 == canh2 && canh2 == canh3) {
                return "Tam giác đều";
            } else if (canh1 == canh2 || canh2 == canh3 || canh1 == canh3) {
                return "Tam giác cân";
            } else {
                return "Tam giác thường";
            }
        }
    }
    @Test
    public void testTamGiacDeu() {
        assertEquals("Tam giác đều", TriangleHelper.xacDinhLoaiTamGiac(5, 5, 5));
    }

    @Test
    public void testTamGiacCan() {
        assertEquals("Tam giác cân", TriangleHelper.xacDinhLoaiTamGiac(4, 4, 5));
    }

    @Test
    public void testTamGiacThuong() {
        assertEquals("Tam giác thường", TriangleHelper.xacDinhLoaiTamGiac(3, 4, 5));
    }

    @Test
    public void testTamGiacKhongHopLeAm() {
        assertEquals("Ba cạnh không hợp lệ để tạo thành tam giác.", TriangleHelper.xacDinhLoaiTamGiac(-1, 2, 3));
    }

    @Test
    public void testTamGiacKhongHopLeTongHaiCanh() {
        assertEquals("Ba cạnh không hợp lệ để tạo thành tam giác.", TriangleHelper.xacDinhLoaiTamGiac(1, 2, 10));
    }

    @Test
    public void testTamGiacKhongHopLeCanhBang0() {
        assertEquals("Ba cạnh không hợp lệ để tạo thành tam giác.", TriangleHelper.xacDinhLoaiTamGiac(0, 0, 0));
    }
}