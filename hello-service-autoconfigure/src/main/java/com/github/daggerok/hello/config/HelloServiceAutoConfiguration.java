package com.github.daggerok.hello.config;

import com.github.daggerok.hello.HelloService;
import com.github.daggerok.hello.impl.HelloServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//tag::content[]
/**
 * Apply auto configuration only if {@link HelloService} class is in classpath.
 */
@ConditionalOnClass(HelloService.class)
@Configuration
public class HelloServiceAutoConfiguration {

  @Bean
  public HelloService helloService() {
    final HelloServiceImpl helloService = new HelloServiceImpl();
    return helloService;
  }
}
//end::content[]
