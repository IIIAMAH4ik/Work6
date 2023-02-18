package ru.netology.sqr.squaring.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.squaring.services.SQRService;


import static org.junit.jupiter.api.Assertions.*;
    class SQRServiceTest {
        @Test
        public void testCalcWhenSomeSquaresFound() {
            SQRService service = new SQRService();

           int actual = service.calc(200,300);
           int expected = 3;
            Assertions.assertEquals(expected, actual);
        }

    }