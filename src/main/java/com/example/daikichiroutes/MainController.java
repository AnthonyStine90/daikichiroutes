package com.example.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
//lets you set all routes to /daikichi/today, /daikichi/tomorrow
//prevents repeating
public class MainController {
  
  @RequestMapping("") 
  public String index() {
    return "Welcome";
    // return "<h1>Welcome</h1><a href=/"/\">home</a>"
    // this will create a home button that goes back to localhost:8080, or root route
  }

  @RequestMapping("/today")
  public String today(){
    return "Today you will find luck in all your endeavors!";
  }

  @RequestMapping("/tomorrow")
  public String tomorrow(){
    return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
  }
}
