package airport;

public class Airplane {
    private String planeId;
    private int maxNumberOfPassenger;
    private int currentNumberOfPassengers;
    private boolean isCurrentlyFlying;
    private double speed;


    public int loadPassenger(int numberOfPassenger) {
        this.currentNumberOfPassengers = this.getCurrentNumberOfPassengers();
        if (this.currentNumberOfPassengers >= 0 | this.currentNumberOfPassengers < this.maxNumberOfPassenger) {
            this.currentNumberOfPassengers += numberOfPassenger;
            if (this.currentNumberOfPassengers <= this.maxNumberOfPassenger) {
                System.out.println("Airplane " + this.planeId + " charges " + this.currentNumberOfPassengers + " passengers.");
                return this.currentNumberOfPassengers;
            } else {
                System.out.println("Airplane " + this.planeId + " charges " + this.maxNumberOfPassenger + " passengers," +
                        (this.currentNumberOfPassengers - this.maxNumberOfPassenger) + " do not fit");
                return this.currentNumberOfPassengers;
            }
        } else {
            System.out.println("Airplane " + this.planeId + " charges " + this.maxNumberOfPassenger + " passengers," +
                    (this.currentNumberOfPassengers - this.maxNumberOfPassenger) + " do not fit");
            return this.currentNumberOfPassengers;
        }
    }

    public int unloadPassenger(int numberOfPassenger) {

        this.currentNumberOfPassengers -= numberOfPassenger;
        System.out.println("Airplane " + this.planeId + " discharges " + numberOfPassenger + " passengers.");
        return this.currentNumberOfPassengers;
    }

    public void airplaneTakeOff() {
        if(this.isCurrentlyFlying==false){
            this.isCurrentlyFlying = true;
            System.out.println("Airplane " + this.planeId + " rises.");
        }else{
            System.out.println("Airplane " + this.planeId + " can not take off, because we are already flying.");
        }

    }

    public void airplaneLand() {
        if(this.isCurrentlyFlying==true){
            this.isCurrentlyFlying = false;
            this.speed = 0;
            System.out.println("Airplane " + this.planeId + " lands.");
        }else{
            System.out.println("Airplane " + this.planeId + " can not land, because we are still on the ground. ");
        }
    }


    //Getter Setter constructor

    public Airplane(String planeId, int maxNumberOfPassenger, int currentNumberOfPassengers, boolean isCurrentlyFlying,
                    double speed) {
        this.planeId = planeId;
        this.maxNumberOfPassenger = maxNumberOfPassenger;
        this.currentNumberOfPassengers = currentNumberOfPassengers;
        this.isCurrentlyFlying = isCurrentlyFlying;
        this.speed = speed;
    }

    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public int getMaxNumberOfPassenger() {
        return maxNumberOfPassenger;
    }

    public void setMaxNumberOfPassenger(int maxNumberOfPassenger) {
        this.maxNumberOfPassenger = maxNumberOfPassenger;
    }

    public int getCurrentNumberOfPassengers() {
        return currentNumberOfPassengers;
    }

    public void setCurrentNumberOfPassengers(int currentNumberOfPassengers) {
        this.currentNumberOfPassengers = currentNumberOfPassengers;
    }

    public boolean isCurrentlyFlying() {
        return isCurrentlyFlying;
    }

    public void setCurrentlyFlying(boolean currentlyFlying) {
        isCurrentlyFlying = currentlyFlying;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}
