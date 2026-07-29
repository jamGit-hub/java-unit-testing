/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personshourly;

import java.time.LocalDate;

/**
 *
 * @author RAGHA
 */
    
    public class Hourly extends Person {
    private double payRate;
    private double hours;
    private String job;

    public Hourly(String name, LocalDate date, int id, double payRate, double hours, String job) {
        super(name, date, id);
        this.payRate = payRate;
        this.hours = hours;
        this.job = job;
    }

    public double getPayRate() { return payRate; }
    public double getHours() { return hours; }
    public String getJob() { return job; }

    @Override
    public void pay() {
        double pay = payRate * hours;
        System.out.printf("%.2f hours @ $%.2f = $%.2f weekly%n", hours, payRate, pay);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "payRate=" + String.format("$%.2f", payRate) +
               ", hours=" + hours +
               ", job=" + job;
    }
    
    public static void main(String[] args) {
         Hourly h = new Hourly("Alice", LocalDate.of(2025, 1, 1),101, 20.0, 40.0, "Developer");
        System.out.println("Employee Info:");
        System.out.println(h);
        System.out.println("\nWeekly Pay:");
        h.pay();
    }
    }

