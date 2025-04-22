package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the name of file");
            String fileName = userInput.nextLine();

        try {
            FileInputStream fis = new FileInputStream(fileName);
            Scanner scanner = new Scanner(fis);

            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                System.out.println(input);
            }
            scanner.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
