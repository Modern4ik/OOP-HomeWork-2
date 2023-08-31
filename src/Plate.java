public class Plate {
    private int food;

    public Plate() {
        this(0);
    }

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return this.food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int food) {
        this.food = this.food + food;
    }

    @Override
    public String toString() {
        return String.format("Plate: Count of Food = %d", this.food);
    }
}
