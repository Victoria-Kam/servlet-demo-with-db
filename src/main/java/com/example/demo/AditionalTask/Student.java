package com.example.demo.AditionalTask;

public class Student {

    private int idStudent;
    private String name;
    private String surname;

    public Student(int idStudent, String name, String surname) {
        this.idStudent = idStudent;
        this.name = name;
        this.surname = surname;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
