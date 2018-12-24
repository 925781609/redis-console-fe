package com.liuil.springbootvue.pojo.vo;

import javax.validation.constraints.NotNull;

public class RedisCommandVo {

  @NotNull(message = "命令不允许为空")
  private String command;

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }
}
