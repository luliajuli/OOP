class Worker {
    private String name;
    private String position;
    private double salary;

    // Конструктор с параметрами
    public Worker(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Метод, возвращающий информацию о сотруднике и сумме зарплаты за i месяцев
    public String getSalaryInfo(int months) {
        double totalSalary = salary * months;
        return String.format("Сотрудник: %s, Должность: %s, Месячная зарплата: %.2f, Зарплата за %d месяцев: %.2f",
                name, position, salary, months, totalSalary);
    }

    // Геттеры для полей (опционально)
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
}

