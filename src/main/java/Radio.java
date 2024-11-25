public class Radio {
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    private int numberWave;
    private int currentWave;

    public Radio(int numberWave) {
        this.numberWave = numberWave;
    }

    public Radio() {
        this.numberWave = 10;
    }

    public int getCurrentWave() {
        return currentWave;
    }


    public int getNumberWave() {
        return numberWave;
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
        if (currentWave < numberWave - 1) {
            setCurrentWave(currentWave + 1);
        } else {
            currentWave = 0;
        }
    }

    public void decreaseWave() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        } else {
            setCurrentWave(numberWave - 1);
        }
    }
}