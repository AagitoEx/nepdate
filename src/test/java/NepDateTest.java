
import io.github.aagitoex.nepdate.Converter;
import io.github.aagitoex.nepdate.NepDate;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    @Test
    void performanceTest() {
        long millis = System.currentTimeMillis();
        for (Map.Entry<Integer, int[]> a : bsDaysInMonthByYear().entrySet()) {
            for (int i = 0; i < 12; i++) {
                for (int j = 1; j <= a.getValue()[i]; j++) {
                    Converter.fromBSToAD(new NepDate(a.getKey(), i + 1, j));
                }
            }
        }
        System.out.println("Time taken: " + (System.currentTimeMillis() - millis));
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    static HashMap<Integer, int[]> bsDaysInMonthByYear() {
        HashMap<Integer, int[]> bsDaysInMonthByYear = new HashMap<>();
        bsDaysInMonthByYear.put(1975, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1976, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(1977, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 365});
        bsDaysInMonthByYear.put(1978, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1979, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1980, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(1981, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1982, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1983, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1984, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(1985, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1986, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1987, new int[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1988, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(1989, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1990, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1991, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1992, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 366});
        bsDaysInMonthByYear.put(1993, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1994, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1995, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1996, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 366});
        bsDaysInMonthByYear.put(1997, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1998, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(1999, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2000, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 365});
        bsDaysInMonthByYear.put(2001, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2002, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2003, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2004, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 30, 29, 29, 31, 365});
        bsDaysInMonthByYear.put(2005, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2006, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2007, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2008, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31, 365});
        bsDaysInMonthByYear.put(2009, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2010, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2011, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2012, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2013, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2014, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2015, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2016, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2017, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2018, new int[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2019, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 366});
        bsDaysInMonthByYear.put(2020, new int[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2021, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2022, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2023, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 366});
        bsDaysInMonthByYear.put(2024, new int[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2025, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2026, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2027, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 365});
        bsDaysInMonthByYear.put(2028, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2029, new int[]{31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2030, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2031, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 365});
        bsDaysInMonthByYear.put(2032, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2033, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2034, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2035, new int[]{30, 32, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31, 365});
        bsDaysInMonthByYear.put(2036, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2037, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2038, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2039, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2040, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2041, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2042, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2043, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2044, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2045, new int[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2046, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2047, new int[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2048, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2049, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2050, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 366});
        bsDaysInMonthByYear.put(2051, new int[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2052, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2053, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2054, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 366});
        bsDaysInMonthByYear.put(2055, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2056, new int[]{31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2057, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2058, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 365});
        bsDaysInMonthByYear.put(2059, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2060, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2061, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2062, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31, 365});
        bsDaysInMonthByYear.put(2063, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2064, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2065, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2066, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31, 365});
        bsDaysInMonthByYear.put(2067, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2068, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2069, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2070, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2071, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2072, new int[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2073, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31, 366});
        bsDaysInMonthByYear.put(2074, new int[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2075, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2076, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2077, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 366});
        bsDaysInMonthByYear.put(2078, new int[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2079, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2080, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30, 365});
        bsDaysInMonthByYear.put(2081, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31, 366});
        bsDaysInMonthByYear.put(2082, new int[]{31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30, 365});
        bsDaysInMonthByYear.put(2083, new int[]{31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30, 365});
        bsDaysInMonthByYear.put(2084, new int[]{31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30, 365});
        bsDaysInMonthByYear.put(2085, new int[]{31, 32, 31, 32, 30, 31, 30, 30, 29, 30, 30, 30, 366});
        bsDaysInMonthByYear.put(2086, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30, 365});
        bsDaysInMonthByYear.put(2087, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 30, 30, 30, 366});
        bsDaysInMonthByYear.put(2088, new int[]{30, 31, 32, 32, 30, 31, 30, 30, 29, 30, 30, 30, 365});
        bsDaysInMonthByYear.put(2089, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30, 365});
        bsDaysInMonthByYear.put(2090, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30, 365});
        bsDaysInMonthByYear.put(2091, new int[]{31, 31, 32, 31, 31, 31, 30, 30, 29, 30, 30, 30, 366});
        bsDaysInMonthByYear.put(2092, new int[]{30, 31, 32, 32, 31, 30, 30, 30, 29, 30, 30, 30, 365});
        bsDaysInMonthByYear.put(2093, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30, 365});
        bsDaysInMonthByYear.put(2094, new int[]{31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30, 365});
        bsDaysInMonthByYear.put(2095, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 30, 30, 30, 366});
        bsDaysInMonthByYear.put(2096, new int[]{30, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 364});
        bsDaysInMonthByYear.put(2097, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30, 366});
        bsDaysInMonthByYear.put(2098, new int[]{31, 31, 32, 31, 31, 31, 29, 30, 29, 30, 29, 31, 365});
        bsDaysInMonthByYear.put(2099, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 29, 30, 30, 30, 365});
        bsDaysInMonthByYear.put(2100, new int[]{31, 32, 31, 32, 30, 31, 30, 29, 30, 29, 30, 30, 365});
        return bsDaysInMonthByYear;
    }

}