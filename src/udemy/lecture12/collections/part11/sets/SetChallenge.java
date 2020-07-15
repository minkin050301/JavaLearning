package udemy.lecture12.collections.part11.sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetChallenge {
    private static Map<String, HeavenlyBody> testMap = new HashMap<>();
    private static Set<HeavenlyBody> testSet = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody body1 = new Planet("BetaMinor", 228);
        HeavenlyBody body2 = new Star("BetaMinor", 12);
        HeavenlyBody body3 = new Planet("BetaMinor", 23223);

        testMap.put(body1.getName() + "-" + body1.getBodyType(), body1);
        testMap.put(body2.getName() + "-" + body2.getBodyType(), body2);
        testMap.put(body3.getName() + "-" + body3.getBodyType(), body3);

        for (String s : testMap.keySet()) {
            System.out.print(testMap.get(s).getName() + ", " + testMap.get(s).getBodyType() + ", " +
                    testMap.get(s).getOrbitalPeriod());
            System.out.println();
        }

        System.out.println("--------------------");
        testSet.add(body1);
        testSet.add(body2);
        testSet.add(body3);

        for (HeavenlyBody body : testSet) {
            System.out.println(body.getName() + ", " + body.getBodyType() + ", " + body.getOrbitalPeriod());
        }

        System.out.println(body1.equals(body2));
        System.out.println(body2.equals(body1));
        System.out.println(body1.equals(body3));
        System.out.println(body3.equals(body1));


    }
}
