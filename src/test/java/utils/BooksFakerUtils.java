
package utils;

import com.github.javafaker.Faker;

public class BooksFakerUtils {
    private static final Faker faker = new Faker();

    public static String bookTitle() { return faker.book().title(); }
    public static String bookDesc() { return faker.lorem().sentence(); }
    public static String isbn() { return faker.code().isbn13(); }
    public static double price() { return faker.number().randomDouble(2, 1, 100); }
    public static String publishDate() { return faker.date().birthday().toInstant().toString(); }
}
