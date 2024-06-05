public class Main {
    public static void main(String[] args) {
        // Создание объектов Worker
        Worker worker1 = new Worker("Иван Иванов", "Менеджер", 50000);
        Worker worker2 = new Worker("Петр Петров", "Разработчик", 70000);

        // Пример работы метода getSalaryInfo
        System.out.println(worker1.getSalaryInfo(6));
        System.out.println(worker2.getSalaryInfo(3));


            // Создание объекта Rect
            Rect rect = new Rect();

            // Установка длины и ширины
            rect.setDimensions(5.0, 3.0);

            // Вывод периметра и площади прямоугольника
            System.out.println("Длина прямоугольника: " + rect.getLength());
            System.out.println("Ширина прямоугольника: " + rect.getWidth());
            System.out.println("Периметр прямоугольника: " + rect.getPerimeter());
            System.out.println("Площадь прямоугольника: " + rect.getArea());
    }

}
