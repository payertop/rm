package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void setCurrentStation() {
        Radioman station = new Radioman();
        int expected = 5;

        station.setCurrentStation(expected);

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void incorrectMinValueSetCurrentStation() {
        Radioman station = new Radioman();
        int expected = station.getCurrentStation();

        station.setCurrentStation(-1);

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void incorrectMaxValueSetCurrentStation() {
        Radioman station = new Radioman();
        int expected = station.getCurrentStation();

        station.setCurrentStation(10);

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushNextRadioStation() {
        Radioman station = new Radioman();
        station.setCurrentStation(9);
        station.nextStation();

        int expected = 0;

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushDoubleNextRadioStation() {
        Radioman station = new Radioman();
        station.setCurrentStation(9);
        station.nextStation();
        station.nextStation();

        int expected = 1;

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushPrevRadioStation() {
        Radioman station = new Radioman();
        station.setCurrentStation(0);
        station.prevStation();


        int expected = 9;

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushDoublePrevRadioStation() {
        Radioman station = new Radioman();
        station.setCurrentStation(2);
        station.prevStation();
        station.prevStation();


        int expected = 0;

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void setCurrentVolume() {
        Radioman station = new Radioman();
        int expected = 8;

        station.setCurrentVolume(expected);

        assertEquals(expected, station.getCurrentVolume());
    }

    @Test
    void incorrectMaxValueSetCurrentVolume() {
        Radioman station = new Radioman();
        int expected = station.getCurrentVolume();

        station.setCurrentVolume(11);

        assertEquals(expected, station.getCurrentVolume());
    }

    @Test
    void incorrectMinValueSetCurrentVolume() {
        Radioman station = new Radioman();
        int expected = station.getCurrentVolume();

        station.setCurrentVolume(-1);

        assertEquals(expected, station.getCurrentVolume());
    }

    @Test
    void volumeUpCurrentVolume() {
        Radioman station = new Radioman();
        station.setCurrentVolume(10);

        station.increaseCurrentVolume();

        assertEquals(station.getMaxVolume(), station.getCurrentVolume());
    }

    @Test
    void volumeDoubleUpCurrentVolume() {
        Radioman station = new Radioman();
        station.setCurrentVolume(9);

        station.increaseCurrentVolume();
        station.increaseCurrentVolume();

        assertEquals(station.getMaxVolume(), station.getCurrentVolume());
    }

    @Test
    void volumeDownCurrentVolume() {
        Radioman station = new Radioman();
        station.setCurrentVolume(0);

        station.decreaseCurrentVolume();

        assertEquals(station.getMinVolume(), station.getCurrentVolume());
    }

    @Test
    void volumeDoubleDownCurrentVolume() {
        Radioman station = new Radioman();
        station.setCurrentVolume(1);

        station.decreaseCurrentVolume();
        station.decreaseCurrentVolume();

        assertEquals(station.getMinVolume(), station.getCurrentVolume());
    }
}