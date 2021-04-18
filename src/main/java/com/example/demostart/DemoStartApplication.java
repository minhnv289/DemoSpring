package com.example.demostart;

import com.example.demostart.dao.CustomerDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = CustomerDAO.class)
public class DemoStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoStartApplication.class, args);
    }

}
