package udemy.lecture9.part3.interfacesChallenge;

import java.util.ArrayList;

public interface Saveable {
    public ArrayList<String> returnValuesToSave();
    public void restoreValues(ArrayList<String> parameters);
}
