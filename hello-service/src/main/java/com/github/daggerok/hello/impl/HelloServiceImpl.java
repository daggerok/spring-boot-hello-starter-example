package com.github.daggerok.hello.impl;

import com.github.daggerok.hello.HelloService;

import static java.lang.String.format;

//tag::content[]
public class HelloServiceImpl implements HelloService {

  @Override
  public String sayHello(String whom) {
    return format("Hello, %s!", whom);
  }
}
//end::content[]
