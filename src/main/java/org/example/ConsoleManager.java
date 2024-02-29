package org.example;

import java.io.File;
import java.util.Scanner;

public class ConsoleManager {

    public void consoleReader() {

        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);


        while (true) {

            String datai = scanner.nextLine().toLowerCase();

            if (datai.contains("jezioro")) {
                fileManager.readFileManager("jezioro");
                datai = "";
            } else if (datai.equals("rzeka")) {
                fileManager.readFileManager("rzeka");
                datai = "";
            } else if (datai.equals("koniec")) {
                break;
            }
        }
    }
    public ConsoleManager() {
    }
}
