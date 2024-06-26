package org.labs.lab10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Text {
    public static List<String> readTextAsList(String path) {
        List<String> lines;
        lines = new ArrayList<>();


        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String input;
            while ((input = reader.readLine()) != null) {
                lines.add(input);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return lines;
    }

    public static void writeParamToString(String str, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.append(str + "\n");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void joinFiles(File file1, File file2) {

        try (InputStream is = new FileInputStream(file1);
             OutputStream os = new FileOutputStream(file2, true);
        ) {

            while (is.available() > 0) {
                os.write(is.read());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void replaceSymbols(File fileIn, File fileOut) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut));
        BufferedReader reader = new BufferedReader(new FileReader(fileIn))) {
            while (reader.ready()) {
                writer.write(reader.readLine().replaceAll("[^A-Za-zА-Яа-я0-9]", "\\$"));
                writer.newLine();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
