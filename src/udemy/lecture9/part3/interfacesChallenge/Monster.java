package udemy.lecture9.part3.interfacesChallenge;

import java.util.ArrayList;

public class Monster implements Saveable {
    private String name;
    private String type;
    private String health;
    private ArrayList<String> parameters;

    public Monster(String name, String type, String health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getHealth() {
        return health;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    @Override
    public ArrayList<String> returnValuesToSave() {
        parameters = new ArrayList<>();
        parameters.add(name);
        parameters.add(type);
        parameters.add(health);
        return parameters;
    }

    @Override
    public void restoreValues(ArrayList<String> parameters) {
        name = parameters.get(0);
        type = parameters.get(1);
        health = parameters.get(2);
    }

    @Override
    public String toString() {
        return type + " monster " + name + ". HP: " + health;
    }
}
