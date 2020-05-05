package exercises.technology.Test;

import exercises.technology.Smartphone;
import org.junit.Test;
import static org.junit.Assert.*;

public class SmartphoneTest {

    @Test
    public void inheritsBrand(){
        Smartphone tester = new Smartphone(800.00, "Samsung", 128, "retinal", true);
        assertEquals("Samsung", tester.getBrand());
    }
    @Test
    public void inheritsGbOfRam(){
        Smartphone tester2 = new Smartphone(900.00, "iPhone", 256, "pixel", true);
        assertEquals(256, tester2.getGbOfRam());
    }
}
