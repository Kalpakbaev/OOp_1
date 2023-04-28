public class Fruits extends Product{
    private String sort;

    public Fruits(String name, Integer cost,String sort) {
        super(name, cost);
        this.sort = sort;
    }

    @Override
    public String toString() {
        return String.format("%s,%s",super.toString(),sort);
    }
}
