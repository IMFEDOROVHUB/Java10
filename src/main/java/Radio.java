public class Radio {
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    private int currentWave;

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int newCurrentWave) {

        currentWave = newCurrentWave;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseWave() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
        } else {
            currentWave = 0;
        }
    }

    public void decreaseWave() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        } else {
            currentWave = 9;
        }
    }
}