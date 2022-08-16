package collections;

import org.asynchttpclient.handler.resumable.PropertiesBasedResumableProcessor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ExamplePropertiesClass {
    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("C:\\Users\\Sagar\\Desktop\\New folder (5)\\MornigBatch.properties");
        Properties properties = new Properties();
        properties.load(file);

        System.out.println(properties.getProperty("Student"));
        System.out.println(properties.getProperty("Institute"));
    }
}
