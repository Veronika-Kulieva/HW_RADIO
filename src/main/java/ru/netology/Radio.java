package ru.netology;

public class Radio {
    private int currentRadiostation;
    private int currentVolume;

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int newCurrentRadiostation) {
        if (newCurrentRadiostation < 0) {
            return;
        }
        if (newCurrentRadiostation > 9) {
            return;
        }
        currentRadiostation = newCurrentRadiostation;
    }

    public void nextRadiostation() {
        currentRadiostation = currentRadiostation >= 9 ? 0 : ++currentRadiostation;
        setCurrentRadiostation(currentRadiostation);
    }

    public void prevRadiostation() {
        currentRadiostation = currentRadiostation <= 0 ? 9 : --currentRadiostation;
        setCurrentRadiostation(currentRadiostation);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        currentVolume = currentVolume <= 0 ? 100 : ++currentVolume;
        setCurrentVolume(currentVolume);
    }

    public void decreaseVolume() {
        currentVolume = currentVolume <= 0 ? 100 : --currentVolume;
        setCurrentVolume(currentVolume);
    }
}