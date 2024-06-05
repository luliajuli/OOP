public class Monster {
    private int eyes;
    private int legs;
    private int arms;

    // Пустой конструктор
    public Monster() {
        this(2, 2, 2);
    }

    // Конструктор с 1 параметром
    public Monster(int eyes) {
        this(eyes, 2, 2);
    }

    // Конструктор с 2 параметрами
    public Monster(int eyes, int legs) {
        this(eyes, legs, 2);
    }

    // Конструктор с 3 параметрами
    public Monster(int eyes, int legs, int arms) {
        this.eyes = eyes;
        this.legs = legs;
        this.arms = arms;
    }

    // Метод, выводящий на экран слово "Голос"
    public void voice() {
        System.out.println("Голос");
    }

    // Метод, выводящий на экран слово "Голос" i раз
    public void voice(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("Голос");
        }
    }

    // Метод, выводящий на экран слово word i раз
    public void voice(int i, String word) {
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }

    // Статический метод для сравнения количества ног у двух монстров
    public static boolean compareLegsStatic(Monster m1, Monster m2) {
        return m1.legs == m2.legs;
    }

    // Нестатический метод для сравнения количества ног у текущего объекта и другого монстра
    public boolean compareLegsNonStatic(Monster other) {
        return this.legs == other.legs;
    }

    // Геттеры для полей (опционально)
    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getArms() {
        return arms;
    }

    // Пример использования класса Monster
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        Monster monster2 = new Monster(3);
        Monster monster3 = new Monster(4, 5);
        Monster monster4 = new Monster(6, 7, 8);

        monster1.voice();
        monster2.voice(3);
        monster3.voice(2, "Рык");

        System.out.println("Monster1: eyes = " + monster1.getEyes() + ", legs = " + monster1.getLegs() + ", arms = " + monster1.getArms());
        System.out.println("Monster2: eyes = " + monster2.getEyes() + ", legs = " + monster2.getLegs() + ", arms = " + monster2.getArms());
        System.out.println("Monster3: eyes = " + monster3.getEyes() + ", legs = " + monster3.getLegs() + ", arms = " + monster3.getArms());
        System.out.println("Monster4: eyes = " + monster4.getEyes() + ", legs = " + monster4.getLegs() + ", arms = " + monster4.getArms());

        // Примеры использования методов сравнения
        System.out.println("Monster1 и Monster2 имеют одинаковое количество ног (статический метод)? " + Monster.compareLegsStatic(monster1, monster2));
        System.out.println("Monster3 и Monster4 имеют одинаковое количество ног (нестатический метод)? " + monster3.compareLegsNonStatic(monster4));
    }
}
