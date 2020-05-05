package exercises.technology;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractEntity {
    private int iD;

    public AbstractEntity() {
        this.iD = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    }

    public int getiD() {
        return this.iD;
    }
}
