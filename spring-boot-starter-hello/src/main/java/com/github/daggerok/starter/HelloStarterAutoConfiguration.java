package com.github.daggerok.starter;

import com.github.daggerok.hello.config.HelloServiceAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

//tag::content[]
@ConditionalOnClass(HelloServiceAutoConfiguration.class)
@ImportAutoConfiguration({ HelloServiceAutoConfiguration.class })
@Configuration
public class HelloStarterAutoConfiguration { }
//end::content[]
