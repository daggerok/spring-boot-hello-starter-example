package com.github.daggerok.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloStarterTestApplication.class,
    webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class HelloStarterTestApplicationTests {

  @Test
  public void contextLoads() { }
}
