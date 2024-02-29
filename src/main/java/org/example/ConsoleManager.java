package org.example;

import java.io.File;
import java.util.Scanner;

public class ConsoleManager {

    public void consoleReader() {

        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);


        while (true) {

            String datai = scanner.nextLine();

            if (datai.contains("koniec")) {
                break;
            } else {
                fileManager.readFileManager(datai);
                datai = "null";
            }
        }
    }
    public ConsoleManager() {
    }
}
