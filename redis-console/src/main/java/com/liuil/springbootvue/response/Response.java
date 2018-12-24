package com.liuil.springbootvue.response;

public class Response {

  /**
   * 状态码
   */
  private int code;

  /**
   * 提示信息
   */
  private String message;

  /**
   * 结果对象
   */
  private Object data;

  public Response(int code, String message, Object data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
