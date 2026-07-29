/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personshourly;

import java.time.LocalDate;

/**
 *
 * @author RAGHA
 */
public abstract class Person {
    private String name;
    private LocalDate date;
    private int id;

    public Person(String name, LocalDate date, int id) {
        this.name = name;
        this.date = date;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public abstract void pay();

    @Override
    public String toString() {
        return "Name=" + name + ", id=" + id + ", date=" + date;
    }
}

