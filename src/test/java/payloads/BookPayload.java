package payloads;

import com.github.javafaker.Faker;
import pojo.Book;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class BookPayload {
    private static final Faker faker = new Faker();
    private static final DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    public static Book bookPayload() {
        String title = faker.book().title();
        String description = faker.lorem().sentence();
        int pageCount = faker.number().numberBetween(50, 1000);
        String excerpt = faker.lorem().paragraph();


        String publishDate = faker.date().birthday()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .format(isoFormatter);

        return new Book(title, description, pageCount, excerpt, publishDate);
    }
}
