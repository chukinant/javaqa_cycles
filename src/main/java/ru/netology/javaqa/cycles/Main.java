package ru.netology.javaqa.cycles;

import ru.netology.javaqa.cycles.services.LeisureService;

public class Main {
    public static void main(String[] args) {
        LeisureService service = new LeisureService();
        int x = service.calcLeisure(10, 3, 20);
        System.out.println("You can have " + x + " leisure months a year");
    }
}