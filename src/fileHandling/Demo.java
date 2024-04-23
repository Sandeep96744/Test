package fileHandling;

import java.io.*;
import java.util.Scanner;

public class Demo {

    public void createFile(String fileName) throws IOException {
        try(Writer write = new FileWriter(fileName)) {
            System.out.println("File Created Successfully!");
        }
    }

    public void addText(String text, String fileName) throws IOException {
        try(Writer write = new FileWriter(fileName, true)) {
            write.append(text).append("\n");
        }
    }

    public void displayContent(String fileName) throws IOException {
        System.out.println("Content of the File:");
        Reader reader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(reader);
        String line;
        while((line=br.readLine())!=null) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!");
        Demo d = new Demo();
        String fileName = "output.txt";
        d.createFile(fileName);

        char ch = 'n';
        do {
            System.out.println("Enter the text to be written:");
            String text = sc.nextLine();

            d.addText(text, fileName);


            System.out.println("Want to add more?\nPress 'y' to continue.\nPress 'n' to stop.");
            ch = sc.nextLine().charAt(0);
        } while(ch == 'y');

        d.displayContent(fileName);
        System.out.println("Thank you!");

    }
}
