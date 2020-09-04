package jetBrainsAcademy.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindTheGreatestNumberInFile {

    public static void main(String[] args) {
        File file = new File("src/jetBrainsAcademy/files/dataset_91007.txt");
        try (Scanner scanner = new Scanner(file)) {
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            System.out.println(Collections.max(numbers));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
