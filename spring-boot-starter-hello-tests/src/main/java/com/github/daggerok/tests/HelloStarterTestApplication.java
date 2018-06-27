package com.github.daggerok.tests;

import com.github.daggerok.hello.HelloService;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//tag::content[]
@Log4j2
@SpringBootApplication
public class HelloStarterTestApplication {
  public static void main(String[] args) {
    final ConfigurableApplicationContext context = SpringApplication.run(HelloStarterTestApplication.class, args);
    final HelloService helloService = context.getBean(HelloService.class);
    log.info(() -> helloService.sayHello("ololo-trololo"));
  }
}
//end::content[]
