package com.github.daggerok.hello.impl;

import com.github.daggerok.hello.HelloService;
import lombok.RequiredArgsConstructor;

import static java.lang.String.format;

//tag::content[]
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {

  final String prefix;
  final String suffix;

  @Override
  public String sayHello(String whom) {
    return format("%s %s%s", prefix.trim(), whom, suffix.trim());
  }
}
//end::content[]
