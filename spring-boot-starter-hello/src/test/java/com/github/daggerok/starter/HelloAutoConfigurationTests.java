package com.github.daggerok.starter;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.rule.OutputCapture;

//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = HelloAutoConfiguration.class,
//    webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class HelloAutoConfigurationTests {

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Rule
  public OutputCapture outputCapture = new OutputCapture();

  @Test
  public void contextLoads() { }
}
