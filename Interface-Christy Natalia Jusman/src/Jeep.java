public class Jeep implements IsLandVehicle, Vehicle {
    private String name;
    private int numWheels;
    private int MaxSpeed;
    private int MaxPassengers;
    public Jeep(String name, int maxSpeed, int maxPassengers, int numWheels) {
        this.name = name;
        this.numWheels = numWheels;
        this.MaxSpeed = MaxSpeed;
        this.MaxPassengers = MaxPassengers;
    }

    public void SoundHorn(){
        System.out.println("BEEP BEEP");
    }

    @Override
    public void drive() {
        System.out.println("drive a car");
    }

    @Override
    public void setNumOfWHeels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public int getNumOfWheels() {
        return numWheels;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMaxPassengers(int MaxPassengers) {
        this.MaxPassengers = MaxPassengers;
    }

    @Override
    public int getMaxPassengers() {
        return MaxPassengers;
    }

    @Override
    public void setMaxSpeed(int MaxSpeed) {
        this.MaxSpeed = MaxSpeed;
    }

    @Override
    public int getMaxSpeed() {
        return MaxSpeed;
    }
}
