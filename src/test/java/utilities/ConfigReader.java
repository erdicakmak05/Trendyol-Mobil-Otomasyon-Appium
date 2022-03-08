package utilities;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class ConfigReader {
    //configuration properties file daki datalari okumamizi sagliyor
    private static Properties properties;
    static {
        String path = "configuration.properties";
        try{
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(new InputStreamReader(file, StandardCharsets.UTF_8));
        }catch (Exception e){
            System.out.println("Configuration file bulunamadi.");
        }
    }
    //will return value from config
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}