package com.sparklead;

import com.sparklead.Config.WebSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Import(WebSecurityConfig.class)
public class PetSyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetSyncApplication.class, args);
    }

}