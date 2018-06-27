package com.github.daggerok.hello.config.props;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@Accessors(chain = true)
@ConfigurationProperties("com.github.daggerok")
public class HelloProperties {

  Hello hello = new Hello();

  @Data
  @NoArgsConstructor
  @Accessors(chain = true)
  public static class Hello {
    String prefix = "Hello, ", suffix = "!";
  }
}
