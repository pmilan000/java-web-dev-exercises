package exercises.technology;

public class Computer extends AbstractEntity {

    private double price;
    private String brand;
    private int gbOfRam;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getGbOfRam() {
        return gbOfRam;
    }

    public void setGbOfRam(int gbOfRam) {
        this.gbOfRam = gbOfRam;
    }

    public Computer(double price, String brand, int gbOfRam){
        this.price = price;
        this.brand = brand;
        this.gbOfRam = gbOfRam;
    }
    public void powerOn(){
        System.out.println(this.brand + "device powering on!");

    }
    public void powerOff(){
        System.out.println(this.brand + "device powering off!");
    }
    public void runprogram(){
        System.out.println(this.brand + "device running program.");
    }
}
