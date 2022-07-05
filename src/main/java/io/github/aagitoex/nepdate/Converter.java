package io.github.aagitoex.nepdate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Converter {

    public static NepDate fromADToBS(LocalDate date) {
        LocalDate gLow = LocalDate.of(Constants.adLBoundY, Constants.adLBoundM, Constants.adLBoundD);
        long daysElapsed = ChronoUnit.DAYS.between(gLow, date);

        return Converter.nepDateFromDayElapsed(daysElapsed);
    }

    public static LocalDate fromBSToAD(NepDate date) {
        LocalDate glow = LocalDate.of(Constants.adLBoundY, Constants.adLBoundM, Constants.adLBoundD);
        long totalDiff = 0L;
        //count days in year
        for (int i = Constants.bsLBoundY; i < date.getYear(); i++) {
            totalDiff += Constants.bsDaysInMonthByYear().get(i)[12];
        }

        //count days in month
        for (int i = 0; i < date.getMonth() - 1; i++) {
            totalDiff += Constants.bsDaysInMonthByYear().get(date.getYear())[i];
        }

        //add remaining days
        totalDiff += date.getDay() - 1;
        return glow.plusDays(totalDiff);
    }

    private static NepDate nepDateFromDayElapsed(long daysElapsed) {
        long elapsed = daysElapsed;

        //loop bsLBoundY to bsUBoundY
        for (int i = Constants.bsLBoundY; i <= Constants.bsUBoundY; i++) {
            int[] year = Constants.bsDaysInMonthByYear().get(i);

            if (year[12] <= elapsed) {
                elapsed -= year[12];
                continue;
            }

            for (int j = 1; j <= 12; j++) {
                if (year[j - 1] <= elapsed) {
                    elapsed -= year[j - 1];
                    continue;
                }
                return new NepDate(i, j, (int) elapsed + 1);
            }
        }
        return null;
    }
}
