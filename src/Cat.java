public class Cat {
    private String name; // Кличка кота
    private int appetite; // Аппетит кота
    private String fullness = "Голодный"; // Сытость кота

    public Cat() {
        this("Неизвестный кот");
    }

    public Cat(String name) {
        this(name, 10);
    }

    public Cat(String name, int appetite) {
        
        this.name = checkName(name);
        this.appetite = checkAppetite(appetite);
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

    private String checkName(String name){
        if (name.length() < 2){
            return "Неизвестный кот";
        }

        return name;
    }

    private int checkAppetite(int appetite){
        if (appetite < 10){
            return 10;
        }

        return appetite;
    }   

    @Override
    public String toString() {
        return String.format("Кот: %s | Аппетит: %d | Статус: %s", this.name, this.appetite, this.fullness);
    }
}
