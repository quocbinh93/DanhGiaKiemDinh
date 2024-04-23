package org.example;

public class NextDate {
    public static void main(String[] args) {
        // Ví dụ sử dụng
        int day = 31;
        int month = 12;
        int year = 2012;

        int[] nextDate = nextDate(day, month, year);
        System.out.println("Ngày kế tiếp: " + nextDate[0] + "/" + nextDate[1] + "/" + nextDate[2]);
    }

    public static int[] nextDate(int day, int month, int year) {
        // Kiểm tra tính hợp lệ của ngày, tháng, năm
        if (day <= 0 || day > 31 || month <= 0 || month > 12 || year < 1812 || year > 2012) {
            throw new IllegalArgumentException("Ngày, tháng, năm không hợp lệ.");
        }

        // Xác định ngày kế tiếp
        int nextDate = day;
        int nextMonth = month;
        int nextYear = year;

        // Xử lý trường hợp cuối tháng
        if (day == 31) {
            if (month == 12) {
                nextDate = 1;
                nextMonth = 1;
                nextYear++;
            } else {
                nextDate = 1;
                nextMonth++;
            }
        } else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            nextDate = 1;
            nextMonth++;
        } else if (day == 28 && month == 2) {
            if (isLeapYear(year)) {
                nextDate = 29;
            } else {
                nextDate = 1;
                nextMonth = 3;
            }
        } else if (day == 29 && month == 2) {
            nextDate = 1;
            nextMonth = 3;
        } else {
            nextDate++;
        }

        return new int[]{nextDate, nextMonth, nextYear};
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
