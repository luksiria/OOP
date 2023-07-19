public class Radio {
    private int numberStation;
    private int Volume;


    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
            return;
        }
        if (newNumberStation > 9) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void increaseNextNumberStation() {
        if (numberStation >= 9) {
            numberStation = 0;
        } else {
            numberStation = numberStation + 1;
        }
    }

    public void increasePrevNumberStation() {
        if (numberStation > 0) {
            numberStation = numberStation - 1;
        } else
            numberStation = 9;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        Volume = newVolume;
    }
}


