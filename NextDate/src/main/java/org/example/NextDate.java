package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class NextDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngày: ");
        int day = scanner.nextInt();

        System.out.println("Nhập tháng: ");
        int month = scanner.nextInt();

        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();

        if (day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1812 && year <= 2012) {
            GregorianCalendar date = new GregorianCalendar(year, month - 1, day);
            date.add(Calendar.DAY_OF_MONTH, 1);
            System.out.println("Ngày tiếp theo là " + date.get(Calendar.DAY_OF_MONTH) + "/" + (date.get(Calendar.MONTH) + 1) + "/" + date.get(Calendar.YEAR));
        } else {
            System.out.println("Ngày không hợp lệ");
        }

        scanner.close();
    }
    public static String getNextDate(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            GregorianCalendar date = new GregorianCalendar(year, month - 1, day);
            date.add(Calendar.DAY_OF_MONTH, 1);
            return date.get(Calendar.DAY_OF_MONTH) + "/" + (date.get(Calendar.MONTH) + 1) + "/" + date.get(Calendar.YEAR);
        } else {
            return "Invalid date";
        }
    }
    private static boolean isValidDate(int day, int month, int year) {
        return day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1812 && year <= 2012;
    }
}
