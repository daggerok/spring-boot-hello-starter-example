package com.github.daggerok.hello.config;

import com.github.daggerok.hello.HelloService;
import com.github.daggerok.hello.config.props.HelloProperties;
import com.github.daggerok.hello.impl.HelloServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
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
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public HelloService helloService(final HelloProperties properties) {
    final Hello prop = properties.getHello();
    return new HelloServiceImpl(prop.getPrefix(), prop.getSuffix());
  }
}
//end::content[]
