package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test //1
    void shouldAmountOfStation() {
        Radio rad = new Radio();
        assertEquals(10, rad.getAmountOfStation());

    }

    @Test //1.0
    void shouldGetAmountOfStation() {
        Radio rad = new Radio(12, 0, 11);
        rad.setAmountOfStation(12);
        assertEquals(12, rad.getAmountOfStation());

    }

    @Test //1.1
    void shouldGetCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);

        int actual = rad.getCurrentStation();
        int expected = 8;

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

        rad.setCurrentStation(6);

        rad.prevStation();
        int expected = 5;

        assertEquals(expected, rad.getCurrentStation());
    }

    //2.

    //@Test //1.0
    //void shouldGetCurrentVolume() {
    //    Radio rad = new Radio(1, 100);
    //    rad.setCurrentVolume(5);
    //    assertEquals(5, rad.getCurrentVolume());

    //}

    @Test //2.1
    void shouldGetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(55);

        int actual = rad.getCurrentVolume();
       int expected = 55;

        assertEquals(expected, actual);
    }

    @Test //2.2
    void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(4);

        rad.increaseVolume();

        int expected = 5;

        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test //2.3
    void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(2);

        rad.decreaseVolume();

        int expected = 1;

        assertEquals(expected, rad.getCurrentVolume());
    }
}
