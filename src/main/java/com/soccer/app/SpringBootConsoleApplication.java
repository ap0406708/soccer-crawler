package com.soccer.app;

import static java.lang.System.exit;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan("com.soccer")
@Configuration

@EntityScan("com.soccer.model")
@PropertySource("classpath:application.properties")

@EnableJpaRepositories(basePackages = {"com.soccer.dao"})
@EnableAutoConfiguration
@EnableTransactionManagement
@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

    public static void main(String[] args) throws Exception {

        //disabled banner, don't want to see the spring logo
        SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

        //SpringApplication.run(SpringBootConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        if (args.length > 0 ) {
            System.out.println(args[0].toString());
        }else{
            System.out.println("null args");
        }

        exit(0);
    }
}
