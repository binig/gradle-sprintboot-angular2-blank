package org.bin2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({
        "classpath:/security-context.xml"

})
public class ExampleApplication {

    @Bean
    public Gson buildGson() {
        return new GsonBuilder().setPrettyPrinting().create();
    }

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}
