package exercises.technology;

public class Laptop extends Computer {
    private String networkAdapter;
    private String gpu;
    public Laptop(double price, String brand, int gbOfRam, String networkAdapter, String gpu) {
        super(price, brand, gbOfRam);
        this.networkAdapter = networkAdapter;
        this.gpu = gpu;
    }
    public void installIntelliJ(){
        System.out.println("Your " + this.getBrand() + " is installing IntelliJ" );
    }
}
