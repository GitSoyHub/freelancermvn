package ru.netology.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacaciones.csv")

    public void testVacaciones(int expected, int income, int expenses, int threshold) {
        CalcService service = new CalcService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
