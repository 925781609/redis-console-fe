package com.liuil.springbootvue.response;

public enum ResponseCode {
  /**
   * 成功
   */
  SUCCESS(200),

  /**
   * 失败
   */
  FAIL(400),

  /**
   * 未授权
   */
  UNAUTHORIZED(401),

  /**
   * 无权限
   */
  NO_PERMISSION(403),

  /**
   * 接口不存在
   */
  NOT_FOUND(404),

  /**
   * 内部错误
   */
  INTERNAL_ERROR(500);

  public int code;

  ResponseCode(int code) {
    this.code = code;
  }

}
