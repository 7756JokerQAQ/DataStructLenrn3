package com.yupi.usercenter.model.domain.request;


//如果说要使用json格式的参数的话，我们最好封装一个对象来记录所有的请求参数，
// 然后我们在request包下新增一个对象叫UserRegisterRequest

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 */
//这里打上Data注解属于lombok包里面的 用于生成get和set方法
@Data
public class UserRegisterRequest implements Serializable {
    //生成序列化的ID 用于与前端的页面的交互
    private static final long serialVersionUID = 3191241716373120793L;
    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;
}
