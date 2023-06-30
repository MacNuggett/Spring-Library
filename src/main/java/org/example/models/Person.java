package org.example.models;

import jakarta.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Имя пустое")
    @Size(min = 2, max = 30, message = "Имя должно быть в диаполозне 2-30 символов")
    private String name;

    @Min(value = 18, message = "Минимальный возраст - 18")
    private int age;


    public Person() {}

    public Person(int id, String name, int age, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
