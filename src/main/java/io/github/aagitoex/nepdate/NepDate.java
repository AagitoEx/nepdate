package io.github.aagitoex.nepdate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Objects;

public class NepDate implements Comparable<NepDate> {

    private final Integer year;
    private final Integer month;
    private final Integer day;

    public NepDate(Integer year, Integer month, Integer day) {
        int[] tmpYear = Constants.bsDaysInMonthByYear().get(year);
        if (tmpYear == null) throw new IndexOutOfBoundsException("Invalid year");
        if (month < 1 || month > 12) {
            throw new IndexOutOfBoundsException("Invalid month.");
        }
        if (day < 1 || day > tmpYear[month - 1]) {
            throw new IndexOutOfBoundsException("Invalid day in a month");
        }

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static final NepDate MIN = new NepDate(Constants.bsLBoundY, Constants.bsLBoundM, Constants.bsLBoundD);
    public static final NepDate MAX = new NepDate(Constants.bsUBoundY, Constants.bsUBoundM, Constants.bsUBoundD);

    public static NepDate now() {
        return Converter.fromADToBS(LocalDate.now());
    }

    public static int getDaysInMonth(int year, int month) {
        int[] tmpYear = Constants.bsDaysInMonthByYear().get(year);
        if (tmpYear == null) throw new IndexOutOfBoundsException("Invalid year");
        if (month < 1 || month > 12) {
            throw new IndexOutOfBoundsException("Invalid month.");
        }
        return tmpYear[month - 1];
    }

    public static int getDaysInYear(int year) {
        int[] tmpYear = Constants.bsDaysInMonthByYear().get(year);
        if (tmpYear == null) throw new IndexOutOfBoundsException("Invalid year");
        return tmpYear[12];
    }

    public LocalDate getAD() {
        return Converter.fromBSToAD(this);
    }

    public NepDate plusDays(int days) {
        int year = this.year;
        int month = this.month;
        int day = this.day;

        int newDays = day + days;

        boolean propagate = true;
        while (propagate) {
            int[] tmpYear = Constants.bsDaysInMonthByYear().get(year);
            if (tmpYear == null) throw new IndexOutOfBoundsException("Invalid year");

            if (month > 12) {
                year++;
                month = 1;
                continue;
            }

            if (month < 1) {
                year--;
                month = 12;
                continue;
            }

            if (newDays > tmpYear[month - 1]) {
                newDays -= tmpYear[month - 1];
                month++;
                continue;
            }

            if (newDays < 1) {
                newDays += tmpYear[month - 1];
                month--;
                continue;
            }

            propagate = false;
        }
        return new NepDate(year, month, newDays);
    }

    public NepDate plusMonths(int months) {
        int year = this.year;
        int month = this.month;
        int day = this.day;

        int newMonth = month + months;
        while (newMonth > 12) {
            newMonth -= 12;
            year++;
        }
        while (newMonth < 1) {
            newMonth += 12;
            year--;
        }

        int[] yearM = Constants.bsDaysInMonthByYear().get(year);

        if (day > yearM[newMonth - 1]) {
            day = yearM[newMonth - 1];
        }

        return new NepDate(year, newMonth, day);
    }

    public NepDate plusYears(int years) {
        return new NepDate(this.year + years, this.month, this.day);
    }

    public long daysBetween(NepDate other) {
        LocalDate ad1 = getAD();
        LocalDate ad2 = Converter.fromBSToAD(other);
        return ChronoUnit.DAYS.between(ad1, ad2);
    }

    public Integer getYear() {
        return year;
    }

    public Integer getMonth() {
        return month;
    }

    public String getMonthName(Locale locale) {
        if(Objects.equals(locale.getLanguage(), "ne")) {
            return monthNameNp();
        } else {
            return monthName();
        }
    }

    public Integer getDay() {
        return day;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NepDate)) {
            return false;
        } else {
            NepDate ins = (NepDate) o;
            return Objects.equals(ins.year, year) && Objects.equals(ins.month, month) && Objects.equals(ins.day, day);
        }
    }

    /**
     * format: yyyy-MM-dd
     */
    @Override
    public String toString() {
        return "" + Helpers.padLeft(year, 4) + "-" + Helpers.padLeft(month, 2) + "-" + Helpers.padLeft(day, 2);
    }

    private long dateAsLong() {
        return (long) year * 10000 + (long) month * 100 + (long) day;
    }

    @Override
    public int compareTo(NepDate o) {
        return Long.compare(this.dateAsLong(), o.dateAsLong());
    }


    //return month name from int
    private String monthName() {
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

    private String monthNameNp() {
        switch (month) {
            case 1:
                return "बैशाख";
            case 2:
                return "जेठ";
            case 3:
                return "असार";
            case 4:
                return "साउन";
            case 5:
                return "भदौ";
            case 6:
                return "असोज";
            case 7:
                return "कार्तिक";
            case 8:
                return "मंसिर";
            case 9:
                return "पौष";
            case 10:
                return "माघ";
            case 11:
                return "फागुन";
            case 12:
                return "चैत";
            default:
                return "Invalid month";
        }
    }
}
