package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int count = 0;
        int average = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            average = average + number;
            count++;
        }
        System.out.println(average / count);
    }

}