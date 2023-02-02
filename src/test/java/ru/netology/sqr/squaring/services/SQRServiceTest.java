package ru.netology.sqr.squaring.services;
import org.junit.jupiter.params.ParameterizedTest;
import ru.netology.sqr.squaring.services.SQRService;


import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @ParameterizedTest

    public void testSQRService() {
        SQRService service = new SQRService();

        int actual = service.enumerationAndScore(20,80);
        // подготавливаем данные:
        //long amount = 1000;
        //boolean registered = true;
        //long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, isRegistered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}