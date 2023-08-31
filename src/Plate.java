public class Plate {
    private int food; // кол-во еды в тарелке

    public Plate() {
        this(0);
    }

    public Plate(int food) {
        this.food = checkFood(food);
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

    private int checkFood(int food){
        if (food < 0)
            return 0;

        return food;
    }   

    @Override
    public String toString() {
        return String.format("Plate: Count of Food = %d", this.food);
    }
}
