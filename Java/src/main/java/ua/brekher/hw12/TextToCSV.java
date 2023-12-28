package ua.brekher.hw12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextToCSV {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text (to go to a new line enter 'next', for complete 'end'):");

        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("end")) {
            if (input.equalsIgnoreCase("next")) {
                lines.add(", ");
            } else {
                lines.add(input);
            }
        }
        scanner.close();

        try {
            writeCSV(lines);
            System.out.println("CSV has been successfully created!");
        } catch (IOException e) {
            System.out.println("Error while creating CSV file: " + e.getMessage());
        }
    }

    public static void writeCSV(List<String> lines) throws IOException {
        FileWriter csvWriter = new FileWriter("output.csv");

        for (String line : lines) {
            csvWriter.append(line);
        }

        csvWriter.flush();
        csvWriter.close();
    }
}

