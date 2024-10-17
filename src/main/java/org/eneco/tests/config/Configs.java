package org.eneco.tests.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configs {

    private static final Properties properties = new Properties();

    public Configs() {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath() + "testConfigs.properties";
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(rootPath);
            properties.load(fileInputStream);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getProperty(String property) {
        return properties.getProperty(property);
    }

}
