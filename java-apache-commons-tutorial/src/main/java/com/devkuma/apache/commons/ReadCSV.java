package com.devkuma.apache.commons;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class ReadCSV {

    public static void main(String[] args) {
        try {
            Reader in = new FileReader("file.csv");
            Iterable<CSVRecord> records = CSVFormat.EXCEL.builder().setHeader().build().parse(in);
            for (CSVRecord record : records) {
                String lastName = record.get("Last Name");
                String firstName = record.get("First Name");

                System.out.print(lastName + " ");
                System.out.println(firstName);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Done");
    }
}
