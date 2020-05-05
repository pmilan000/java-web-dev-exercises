package exercises.technology;

public class Program {
    public static void main(String[] args){
        Computer comp = new Computer(100.00, "Apple", 8);
        comp.powerOn();
        comp.powerOff();
        comp.runprogram();
        System.out.println(comp.getiD());

        Laptop macBook = new Laptop(1000.00, "Apple", 256, "High End adapter", "Radeon");
        macBook.installIntelliJ();
        System.out.println(macBook.getiD());

        Smartphone iPhone = new Smartphone(800.00, "Apple iPhone", 64, "retinal", true );
        iPhone.makeCall("555-555-5785");
        System.out.println(iPhone.getiD());
    }
}
