package ru.dolgov;

public class Work5 {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Долгов Иван Сергеевич", "Инженер-программист",
                "popded0**@gmail.com", "+7908346****", 40000, 26);
        employee[1] = new Employee("Соболева Анна Германовна", "Программист",
                "popded1**@gmail.com", "+7908346****", 80000, 45);
        employee[2] = new Employee("Сидорова Ангелина Михайловна", "Главный Инженер",
                "popded2**@gmail.com", "+7908346****", 50000, 24);
        employee[3] = new Employee("Савельев Роман Владиславович", "Программист",
                "popded3**@gmail.com", "+7908346****", 49000, 48);
        employee[4] = new Employee("Борисов Александр Михайлович", "Программист",
                "popded4**@gmail.com", "+7908346****", 46000, 30);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].age > 40) {
                System.out.println(employee[i]);
            }
        }

    }
}
