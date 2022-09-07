package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest{

    @Test
    void test() {
        Radio rad = new Radio(10);

        assertEquals(0, rad.getMinStation());
        assertEquals(9, rad.getMaxStation());
    }

    @Test //1
    void shouldAmountOfStation() {
        Radio rad = new Radio();
        assertEquals(10, rad.getAmountOfStation());

    }


    @Test //1.1
    void shouldGetCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(6);

        int actual = rad.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test //1.2
    void shouldNextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.nextStation();

        int expected = 0;

        assertEquals(expected, rad.getCurrentStation());
    }

    @Test //1.3
    void shouldPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        rad.prevStation();
        int expected = 9;

        assertEquals(expected, rad.getCurrentStation());
    }

    //2.

    @Test //2.1
    void shouldGetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(60);

        int actual = rad.getCurrentVolume();
        int expected = 60;

        assertEquals(expected, actual);
    }

    @Test //2.2
    void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        rad.increaseVolume();

        int expected = 100;

        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test //2.3
    void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;

        assertEquals(expected, rad.getCurrentVolume());
    }
}
