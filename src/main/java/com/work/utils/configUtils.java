package com.work.utils;

import java.util.Scanner;

public class configUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static void print(String str) {
        System.out.print(str);
    }

    public static void println(String str) {
        System.out.println(str);
    }

    public static String askString(String message){
        print(message);
        return scanner.nextLine();
    }

    public static int askInt(String message){
        print(message);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static void closeScanner() {
            scanner.close();
    }



}
