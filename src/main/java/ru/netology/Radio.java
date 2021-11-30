package ru.netology;

public class Radio {

    private int currentStation;
    private int minStation = 0;
    private int maxStation;
    private int amountOfStation = 10;

    public Radio() {
    }

    public Radio(int amountOfStation, int minStation, int maxStation) {
        this.amountOfStation = amountOfStation;
        this.minStation = minStation;
        this.maxStation = maxStation;

    }

    public int getAmountOfStation() {
        return amountOfStation;
    }

    public void setAmountOfStation(int amountOfStation) {
        this.amountOfStation = amountOfStation;
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
    private  int minVolume = 1;
    private int maxVolume = 100;

    //public Radio(int minVolume, int maxVolume) {
    //    this.minVolume = minVolume;
    //    this.maxVolume = maxVolume;
    //}

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