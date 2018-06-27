package com.github.daggerok.hello.config;

import com.github.daggerok.hello.HelloService;
import com.github.daggerok.hello.config.props.HelloProperties;
import com.github.daggerok.hello.impl.HelloServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.github.daggerok.hello.config.props.HelloProperties.Hello;

//tag::content[]
/**
 * Apply auto configuration only if {@link HelloService} class is in classpath.
 */
@Configuration
@RequiredArgsConstructor
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {

  @ConditionalOnMissingBean(HelloService.class)
  @Bean
  public HelloService helloService() {
    final HelloServiceImpl helloService = new HelloServiceImpl(null, null);
    return helloService;
  }
}
//end::content[]
