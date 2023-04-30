package org.example;

public class Radio {
    public int radioStationNumber;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        radioStationNumber = newRadioStationNumber;

    }

    public void nextStation(int newRadioStationNumber) {
        if (newRadioStationNumber < 9) {
            newRadioStationNumber = newRadioStationNumber + 1;
            radioStationNumber = newRadioStationNumber;
        } else if (newRadioStationNumber == 9) {
            newRadioStationNumber = 0;
            radioStationNumber = newRadioStationNumber;
        }

    }

    public void prevStation(int newRadioStationNumber) {
        if (newRadioStationNumber > 0) {
            newRadioStationNumber = newRadioStationNumber - 1;
            radioStationNumber = newRadioStationNumber;
        } else if (newRadioStationNumber == 0) {
            newRadioStationNumber = 9;
            radioStationNumber = newRadioStationNumber;
        }

    }

    public int currentVolume;

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

    public void increaseVolume(int newIncreaseVolume) {
        if (newIncreaseVolume < 100) {
            currentVolume = newIncreaseVolume + 1;
        }else{
            currentVolume =100;
        }

    }
    public void decreaseVolume(int newDecreaseVolume) {
        if (newDecreaseVolume > 0) {
            currentVolume = newDecreaseVolume - 1;
        }else{
            currentVolume =0;
        }

    }
}
