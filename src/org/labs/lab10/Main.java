package org.labs.lab10;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lines = Text.readTextAsList("files/text.txt");
        for (String line : lines) {
            System.out.println(line);
        }


        Text.writeParamToString("Дата: 26 июня 2024г. ", "files/empty.txt");


        File file1 = new File("files/text.txt");
        File file2 = new File("files/empty.txt");
        Text.joinFiles(file1, file2);


        File fileOld = new File("files/old.txt");
        File fileNew = new File("files/new.txt");
        Text.replaceSymbols(fileOld, fileNew);
    }
}
