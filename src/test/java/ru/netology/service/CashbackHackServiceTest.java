package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test

    public void shouldCashbackHack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 400;

        int expected = 600;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test

    public void shouldCashbackHackZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test

    public void shouldCashbackHackOne() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test

    public void shouldCashbackHackBeforeMax() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test

    public void shouldCashbackHackMax() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }
}