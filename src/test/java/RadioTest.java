import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void ShouldSetNumberStation() {
        Radio numb = new Radio();
        numb.setNumberStation(10);
        int expected = 0;
        int actual = numb.getNumberStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseNumberStation() {
        Radio numb = new Radio();
        numb.setNumberStation(7);

        numb.increaseNumberStation();
        int expected = 8;
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
