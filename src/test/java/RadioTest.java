import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void ShouldSetNumberStation() {
        Radio numb = new Radio(20);
        numb.setNumberStation(15);
        int expected = 15;
        int actual = numb.getNumberStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void setNextNumberStation() {
        Radio numb = new Radio(20);
       numb.setNumberStation(19);

       numb.setNextNumberStation();

        int expected = 0;
        int actual = numb.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevNumberStation() {
        Radio numb = new Radio();

        numb.setPrevNumberStation();

        int expected = 9;
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