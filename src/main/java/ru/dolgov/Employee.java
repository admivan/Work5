package ru.dolgov;

/**
 * Создаем класс Сотрудники
 */
public class Employee {
    /**
     * Создаем поля
     */
    private String fio;
    private String post;
    private String email;
    private String phone;
    private int pay;
    private int age;


    /**
     * Конструктор класса и заполняем данными поля
     * @param fio принимаем Фамилию Имя Отчество
     * @param post принимаем Должность
     * @param email принимаем email
     * @param phone принимаем номер телефона
     * @param pay принимаем зарплату
     * @param age принимаем возраст
     */
    protected Employee(String fio,String post,String email,String phone, int pay, int age){
        this.fio=fio;
        this.post=post;
        this.email=email;
        this.phone=phone;
        this.pay=pay;
        this.age=age;
    }
    //метод возврата возраста
    public int getAge() {
        return age;
    }
    //метод вывода данных
    protected void show(){
        System.out.println("Фамилия Имя Отчество = "+fio + ", Должность = " + post + ", Почта = " + email + ", Телефон = " +
                phone + ", Зарплата = " + pay + ", Возраст = " + age);
    }

}
