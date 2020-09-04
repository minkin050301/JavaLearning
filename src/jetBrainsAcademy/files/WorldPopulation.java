package jetBrainsAcademy.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WorldPopulation {

    public static void main(String[] args) {
        File file = new File("src/jetBrainsAcademy/files/dataset_91069.txt");

        try (Scanner scanner = new Scanner(file)) {
            Map<Long, Integer> populationIncreaseByYear = new LinkedHashMap<>();
            scanner.nextLine();

            // reading the first year and the corresponding population in the file
            String[] data = scanner.nextLine().split("\t");
            int year = Integer.parseInt(data[0]);
            long population = Long.parseLong(data[1].replace(",", ""));
            long targetYear = year;
            long biggestPopulationIncrease = 0L;

            //System.out.println(data[0]);
            //System.out.println(data[1]);

            //System.out.println(Long.parseLong(data[1].replace(",", "")));
            while (scanner.hasNextLine()) {
                data = scanner.nextLine().split("\t");
                long prevPopulation = population;
                year = Integer.parseInt(data[0]);
                population = Long.parseLong(data[1].replace(",", ""));
                long populationIncrease = population - prevPopulation;
                if (populationIncrease > biggestPopulationIncrease) {
                    biggestPopulationIncrease = populationIncrease;
                    targetYear = year;
                }

                populationIncreaseByYear.put(populationIncrease, year);
            }

            for (Map.Entry<Long, Integer> entry : populationIncreaseByYear.entrySet()) {
                System.out.print(entry.getKey() + ": " + entry.getValue() + "\n");
            }

            long maxIncrease = Collections.max(populationIncreaseByYear.keySet());
            System.out.println(populationIncreaseByYear.get(maxIncrease));

            System.out.println(targetYear);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
