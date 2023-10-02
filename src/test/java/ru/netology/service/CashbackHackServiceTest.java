package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


class CashbackHackServiceTest {

    @Test

    public void shouldCashbackHack() {
       CashbackHackService service = new CashbackHackService();
       int amount = 400;

       int expected = 600;
       int actual = service.remain(amount);
        assertEquals(actual, expected);
       
    }

    @Test

    public void shouldCashbackHackZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test

    public void shouldCashbackHackOne() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test

    public void shouldCashbackHackBeforeMax() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test

    public void shouldCashbackHackMax() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

}