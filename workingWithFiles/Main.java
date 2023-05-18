package workingWithFiles;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        getFileInfo();
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("C:\\Java demos\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya Oluşturuldu");
            } else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Java demos\\files\\students.txt");
        if (file.exists()) {
            System.out.println("Dsya Adi: " + file.getName());    //students.txt
            System.out.println("Dsya Yolu: " + file.getAbsolutePath());   //C:\Java demos\files\students.txt
            System.out.println("Dosya yazılabilir mi ?" + file.canWrite());
            System.out.println("Dosya okunabilir mi ?" + file.canWrite());
            System.out.println("Dosya boyutu : " + file.length());
        }
    }

    public static void readFile() {
        File file = new File("C:\\Java demos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Java demos\\files\\students.txt" ,true));
            writer.newLine();
            writer.write("Rojin");
            System.out.println("Dosyaya eklendi");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
