package ru.dolgov;

/**
 * Создаем класс Сотрудники
 */
public class Employee {
    /**
     * Создаем поля
     */
    protected String fio;
    protected String post;
    protected String email;
    protected String phone;
    protected int pay;
    protected int age;

    /**
     * Конструктор класса и заполняем данными поля
     * @param fio принимаем Фамилию Имя Отчество
     * @param post принимаем Должность
     * @param email принимаем email
     * @param phone принимаем номер телефона
     * @param pay принимаем зарплату
     * @param age принимаем возраст
     */
    public Employee(String fio,String post,String email,String phone, int pay, int age){
        this.fio=fio;
        this.post=post;
        this.email=email;
        this.phone=phone;
        this.pay=pay;
        this.age=age;
    }

    /**
     * Переопределяем метод toString
     * @return Возвращаем данные с полей
     */
    @Override
    public String toString() {
        return  "Фамилия Имя Отчество = " + fio + '\'' +
                ", Должность = " + post + '\'' +
                ", email = " + email + '\'' +
                ", Телефон = " + phone + '\'' +
                ", Зарплата = " + pay +
                ", Возраст = " + age;
    }

}
