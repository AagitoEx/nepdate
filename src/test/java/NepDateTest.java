
import io.github.aagitoex.nepdate.NepDate;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NepDateTest {

    @Test
    void plusDays() {
        NepDate date = new NepDate(2079, 1, 1);
        assertEquals(new NepDate(2079, 1, 6), date.plusDays(5));
        assertEquals(new NepDate(2079, 2, 1), date.plusDays(31));
        date = new NepDate(2079, 12, 29);
        assertEquals(new NepDate(2080, 1, 4), date.plusDays(5));
        assertEquals(new NepDate(2079, 12, 24), date.plusDays(-5));
        assertEquals(new NepDate(2079, 11, 29), date.plusDays(-30));
    }

    @Test
    void plusMonths() {
        NepDate date = new NepDate(2079, 1, 1);
        assertEquals(new NepDate(2079, 6, 1), date.plusMonths(5));
        assertEquals(new NepDate(2080, 1, 1), date.plusMonths(12));
        date = new NepDate(2079, 12, 29);
        assertEquals(new NepDate(2080, 5, 29), date.plusMonths(5));
        assertEquals(new NepDate(2079, 7, 29), date.plusMonths(-5));
        assertEquals(new NepDate(2078, 12, 29), date.plusMonths(-12));
    }

    @Test
    void comparision() {
        //list of io.github.aagitoex.nepdate.NepDate with random values
        NepDate[] dates = new NepDate[100];
        for (int i = 0; i < dates.length; i++) {
            dates[i] = new NepDate(
                    (int) (Math.random() * (2100 - 1975) + 1975),
                    (int) (Math.random() * 12 + 1),
                    (int) (Math.random() * 30 + 1)
            );
        }

        //print dates
        System.out.println("Dates: " + Arrays.toString(dates));
        Arrays.sort(dates);
    }
}