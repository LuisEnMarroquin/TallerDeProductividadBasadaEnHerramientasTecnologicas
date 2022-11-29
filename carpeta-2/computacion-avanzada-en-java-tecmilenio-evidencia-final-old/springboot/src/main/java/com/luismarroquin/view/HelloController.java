package com.luismarroquin.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

  @GetMapping({ "/", "/hello" })
  public String hello(Model model,
      @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
    model.addAttribute("name", name);
    return "hello";
  }

  @GetMapping({ "/signIn" })
  public String signIn(Model model) {
    return "signIn";
  }

  @GetMapping({ "/signUp" })
  public String signUp(Model model) {
    return "signUp";
  }

}
