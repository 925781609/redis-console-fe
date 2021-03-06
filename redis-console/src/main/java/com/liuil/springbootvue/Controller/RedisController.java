package com.liuil.springbootvue.Controller;


import com.liuil.springbootvue.pojo.vo.RedisCommandVo;
import com.liuil.springbootvue.response.Response;
import com.liuil.springbootvue.response.ResponseFactory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

  AtomicInteger count = new AtomicInteger(0);

  @PostMapping(path = "/api/command")
  public Response login(@Valid @RequestBody RedisCommandVo loginInfoVo,
      BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      String message = String
          .format("执行失败，详细信息[%s]", bindingResult.getFieldError().getDefaultMessage());
      return ResponseFactory.buildFailResponse(message);
    } else {
      count.getAndIncrement();
      System.out.println("execute is called: " + count);
      return ResponseFactory.buildSuccessResponse("Redis 执行结果" + count);
    }
  }

  @GetMapping("api/names")
  public Response names() {
    String[] value = {"redis1", "redis2", "redis3", "redis11"};
    List<String> names = Arrays.asList(value);
    return ResponseFactory.buildSuccessResponse(names);

  }

  @GetMapping("api/configs")
  public Response configs() {
    Map<String, String> map = new HashMap<String, String >();
    map.put("k11", "v11");
    map.put("k12", "v12");
    map.put("k13", "v13");
    Map<String, Object> map2 = new HashMap<String, Object>();
    map2.put("k1", map);
    map2.put("k2", "v2");
    return ResponseFactory.buildSuccessResponse(map.toString());
  }
}
