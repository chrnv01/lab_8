package ru.mirea.lab_8;

import java.util.Scanner;

public class Num11 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    int number;

    while (true) {
        number = scanner.nextInt();

        if (number == 0) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
        }

        if (number == 1) {
            count++;
        }
    }

    System.out.println("Количество единиц: " + count);
}
}
