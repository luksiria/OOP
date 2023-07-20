public class Radio {
    private int numberStation;
    private int maxStation = 9;
    private int amountStation;
    private int amountMaxStation = 10;
    private int Volume;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
        this.amountMaxStation = amountMaxStation;
    }
    public Radio() {

    }

    public int getAmountStation() {
        return amountStation;
    }

    public void setAmountStation(int newAmountStation) {
        if (newAmountStation < 0) {
            return;
        }
        if (newAmountStation >= amountMaxStation) {
            return;
        }
        amountStation = newAmountStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
            return;
        }
        if (newNumberStation >= amountMaxStation) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void setNextNumberStation() {
        if (numberStation >= maxStation) {
            numberStation = 0;
        } else {
            numberStation = numberStation + 1;
        }
    }

    public void setPrevNumberStation() {
        if (numberStation >= 0) {
            numberStation = numberStation - 1;
        } else
            numberStation = maxStation;
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


