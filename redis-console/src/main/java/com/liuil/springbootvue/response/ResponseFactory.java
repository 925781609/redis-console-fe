package com.liuil.springbootvue.response;

public class ResponseFactory {

  public static Response buildSuccessResponse(Object data) {
    return buildResponse(ResponseCode.SUCCESS, "success", data);
  }

  public static Response buildFailResponse(String message) {
    return buildResponse(ResponseCode.FAIL, message, null);
  }

  public static Response buildResponse(ResponseCode code, String message, Object data) {
    return buildResponse(code.code, message, data);
  }

  public static Response buildResponse(int code, String message, Object data) {
    return new Response(code, message, data);
  }
}
