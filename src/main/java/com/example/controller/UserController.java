package com.example.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

  @GetMapping("/register")
  public String showForm() {
  return "user/register";
  }

  @PostMapping("/register")
  public String submitForm(
  @RequestParam("name") String name,
  @RequestParam("email") String email,
  @RequestParam("password") String password,
  Model model) {

  // name属性に対応した値が受け取れることを確認
  System.out.println("name = " + name);
  System.out.println("email = " + email);
  System.out.println("password = " + password);

  model.addAttribute("name", name);
  model.addAttribute("email", email);
  model.addAttribute("password", password);
  return "user/result";
  }
}