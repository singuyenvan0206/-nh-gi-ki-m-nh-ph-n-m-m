package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn.");
        } else {
            System.out.println("Số " + number + " là số lẻ.");
        }

        System.out.println("In ra các số từ 1 đến " + number + ": ");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}
