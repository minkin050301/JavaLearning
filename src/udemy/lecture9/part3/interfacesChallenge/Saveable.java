package udemy.lecture9.part3.interfacesChallenge;

import java.util.ArrayList;

public interface Saveable {
    ArrayList<String> returnValuesToSave();
    void restoreValues(ArrayList<String> parameters);
}
