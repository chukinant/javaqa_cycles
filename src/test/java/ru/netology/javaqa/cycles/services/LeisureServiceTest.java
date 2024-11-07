package ru.netology.javaqa.cycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LeisureServiceTest {

    @Test
    public void ShouldCalc1() {
        LeisureService service = new LeisureService();
        int actual = service.calcLeisure(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void ShouldCalc2() {
        LeisureService service = new LeisureService();
        int actual = service.calcLeisure(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(actual,expected);
    }
}
