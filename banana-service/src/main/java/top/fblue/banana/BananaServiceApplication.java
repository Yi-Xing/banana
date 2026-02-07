package top.fblue.banana;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableDubbo
@SpringBootApplication
@ComponentScan(basePackages = {"top.fblue.framework"})
public class BananaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BananaServiceApplication.class, args);
    }

}
