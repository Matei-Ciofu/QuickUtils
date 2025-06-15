package com.ciofu.quickutils;

import java.util.Scanner;

public class InputOutput {
    private static final Scanner scanner = new Scanner(System.in);

    // Print methods
    public static void print(String msg) {
        System.out.print(msg);
    }

    public static void println(String msg) {
        System.out.println(msg);
    }

    public static void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    // Read a full line from input
    public static String readLine(String prompt) {
        print(prompt);
        return scanner.nextLine();
    }

    // Read an integer with input validation
    public static int readInt(String prompt) {
        while (true) {
            print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    // Read a double with input validation
    public static double readDouble(String prompt) {
        while (true) {
            print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                println("Invalid input. Please enter a valid decimal number.");
            }
        }
    }

    // Read a boolean value with input validation
    public static boolean readBoolean(String prompt) {
        while (true) {
            print(prompt + " (true/false): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("true") || input.equals("t")) return true;
            if (input.equals("false") || input.equals("f")) return false;
            println("Invalid input. Please enter 'true' or 'false'.");
        }
    }
}

