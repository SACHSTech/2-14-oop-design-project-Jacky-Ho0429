import java.util.ArrayList;
import java.util.List;

public abstract class Plant {

    private String name;
    private boolean needWater = true;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public boolean needWatering(boolean watered) {
        return needWater;
    }
}
