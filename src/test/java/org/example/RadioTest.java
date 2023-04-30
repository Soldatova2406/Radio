package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setRadioStationTest() {
        Radio station = new Radio();
        station.setRadioStationNumber(5);

        int expected = 5;
        int actual = station.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setRadioStationMaxTest() {
        Radio station = new Radio();
        station.setRadioStationNumber(10);

        int expected = 0;
        int actual = station.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setRadioStationMinTest() {
        Radio station = new Radio();
        station.setRadioStationNumber(-1);

        int expected = 0;
        int actual = station.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest() {
        Radio station = new Radio();
        station.nextStation(8);

        int expected = 9;
        int actual = station.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationTest() {
        Radio station = new Radio();
        station.prevStation(1);

        int expected = 0;
        int actual = station.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void increaseVolumeTest() {
        Radio station = new Radio();
        station.increaseVolume(100);

        int expected = 100;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void decreaseVolumeTest() {
        Radio station = new Radio();
        station.decreaseVolume(10);

        int expected = 9;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}
