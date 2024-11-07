package ru.netology.javaqa.cycles.services;

public class LeisureService {

//    int income = 170;
//    int expenses = 80;
//    int threshold = 100;

    public int calcLeisure(int income, int expenses, int threshold) {
        // initial balance
        int balance = 0;
        // variable for leisure month counting
        int count = 0;
        for (int i=0; i < 12 ; i++) {
            if (balance > threshold) {
                count += 1;
                balance = (balance - expenses) / 3;}
            else balance += income - expenses;
        }
        return count;
    }
}
