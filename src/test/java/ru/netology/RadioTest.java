package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadiostation() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(9, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetOffRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(10);
        Assertions.assertEquals(9, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldOffRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(-3);
        Assertions.assertEquals(9, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetNextRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentRadiostation(6);
        radio.nextRadiostation();
        Assertions.assertEquals(7, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetAboveNextRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(10);
        radio.nextRadiostation();
        Assertions.assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetPrevRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(7);
        radio.prevRadiostation();
        Assertions.assertEquals(6, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetUnderPrevRadiostation() {
        Radio radio = new Radio(11);
        radio.setCurrentRadiostation(12);
        radio.prevRadiostation();
        Assertions.assertEquals(10, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        Assertions.assertEquals(10, radio.getCurrentVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetOffVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(120);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldOffVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);
        Assertions.assertEquals(100, radio.getCurrentVolume());
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
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(67);
        radio.decreaseVolume();
        Assertions.assertEquals(66, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetUnderDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
