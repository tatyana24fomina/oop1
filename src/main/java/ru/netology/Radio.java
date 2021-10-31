package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation < 0) {
            return;
        }
        if (CurrentStation > 9) {
            return;
        }
        this.currentStation = CurrentStation;
    }

    public void nextStation() {
        if (currentStation >= 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }


    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = 9;
        }
        else {
            currentStation = currentStation - 1;
        }
    }

//2.
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > 10) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}

