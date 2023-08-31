public class Cat {
    private String name;
    private int appetite;
    private String fullness = "Голодный";

    public Cat() {
        this("Неизвестный кот");
    }

    public Cat(String name) {
        this(name, 10);
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return this.appetite;
    }

    public String getFullness() {
        return this.fullness;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean eat(int foodCount) {
        if (this.appetite <= foodCount) {
            this.fullness = "Cытый";
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("Кот: %s | Аппетит: %d | Статус: %s", this.name, this.appetite, this.fullness);
    }
}
