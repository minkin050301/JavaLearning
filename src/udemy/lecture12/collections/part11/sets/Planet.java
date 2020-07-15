package udemy.lecture12.collections.part11.sets;

import java.util.HashSet;
import java.util.Set;

public class Planet extends HeavenlyBody {
    //private Set<Moon> satellites;

    public Planet(String name, double orbitalPeriod) {
        super(name, "PLANET", orbitalPeriod);
        //this.satellites = new HashSet<>();
    }

    @Override
    public boolean addMoon(HeavenlyBody moon) {
        if (moon instanceof Moon) {
            return super.addMoon(moon);
        } else {
            System.out.println("Satellites of planet can only be moons.");
            return false;
        }


    }

//    public boolean addSatellite(Moon moon) {
//        return super.satellites.add(moon);
//    }

//    @Override
//    public Set<Moon> getSatellites() {
//        return new HashSet<>(satellites);
//    }

//    public void printSatellitesList() {
//        System.out.println("Satellites of " + this.getName());
//        for (Moon moon : satellites) {
//            System.out.println("\t" + moon.getName() + ", " + moon.getBodyType());
//        }
//    }
}
