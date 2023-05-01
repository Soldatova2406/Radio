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
        station.nextStation(6);

        int expected = 7;
        int actual = station.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationMaxTest() {
        Radio station = new Radio();
        station.nextStation(9);

        int expected = 0;
        int actual = station.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationOverTest() {
        Radio station = new Radio();
        station.nextStation(10);

        int expected = 0;
        int actual = station.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationTest() {
        Radio station = new Radio();
        station.prevStation(3);

        int expected = 2;
        int actual = station.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationMinTest() {
        Radio station = new Radio();
        station.prevStation(0);

        int expected = 9;
        int actual = station.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStation0Test() {
        Radio station = new Radio();
        station.prevStation(-1);

        int expected = 0;
        int actual = station.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolumeTest() {
        Radio station = new Radio();
        station.setCurrentVolume(10);

        int expected = 10;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMaxTest() {
        Radio station = new Radio();
        station.setCurrentVolume(101);

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMinTest() {
        Radio station = new Radio();
        station.setCurrentVolume(-1);

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio station = new Radio();
        station.increaseVolume(10);

        int expected = 11;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMaxTest() {
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

    @Test
    public void decreaseVolumeMinTest() {
        Radio station = new Radio();
        station.decreaseVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}
