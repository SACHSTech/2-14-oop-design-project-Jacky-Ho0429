public class Biennial extends Plant {
    private int lifeSpan;
    
    public Biennial(String name, int waterInterval, int lifeSpan) {
        super(name, waterInterval);
        this.lifeSpan = lifeSpan;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

}
