package com.liuil.springbootvue.Controller;

import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 返回给前端的相应要求前端设置cookie
 */

@RestController
public class CookieController {

  @GetMapping("/api/cookie/add")
  public String addcookie(Map<String, Object> model, HttpServletRequest request,
      HttpServletResponse response) throws Exception {
    Cookie cookie = new Cookie("username", "liuil");
    cookie.setPath("/");
    cookie.setMaxAge(100);
    response.addCookie(cookie);

    return "/api/cookie/add";
    
  }
  @GetMapping("/api/cookie/clear")
  public String clearCookie(Map<String, Object> model, HttpServletRequest request,
      HttpServletResponse response) throws Exception {
    Cookie cookie = new Cookie("username", "");
    cookie.setPath("/");
    cookie.setMaxAge(0);
    response.addCookie(cookie);

    return "/api/cookie/clear";

  }

}
