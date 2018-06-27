//package com.github.daggerok.application.cli;
//
//import com.github.daggerok.api.HelloService;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Log4j2
//@Component
//public class CliRunner implements CommandLineRunner {
//
//  final HelloService helloService;
//
//  public CliRunner(HelloService helloService) {
//    this.helloService = helloService;
//  }
//
//  @Override
//  public void run(String... args) throws Exception {
//    log.info("helloService.sayHi maksimko: {}", () -> helloService.sayHi("maksimko"));
//  }
//}
