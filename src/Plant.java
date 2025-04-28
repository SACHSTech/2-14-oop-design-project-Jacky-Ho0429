import java.util.ArrayList;
import java.util.List;

public abstract class Plant {

    private String name;
    private boolean needWater = true;
    private int waterInterval;

    public Plant(String name, int waterInterval) {
        this.name = name;
        this.waterInterval = waterInterval;
    }

    public String getName() {
        return name;
    }

    public int getWaterInterval() {
        return waterInterval;
    }
    
    public boolean needWatering(boolean watered) {
        return needWater;
    }
}
