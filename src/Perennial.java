public class Perennial extends Plant {
    private int lifeSpan;
    
    public Perennial(String name, int waterInterval, int lifeSpan) {
        super(name, waterInterval);
        this.lifeSpan = lifeSpan;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

}
