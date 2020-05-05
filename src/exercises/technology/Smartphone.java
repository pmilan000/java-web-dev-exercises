package exercises.technology;

public class Smartphone extends Computer {
    private boolean hasCellular = true;
    private String displayType;

    public boolean isHasCellular() {
        return hasCellular;
    }
    public void setHasCellular(boolean hasCellular) {
        this.hasCellular = hasCellular;
    }
    public String getDisplayType() {
        return displayType;
    }
    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }


    public Smartphone(double price, String brand, int gbOfRam, String displayType, boolean hasCellular){
        super(price, brand, gbOfRam);
        this.displayType = displayType;
        this.hasCellular = hasCellular;
    }
    public void makeCall(String phoneNumber){
        System.out.println("Call in progress to - " + phoneNumber + " from your " + this.getBrand() + " smartphone");

    }
}
