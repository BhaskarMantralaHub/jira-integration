package com.bhaskarmantralahub.jiraintegration;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class YamlParser {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Before updating " + new YamlParser().read().get("LAST_UPDATED_AT"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        ZoneId zone = ZoneId.of("America/Denver");
        ZonedDateTime date = ZonedDateTime.now(zone);
        String currentTimestamp = date.format(formatter);

        Map<String, String> response = new YamlParser().write("LAST_UPDATED_AT", currentTimestamp);
        System.out.println("After Updating: " + response.get("LAST_UPDATED_AT"));
    }


    public Map<String, String> read() {
        Yaml yaml = new Yaml();
        Map<String, String> response;
        try {
            FileInputStream resourceAsStream = new FileInputStream("src/main/resources/jira-log.yaml");
            response = yaml.load(resourceAsStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return response;
    }

    public Map<String, String> write(String key, String value) {
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        Yaml yaml = new Yaml();
        Map<String, String> response;
        Map<String, String> read = this.read();
        try {
            PrintWriter writer =
                    new PrintWriter("src/main/resources/jira-log.yaml");
            read.put(key, value);
            yaml.dump(read, writer);

            response = this.read();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return response;
    }
}
