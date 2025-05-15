package payloads;

import com.github.javafaker.Faker;
import pojo.Author;


public class AuthorPayload {
    public static final Faker faker = new Faker();

    public static Author authorPayload() {
        Integer idBook = faker.number().numberBetween(1, 99999);
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        return new Author(idBook, firstName, lastName);
    }
}