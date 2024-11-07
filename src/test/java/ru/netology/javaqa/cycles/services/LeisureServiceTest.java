package ru.netology.javaqa.cycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class LeisureServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/LeisureServiceTestData.csv")
    public void testCalcLeisureService(int income, int expenses, int threshold, int expected) {
        LeisureService service = new LeisureService();
        int actual = service.calcLeisure(income, expenses, threshold);

        Assertions.assertEquals(actual,expected);
    }

}
