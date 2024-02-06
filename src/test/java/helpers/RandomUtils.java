package helpers;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    public static final Faker faker = new Faker(new Locale("ru"));

    public static int getRandomInt(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getFullName() {

        return faker.name().fullName();
    }

    public static String getMobilePhone() {

        return faker.numerify("987#######");
    }

    public static String getRandomDay() {

        return String.format("%s", getRandomInt(10, 30));
    }

    public static String getRandomMonth() {
        return String.format("%s", getRandomInt(10, 12));
    }

    public static String getRandomYear() {

        return String.format("%s", getRandomInt(1980, 2000));
    }

    public static String getRandomEmail() {
        return faker.internet().emailAddress();
    }
}
