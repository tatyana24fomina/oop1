package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test //1.1
    void shouldGetCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);

        int actual = rad.getCurrentStation();
        int expected = 5;

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
        rad.setCurrentStation(9);

        rad.prevStation();
        int expected = 8;

        assertEquals(expected, rad.getCurrentStation());
    }

    //2.
    @Test //2.1
    void shouldGetVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

        int actual = rad.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test //2.2
    void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int expected = 10;

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