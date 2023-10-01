package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test

    public void shouldCashbackHack() {
       CashbackHackService service = new CashbackHackService();
       int amount = 1000;

       int expected = 0;
       int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

}