import java.util.ArrayList;
import java.util.List;

public class FarmLog {
    private int farmId;
    private String farmName;
    private String farmerName;
    private int date;
    private int plantId;
    private String event;

    public FarmLog(int farmId, String farmName, String farmerName, int date, int plantId, String event) {
        this.farmId = farmId;
        this.farmName = farmName;
        this.farmerName = farmerName;
        this.plantId = plantId;
        this.date = date;
        this.event = event;
    }

    public int getFarmId() {
        return farmId;
    }

    public String getName() {
        return farmerName;
    }

    public int getDate() {
        return date;
    }

    public int getPlantId() {
        return plantId;
    }

    public String getEvent() {
        return event;
    }

    public String toString() {
        return farmerName + " " + event + " on " + date + " at " + farmName;
    }    
}
