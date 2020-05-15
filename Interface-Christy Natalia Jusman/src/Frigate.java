public class Frigate implements SeaVehicle, Vehicle {
    private int displacement;
    private String name;
    private int MaxSpeed;
    private int MaxPassengers;
    public Frigate(String name, int MaxSpeed, int MaxPassengers,int displacement) {
        this.displacement = displacement;
        this.name = name;
        this.MaxSpeed = MaxSpeed;
        this.MaxPassengers = MaxPassengers;
    }

    @Override
    public void launch() {
        System.out.println("lauch sea vehicle");

    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;


    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    public void FireGun(){
        System.out.println("Fire Gun");
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


