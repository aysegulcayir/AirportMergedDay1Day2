package airport;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {


    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("ABC123", 33, 0, true, 100);
        Airplane airplane2 = new Airplane("DDD88", 23, 0, true, 100);
        List<Airplane> airplanes = new ArrayList<>(Arrays.asList(
            new Airplane("ABC123", 33, 0, true, 100),
            new Airplane("DDD88", 23, 0, true, 100),
            new Airplane("DEAM88", 23, 0, false, 0)));
        Airport airport1 = new Airport("Eindhoven",airplanes);
        airport1.getAllAircraft();
        airport1.getSuitablePlane();



        System.out.println("Test");
        airplane1.loadPassenger(43);
        airplane1.airplaneTakeOff();
        airplane2.loadPassenger(23);
        airplane1.airplaneLand();
        airplane1.unloadPassenger(43);
        airplane2.airplaneTakeOff();
        airplane2.airplaneLand();
        airplane2.unloadPassenger(23);






    }
}
