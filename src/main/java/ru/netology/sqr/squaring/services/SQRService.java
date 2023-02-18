package ru.netology.sqr.squaring.services;

import java.sql.SQLOutput;

public class SQRService {

    public int calc(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int iSquere = i * i;
            if (iSquere >= min) {
                if (iSquere <= max) {
                    counter++;
                }
            }
        }
        return counter;
    }
}