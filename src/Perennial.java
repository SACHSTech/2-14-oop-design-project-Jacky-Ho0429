public class Perennial extends Plant {
    private int lifeSpan;

    public Perennial(int farmId, int plantId, String plantName, int waterInterval, int lifeSpan) {
        super(farmId, plantId, plantName, waterInterval);
        this.lifeSpan = lifeSpan;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void displayInfo() {
        System.out.println("Plant ID: " + plantId);
        System.out.println("Plant: " + plantName);
        System.out.println("Watering Interval: " + waterInterval + " days");
        System.out.println("Life Span: " + lifeSpan + " years");
    }

}
