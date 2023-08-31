public class Programm {
    public static void main(String[] args) {
        Cat[] cats = new Cat[] {
                new Cat("Барсик", 25),
                new Cat("Пушистик", 30),
                new Cat("Мурзик", 50),
                new Cat("Соседский Рыжик"),
                new Cat()
        };

        Plate plate = new Plate(65);
        System.out.println(plate);
        System.out.println("---------------------");

        for (int i = 0; i < cats.length; i++) {
            boolean is_eated = cats[i].eat(plate.getFood());

            if (is_eated) {
                plate.setFood(plate.getFood() - cats[i].getAppetite());

                System.out.println(String.format(
                        "Кот \"%s\" поел, в тарелке осталось %d единиц еды!", cats[i].getName(), plate.getFood()));
            } else {
                System.out.println(String.format(
                        "Кот \"%s\" не смог поесть, слишком мало еды в тарелке для его аппетита!", cats[i].getName()));
            }
        }

        System.out.println("---------------------");
        for (Cat cat : cats) {
            System.out.println(String.format("Кот \"%s\", Статус - %s", cat.getName(), cat.getFullness()));
        }

    }
}
