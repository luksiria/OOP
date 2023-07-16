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
        Radio next = new Radio();
        next.setNumberStation(7);
        int expected = 8;
        int actual = next.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }
}
