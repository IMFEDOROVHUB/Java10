import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void increaseRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(17);
        radio.decreaseVolume();

        int expected = 16;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMinRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setRadioWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(3);

        int expected = 3;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextMaxRadioWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(9);
        radio.increaseWave();

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(5);
        radio.increaseWave();

        int expected = 6;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevMinRadioWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(0);
        radio.decreaseWave();

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(5);
        radio.decreaseWave();

        int expected = 4;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberWave() {
        Radio radio = new Radio(121);

        Assertions.assertEquals(121, radio.getNumberWave());
        Assertions.assertEquals(0, radio.getCurrentWave());
    }

    @Test
    public void setPrevMinNumberWave() {
        Radio radio = new Radio(65);

        radio.setCurrentWave(0);
        radio.decreaseWave();

        int expected = 64;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNextMaxNumberWave() {
        Radio radio = new Radio(72);

        radio.setCurrentWave(71);
        radio.increaseWave();

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }
}
