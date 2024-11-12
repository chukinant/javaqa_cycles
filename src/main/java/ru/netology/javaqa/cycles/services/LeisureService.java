package ru.netology.javaqa.cycles.services;

public class LeisureService {

    public int calcLeisure(int income, int expenses, int threshold) {
        // initial balance
        int balance = 0;
        // variable for leisure month counting
        int count = 0;

        for (int month = 0; month < 12; month++) {
            if (balance > threshold) {
                count += 1;
                balance = (balance - expenses) / 3;
            } else {
                balance += income - expenses;
            }
        }
        return count;
    }
}
