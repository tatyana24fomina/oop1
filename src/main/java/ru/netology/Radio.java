package ru.netology;

public class Radio {

    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int amountOfStation = 10;

    public Radio() {
    }

    public Radio(int amountOfStation) {
        this.amountOfStation = amountOfStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getAmountOfStation() {
        return amountOfStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation < minStation) {
            return;
        }
        if (CurrentStation > amountOfStation - 1) {
            return;
        }
        this.currentStation = CurrentStation;
    }

    public void nextStation() {
        if (currentStation >= amountOfStation - 1) {
            currentStation = minStation;                     //currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }


    public void prevStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        }
        else {
            currentStation = currentStation - 1;
        }
    }

    //2.
    private int currentVolume;
    private  int minVolume = 0;
    private int maxVolume = 100;


    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < minVolume) {
            return;
        }
        if (CurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}