package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    private final Radioman radio = new Radioman();
    private final Radioman radioChangeMaxStation = new Radioman(50);

    @Test
    void shouldGetCurrentStation() {
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetCurrentStationMax() {
        int expected = 49;
        int actual = radioChangeMaxStation.getMaxStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextNumberStation() {
        int expected = 1;
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextNumberChangeStationMax() {
        int expected = radioChangeMaxStation.getMinStation();

        radioChangeMaxStation.setNumberCurrentStation(radioChangeMaxStation.getMaxStation());

        radioChangeMaxStation.nextStation();

        int actual = radioChangeMaxStation.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextNumberStationMax() {
        int expected = radio.getMinStation();

        radio.setNumberCurrentStation(radio.getMaxStation());

        radio.nextStation();

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevNumberStationMin() {
        int expected = radio.getMinStation();

        radio.setNumberCurrentStation(-1);

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextNumberStationMaxChange() {
        int expected = radioChangeMaxStation.getMaxStation();

        radioChangeMaxStation.setNumberCurrentStation(50);

        int actual = radioChangeMaxStation.getMaxStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStation() {
        int expected = 5;
        radioChangeMaxStation.setNumberCurrentStation(6);
        radioChangeMaxStation.prevStation();

        int actual = radioChangeMaxStation.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStationMin() {
        int expected = radio.getMaxStation() - 1;
        radio.setCurrentStation(0);
        radio.prevStation();
        int actual = radio.getCurrentStation() - 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStationMinChange() {
        int expected = radioChangeMaxStation.getMaxStation();
        radioChangeMaxStation.setCurrentStation(0);
        radioChangeMaxStation.prevStation();
        int actual = radioChangeMaxStation.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStationChangeMin() {
        int expected = 48;
        radioChangeMaxStation.setCurrentStation(radioChangeMaxStation.getMaxStation());
        radioChangeMaxStation.prevStation();
        int actual = radioChangeMaxStation.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStationMinRadio() {
        int expected = 8;
        radio.setCurrentStation(radio.getMaxStation() - 1);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation() {
        int expected = 7;
        int actual = radioChangeMaxStation.setCurrentStation(7);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetCurrentVolume() {
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        int expected = 1;
        radio.increaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeBigMax() {
        int expected = 100;
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseCurrentVolume();

        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMax() {
        int expected = 100;
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseCurrentVolume();

        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        int expected = 5;
        radio.setCurrentVolume(6);
        radio.decreaseCurrentVolume();

        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDoubleDecreaseVolume() {
        int expected = 5;
        radio.setCurrentVolume(7);
        radio.decreaseCurrentVolume();
        radio.decreaseCurrentVolume();

        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldIncreaseVolumeMin() {
        int expected = 0;
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}