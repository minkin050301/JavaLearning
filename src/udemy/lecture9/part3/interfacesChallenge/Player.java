package udemy.lecture9.part3.interfacesChallenge;

import java.util.ArrayList;

public class Player implements Saveable {
    private String name;
    private String clan;
    private String health;
    private ArrayList<String> parameters;

    public Player(String name, String clan, String health) {
        this.name = name;
        this.clan = clan;
        this.health = health;
    }

    @Override
    public ArrayList<String> returnValuesToSave() {
        parameters = new ArrayList<>();
        parameters.add(name);
        parameters.add(clan);
        parameters.add(health);
        return parameters;
    }

    public String getName() {
        return name;
    }

    public String getClan() {
        return clan;
    }

    public String getHealth() {
        return health;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    @Override
    public void restoreValues(ArrayList<String> parameters) {
        name = parameters.get(0);
        clan = parameters.get(1);
        health = parameters.get(2);
    }

    @Override
    public String toString() {
        return "Player " + name + " from the " + clan + " clan. HP: " + health;
    }
}
