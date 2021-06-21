package homework_solution.lesson5.task5;

import java.util.HashSet;
import java.util.regex.Pattern;

public class Passport {
    private static HashSet<Passport> passportsBase = new HashSet<>();
    private String series;
    private String number;

    public Passport(String series, String number) throws PassportIllegalArgumentException, NullPointerException, PassportAlreadyExistsException {
        System.out.printf("Получены значения %s %s\n", series, number);
        if (series == null) {
            throw new PassportSeriesNullPointerExceptions();
        }
        if (Pattern.compile("^\\d\\d \\d\\d$").matcher(series).find()) {
            this.series = series;
        } else {
            throw new PassportSeriesArgumentException();
        }
        if (number == null) {
            throw new PassportNumberNullPointerExceptions();
        }
        if (Pattern.compile("^\\d{6}$").matcher(number).find()) {
            this.number = number;
        } else {
            throw new PassportNumberArgumentException();
        }
        boolean added;
        added = passportsBase.add(this);
        if (!added) {
            throw new PassportAlreadyExistsException();
        }
    }

    @Override
    public boolean equals(Object obj) {
        Passport passport = (Passport) obj;
        if (passport.number.equals(this.number) && passport.series.equals(this.series)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return series.hashCode() + number.hashCode();
    }
}
