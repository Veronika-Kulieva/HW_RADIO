package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadiostation = minRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public void nextRadiostation() {
        currentRadiostation = currentRadiostation >= maxRadioStation ? 0 : ++currentRadiostation;
        setCurrentRadiostation(currentRadiostation);
    }

    public void prevRadiostation() {
        currentRadiostation = currentRadiostation <= 0 ? maxRadioStation : --currentRadiostation;
        setCurrentRadiostation(currentRadiostation);
    }

    public void increaseVolume() {
        currentVolume = currentVolume >= maxVolume ? maxVolume : ++currentVolume;
        setCurrentVolume(currentVolume);
    }

    public void decreaseVolume() {
        currentVolume = currentVolume > maxVolume ? 0 : --currentVolume;
        setCurrentVolume(currentVolume);
    }
}