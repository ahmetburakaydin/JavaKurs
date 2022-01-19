package gun41;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _06FileOkumaYazma {
    public static void main(String[] args) throws IOException {
        dosyaYaz("info.txt");
        dosyaOku("info.txt");


    }
    public static void dosyaYaz(String adi) throws IOException {
        FileWriter fileWriter = new FileWriter("info.txt");
        fileWriter.write("Java\n");
        fileWriter.write("2022");
        fileWriter.write("-2023");
        fileWriter.close();
    }
    public static void dosyaOku(String adi) throws IOException {
        FileReader fileReader = new FileReader("info.txt");
        Scanner scan = new Scanner(fileReader);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        scan.close();
        fileReader.close();
    }
}
