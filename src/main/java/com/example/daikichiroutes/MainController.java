package com.example.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
// lets you set all routes to /daikichi/today, /daikichi/tomorrow
// prevents repeating
public class MainController {

  @RequestMapping("")
  public String index() {
    return "Welcome";
    // return "<h1>Welcome</h1><a href=/"/\">home</a>"
    // this will create a home button that goes back to localhost:8080, or root
    // route
  }

  @RequestMapping("/today")
  public String today() {
    return "Today you will find luck in all your endeavors!";
  }

  @RequestMapping("/tomorrow")
  public String tomorrow() {
    return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
  }

  @RequestMapping("/travel/{city}")
  public String variables(@PathVariable("city") String city) {
    //path variables must match whatever is in { } city/city above
    return "Congratulations! You will soon travel to " + city;
  }

  @RequestMapping("/lotto/{num}")
  public String lotto(@PathVariable("num") String num) {
    if(Integer.parseInt(num) % 2 == 0){
      //Integer.parseInt(variable) converts to an integer
      //this say if the number given is even, return the statement below. if not, return the other statement
      return "You will take a grand journey in the near future, but be weary of tempting offers.";
    }
    return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
  }
}
