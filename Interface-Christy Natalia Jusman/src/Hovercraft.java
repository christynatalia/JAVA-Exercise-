public class Hovercraft implements SeaVehicle, IsLandVehicle{
    private int displacement;
    private int numWheels;
    private String name;
    private int MaxSpeed;
    private int MaxPassengers;
    public Hovercraft(String name, int MaxSpeed, int MaxPassengers, int numWheels,int displacement) {
        this.name = name;
        this.numWheels = numWheels;
        this.MaxSpeed = MaxSpeed;
        this.MaxPassengers = MaxPassengers;
        setDisplacement(displacement);
    }

    @Override
    public void launch() {
        System.out.println("Launch ");
    }

    @Override
    public void setDisplacement(int displacement) {
    this.displacement = displacement;
    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    public void EnterLand(){
        System.out.println("Enter land");

    }

    public void EnterSea(){
        System.out.println("Enter sea");

    }

    @Override
    public void drive() {
        System.out.println("Drive ");
    }

    @Override
    public void setNumOfWHeels(int numWHeels) {
        this.numWheels = numWHeels;
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
