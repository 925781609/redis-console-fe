package com.liuil.springbootvue.Controller;

import com.liuil.springbootvue.response.Response;
import com.liuil.springbootvue.response.ResponseFactory;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
public class TestController {

  @GetMapping(path = "/test")
  public Response test() {

    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder

        .getRequestAttributes()).getRequest();

    System.out.println("login essionId:" + request.getSession().getId());
    return ResponseFactory.buildResponse(200, "success", "Hello world!");
  }
}
