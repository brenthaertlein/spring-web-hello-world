package com.nodemules.example.spring.hello.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author brent
 * @since 11/29/17.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

  private static final ObjectMapper mapper = new ObjectMapper();

  @RequestMapping("/world")
  public Map<String, String> helloWorld() {
    Map<String, String> map = new HashMap<>();
    map.put("hello", "world");
    return map;
  }

}
