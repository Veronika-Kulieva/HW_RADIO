package ru.netology;

public class Radio {

    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadiostation = minRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int size) {
        maxRadioStation = minRadioStation + (size - 1);
    }

    public Radio() {
        currentRadiostation = maxRadioStation;
        currentVolume = maxVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int newCurrentRadiostation) {
        if (newCurrentRadiostation < 0) {
            return;
        }
        if (newCurrentRadiostation > maxRadioStation) {
            return;
        }
        currentRadiostation = newCurrentRadiostation;
    }

    public void nextRadiostation() {
        currentRadiostation = currentRadiostation >= maxRadioStation ? 0 : ++currentRadiostation;
        setCurrentRadiostation(currentRadiostation);
    }

    public void prevRadiostation() {
        currentRadiostation = currentRadiostation <= 0 ? maxRadioStation : --currentRadiostation;
        setCurrentRadiostation(currentRadiostation);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        currentVolume = currentVolume >= maxVolume ? 0 : ++currentVolume;
        setCurrentVolume(currentVolume);
    }

    public void decreaseVolume() {
        currentVolume = currentVolume >= maxVolume ? 0 : --currentVolume;
        setCurrentVolume(currentVolume);
    }
}