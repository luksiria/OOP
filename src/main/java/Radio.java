public class Radio {
    private int numberStation;
    public int Volume;

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

    public void increaseNumberStation() {
        if (numberStation < 9) {
            numberStation = numberStation + 1;
        }
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
        numberStation = newVolume;
    }

}