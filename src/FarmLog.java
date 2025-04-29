import java.util.ArrayList;
import java.util.List;

public class FarmLog {
    private int farmId;
    private String farmName;
    private String farmerName;
    private String date;
    private String plant;
    private String event;

    public FarmLog(int farmId, String farmName, String farmerName, String date, String plant, String event) {
        this.farmId = farmId;
        this.farmName = farmName;
        this.farmerName = farmerName;
        this.plant = plant;
        this.date = date;
        this.event = event;
    }

    public int getFarmId() {
        return farmId;
    }

    public String getName() {
        return farmerName;
    }

    public String getDate() {
        return date;
    }

    public String getPlant() {
        return plant;
    }

    public String getEvent() {
        return event;
    }

    public String toString() {
        return farmerName + " " + event + " on " + date + " at " + farmName;
    }    
}
