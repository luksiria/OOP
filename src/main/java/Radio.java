public class Radio {
    private int numberStation;
    private int Volume;

    private int amountStation;
    private int maxNumberStation;

    public Radio() {
        maxNumberStation = 9;

    }

    public Radio(int amountStation) {
        maxNumberStation = amountStation - 1;
    }

    public int getNumberStation() {
        return numberStation;
    }


    public void setNumberStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > maxNumberStation) {
            return;
        }
        this.numberStation = numberStation;
    }

    public void setNextNumberStation() {
        if (numberStation >= maxNumberStation) {
            numberStation = 0;
        } else {
            numberStation++;
        }
        this.numberStation = numberStation;
    }

    public void setPrevNumberStation() {
        if (numberStation <= 0) {
            numberStation = maxNumberStation;
        } else {
            numberStation--;
        }
        this.numberStation = numberStation;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume >= 100) {
            return;
        }
        Volume = volume;
    }
}


