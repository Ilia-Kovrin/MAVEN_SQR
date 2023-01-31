package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SqrServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void calcTrue(int expected, int first, int second) {
        SqrService service = new SqrService();

        int actual = service.calcSqr(first, second);

        Assertions.assertEquals(expected, actual);

    }
}