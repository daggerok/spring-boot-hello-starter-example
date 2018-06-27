package com.github.daggerok.hello.config.props;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@ConfigurationProperties("com.github.daggerok")
public class HelloProperties {

  Hello hello = new Hello();

  @Data
  @NoArgsConstructor
  @Accessors(chain = true)
  public static class Hello {
    String prefix, suffix;

    public String getPrefix() {
      return null == prefix || prefix.trim().isEmpty()
          ? "Hello," : prefix;
    }

    public String getSuffix() {
      return null == suffix || suffix.trim().isEmpty()
          ? "!" : suffix;
    }
  }
}
