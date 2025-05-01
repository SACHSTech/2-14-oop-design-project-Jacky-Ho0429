public class Biennial extends Plant {
    private int lifeSpan;

    public Biennial(int farmId, int plantId, String plantName, int waterInterval, int lifeSpan) {
        super(farmId, plantId, plantName, waterInterval);
        this.lifeSpan = lifeSpan;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public String displayInfo() {
        return "Plant ID: " + plantId + "\n" + "Plant: " + plantName + "\n" + "Plant Type: Biennial\n" + "Watering Interval: " + waterInterval + " days\n" + "Life Span: " + lifeSpan + " years\n";
    }
}
