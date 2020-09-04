package jetBrainsAcademy.files;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/jetBrainsAcademy/files/testFile.txt");
         // appends text to the file
        try (FileWriter  writer = new FileWriter(file, true)) {
            writer.write("Hello, World\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.printf("%s dolor sit %s", "Lorem", "ipsum", "amet");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
