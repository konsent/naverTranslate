package com.konsent.navertranslate;

import com.konsent.navertranslate.utils.NaverTranslate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaAuditing
@EnableScheduling
@SpringBootApplication
public class NaverTranslateApplication {

    public static void main(String[] args) {
        SpringApplication.run(NaverTranslateApplication.class, args);
    }

}
