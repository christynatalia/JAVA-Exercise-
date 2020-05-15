public class Driver {
    public static void main(String[] args) {
        PoliceCar p1 = new PoliceCar("Police Car",100,4,4);
        p1.SoundSiren();
        p1.drive();
        p1.StopSiren();
        System.out.println(p1.getName());
        System.out.println("\n"+p1.getNumOfWheels());

        Jeep j1 = new Jeep("Jeep",70,6,4);
        j1.SoundHorn();

        Hovercraft h1 = new Hovercraft("Hovercraft",100,8,6,12);
        h1.launch();
        h1.setNumOfWHeels(4);
        h1.EnterLand();
        h1.EnterSea();

        Frigate f1 = new Frigate("Frigate",90,4,19);
        f1.FireGun();
        f1.setDisplacement(21);
        System.out.println(f1.getDisplacement());

    }
}
