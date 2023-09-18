package generator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDate {
    private static final long minDay = LocalDate.of(2020,9,17).toEpochDay();
    private static final long maxDay = LocalDate.now().toEpochDay();

    public static LocalDate getRandomPlacedOrderDate() {
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        return LocalDate.ofEpochDay(randomDay);
    }

}
