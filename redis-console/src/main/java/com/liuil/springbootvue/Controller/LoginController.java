package com.liuil.springbootvue.Controller;


import com.liuil.springbootvue.pojo.vo.LoginInfoVo;
import com.liuil.springbootvue.response.Response;
import com.liuil.springbootvue.response.ResponseFactory;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
public class LoginController {

  @PostMapping(path = "/api/login")
  public Response login(@Valid @RequestBody LoginInfoVo loginInfoVo, BindingResult bindingResult) {
    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder

        .getRequestAttributes()).getRequest();

    System.out.println("login essionId:" + request.getSession().getId());
    if (bindingResult.hasErrors()) {
      String message = String
          .format("登录失败，详细信息[%s]", bindingResult.getFieldError().getDefaultMessage());
    }
    if ("user".equals(loginInfoVo.getUsername()) && "123456".equals(loginInfoVo.getPassword())) {
      return ResponseFactory.buildResponse(200, "success", 123456);
    } else {
      String message = String.format("登录失败，详细信息[用户名、密码信息不正确]");
      return ResponseFactory.buildFailResponse(message);
    }
  }

}
