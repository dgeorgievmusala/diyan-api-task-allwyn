package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AuthorConfigReader {

    Properties properties;


    public static final String AUTHOR_FILE_PATH = "author.properties";

    public AuthorConfigReader() {
        properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(AUTHOR_FILE_PATH)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load author.properties file");
        }
    }

    public String getStringAuthorProperty(String key) {
        return properties.getProperty(key);
    }

    public int getIntAuthorProperty(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }
}
