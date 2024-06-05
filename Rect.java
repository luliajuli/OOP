class Rect {
    private double length;
    private double width;

    // Метод, который принимает 2 параметра - длину и ширину, устанавливает их у прямоугольника
    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Метод без параметров - возвращает периметр прямоугольника
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Метод без параметров - возвращает площадь прямоугольника
    public double getArea() {
        return length * width;
    }

    // Геттеры для полей (опционально)
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

