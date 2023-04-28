public class Drink extends Product{
    private Double volume;

    public Drink(String name, Integer cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s , %s",super.toString(),volume);
    }
}
