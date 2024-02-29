package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {


    public void readFileManager(String search)
    {
        try
        {
            File file = new File("kraje.txt");
            Scanner scanner = new Scanner(file);
            System.out.println("=======================================");
            while(scanner.hasNextLine())
            {
                String data = scanner.nextLine();
                if (data.contains(search)) {
                    System.out.println(data);
                }
            }
            System.out.println("=======================================");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public FileManager() {
    }


}
