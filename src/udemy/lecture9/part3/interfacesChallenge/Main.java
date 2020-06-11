package udemy.lecture9.part3.interfacesChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Valakas", "Gladiators", "100");
//        ArrayList<String> playerParameters = new ArrayList<>();
//        playerParameters.add("Valakas");
//        playerParameters.add("Gladiator");
//        playerParameters.add("100");
//        player.populateFields(playerParameters);
        System.out.println(player.toString());
        ArrayList<String> playerParameters = player.returnValuesToSave();
        System.out.println(Arrays.toString(playerParameters.toArray()));
        saveObject(player);

        Player player1 = new Player("Borrow", "Minecrafters", "50");
        System.out.println(player1.toString());
        player1.restoreValues(playerParameters);
        System.out.println(player1.toString());
    }

    public static void saveObject(Saveable obj) {
        ArrayList<String> savedValues = obj.returnValuesToSave();
        System.out.println("Saved values: " + Arrays.toString(savedValues.toArray()));
    }
}
