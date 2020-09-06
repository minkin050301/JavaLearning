package udemy.lecture14.part5.io;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are " );
            for (String exit : exits.keySet()) {
                System.out.print(exit + " ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
//            String in = scanner.nextLine();
//            String[] input = in.split(" ");

//            for (String str : input) {
//                if (str.equalsIgnoreCase("north") || str.equalsIgnoreCase("n")) {
//                    direction = "N";
//                } else if (str.equalsIgnoreCase("south") || str.equalsIgnoreCase("s")) {
//                    direction = "S";
//                } else if (str.equalsIgnoreCase("west") || str.equalsIgnoreCase("w")) {
//                    direction = "W";
//                } else if (str.equalsIgnoreCase("east") || str.equalsIgnoreCase("e")) {
//                    direction = "E";
//                } else if (str.equalsIgnoreCase("quit") || str.equalsIgnoreCase("q")) {
//                    direction = "Q";
//                }
//            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction.");
            }
        }
    }
}
