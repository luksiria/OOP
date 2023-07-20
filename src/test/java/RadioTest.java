import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void SetAmount() {
        Radio amount = new Radio(5);
        Assertions.assertEquals(5, amount.getAmountStation());
    }

    @Test
    public void ShouldSetNumberStation() {
        Radio numb = new Radio();
        numb.setNumberStation(10);
        int expected = 0;
        int actual = numb.getNumberStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void setNextNumberStation() {
        Radio numb = new Radio();
        numb.setNumberStation(9);

        numb.setNextNumberStation();
        int expected = 0;
        int actual = numb.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevNumberStation() {
        Radio numb = new Radio();
        numb.setNumberStation(8);

        numb.setPrevNumberStation();
        int expected = 7;
        int actual = numb.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetVolume() {
        Radio vol = new Radio();
        vol.setNumberStation(150);
        int expected = 0;
        int actual = vol.getNumberStation();
        Assertions.assertEquals(expected, actual);

    }
}
