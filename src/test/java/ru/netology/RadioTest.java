package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(3);
        Assertions.assertEquals(9, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(3, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(9);
        radio.nextRadiostation();
        Assertions.assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetAboveNextStasion() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(-1);
        radio.nextRadiostation();
        Assertions.assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(0);
        radio.prevRadiostation();
        Assertions.assertEquals(9, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetUnderPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(10);
        radio.prevRadiostation();
        Assertions.assertEquals(9, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(56);
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(56, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(45);
        radio.increaseVolume();
        Assertions.assertEquals(46, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetAboveIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(102);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetUnderDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
