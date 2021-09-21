package airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Airport {
    private String name;
    private List<Airplane> airplanes;


    public List<Airplane> getAllAircraft() {
        List<Airplane> Airplanes = new ArrayList<>();
        System.out.println("Aircraft from airport " + this.getName() + " :");
        for (Airplane airplane : airplanes) {
            System.out.println("Airplane: " + airplane.getPlaneId());
        }
        return airplanes;
    }

    public List<Airplane> getSuitablePlane() {
        List<Airplane> suitableAirplanes = new ArrayList<>();

        for (Airplane airplane : airplanes) {

            if (airplane.isCurrentlyFlying() == false & (airplane.getCurrentNumberOfPassengers() < airplane.getMaxNumberOfPassenger())) {
                suitableAirplanes.add(airplane);
                System.out.println("Plane " + airplane.getPlaneId() + " requested. Is not flying, still room for " +
                        (airplane.getMaxNumberOfPassenger() - airplane.getCurrentNumberOfPassengers()) + " passengers.");
                return suitableAirplanes;
            }
            if (airplane.isCurrentlyFlying() == false & (airplane.getCurrentNumberOfPassengers() >= airplane.getMaxNumberOfPassenger())) {
                System.out.println("Plane " + airplane + " loads " + airplane.getCurrentNumberOfPassengers() + " passengers, " +
                        (airplane.getCurrentNumberOfPassengers() - airplane.getMaxNumberOfPassenger()) + " do not fit into the plane.");
            }
        }
        return null;
    }

  public int loadPassenger(Airplane airplane, int numberPassenger){
        airplane.setCurrentNumberOfPassengers(numberPassenger);
        return airplane.getCurrentNumberOfPassengers();
        
  }


//Getter and Setter Constructor

    public Airport(String name, List<Airplane> airplanes) {
        this.name = name;
        this.airplanes = airplanes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }


}
