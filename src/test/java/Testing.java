import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {

@Test
    public void when_divided_by_4_not_100() {assertEquals(true, LeapYear.isLeapYear(1916));}

    @Test
    public void when_divided_by_400() {assertEquals(false, LeapYear.isLeapYear(1999));}

    @Test
    public void when_divided_not_by_4() {assertEquals(true, LeapYear.isLeapYear(1856));}

    @Test
    public void when_divided_by_100_not_400() {assertEquals(false, LeapYear.isLeapYear(2107));}
}