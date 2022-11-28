package ru.netology.radioman;

public class Radioman {
    private int currentStation;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radioman() {
    }

    public Radioman(int maxStation) {
        this.maxStation = maxStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
        return currentStation;
    }

    public int setNumberCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return currentStation;
        }
        if (currentStation < minStation) {
            return currentStation;
        }
        this.currentStation = currentStation;
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void nextStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void prevStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void increaseCurrentVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}






