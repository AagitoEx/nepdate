import java.util.HashMap;

class Constants {
    static final int adLBoundY = 1918;
    static final int adLBoundM = 4;
    static final int adLBoundD = 13;

    static final int bsLBoundY = 1975;
    static final int bsLBoundM = 1;
    static final int bsLBoundD = 1;

    static final int bsUBoundY = 2100;
    static final int bsUBoundM = 12;
    static final int bsUBoundD = 30;

    static final int adUBoundY = 2044;
    static final int adUBoundM = 4;
    static final int adUBoundD = 12;

    //return month name from int
    static String monthName(int year, int month) {
        switch (month) {
            case 1:
                return "Baisakh";
            case 2:
                return "Jestha";
            case 3:
                return "Ashar";
            case 4:
                return "Shrawan";
            case 5:
                return "Bhadra";
            case 6:
                return "Ashoj";
            case 7:
                return "Kartik";
            case 8:
                return "Mangsir";
            case 9:
                return "Poush";
            case 10:
                return "Magh";
            case 11:
                return "Falgun";
            case 12:
                return "Chaitra";
            default:
                return "Invalid month";
        }
    }

    static HashMap<Integer, int[]> bsDaysInMonthByYear() {
        HashMap<Integer, int[]> bsDaysInMonthByYear = new HashMap<>();
        bsDaysInMonthByYear.put(bsLBoundY, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30, 365});
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
        bsDaysInMonthByYear.put(bsUBoundY, new int[]{31, 32, 31, 32, 30, 31, 30, 29, 30, 29, 30, 30, 365});
        return bsDaysInMonthByYear;
    }
}
