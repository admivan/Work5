package ru.dolgov;

public class Employee {

    protected String fio;
    protected String post;
    protected String email;
    protected String phone;
    protected int pay;
    protected int age;

    public Employee(String fio,String post,String email,String phone, int pay, int age){
        this.fio=fio;
        this.post=post;
        this.email=email;
        this.phone=phone;
        this.pay=pay;
        this.age=age;
    }

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
