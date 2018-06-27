package com.github.daggerok.starter;

import com.github.daggerok.hello.HelloService;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

//tag::content[]
public class HelloStarterAutoConfigurationTests {

  private ConfigurableApplicationContext context;

  public static class MyEnvironmentTestUtils {
    public static void addEnvironment(final ConfigurableApplicationContext context, final String... pairs) {
      TestPropertyValues.of(pairs).applyTo(context);
    }
  }

  private void load(Class<?> config, String... environment) {
    final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(config);
    MyEnvironmentTestUtils.addEnvironment(ctx, environment);
    ctx.refresh();
    this.context = ctx;
  }

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Rule
  public OutputCapture output = new OutputCapture();

  @After
  public void closeContext() {
    Optional.ofNullable(context)
            .ifPresent(ConfigurableApplicationContext::close);
  }

  @Configuration
  @ImportAutoConfiguration(HelloStarterAutoConfiguration.class)
  static class EmptyConfiguration { }

  @Test
  public void serviceBeanWithEmptyContextIsAutoConfigured() {
    load(EmptyConfiguration.class);
    assertThat(context.getBeansOfType(HelloService.class)).hasSize(1);
  }
}
//end::content[]
