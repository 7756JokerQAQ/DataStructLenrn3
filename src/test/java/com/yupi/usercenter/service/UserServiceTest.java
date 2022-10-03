package com.yupi.usercenter.service;

import com.yupi.usercenter.model.domain.request.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceTest {
  @Resource
  private UserService userService;

  @Test
  public void textAddUser() {
    User user = new User();
    user.setUsername("dogYupi");
    user.setUserAccount("123");
    user.setAvatarUrl("https://img0.baidu.com/it/u=922902802,2128943538&fm=253&app=120&size=w931&n=0&f=JPEG&fmt=auto?sec=1664470800&t=01a263f049f28f62dd3c62ab288cbc80");
    user.setGender(0);
    user.setUserPassword("123");
    user.setEmail("123");
    user.setPhone("456");


    boolean result = userService.save(user);
    System.out.println(user.getId());
    Assertions.assertTrue(result);
  }

/*
  @Test
  void userRegister() {
    //测试密码为空
    String userAccount;
    String userPassword;
    String checkPassword;
    userAccount="yupi";
    userPassword="";
    checkPassword = "123456";
    long result=userService.userRegister(userAccount,userPassword,checkPassword);
    Assertions.assertEquals(-1,result);
    //测试账号长度小于四
    userAccount="yu";
    result=userService.userRegister(userAccount,userPassword,checkPassword);
    Assertions.assertEquals(-1,result);
    //测试密码长度小于八位
    userAccount="yupi";
    userPassword="123456";
    result=userService.userRegister(userAccount,userPassword,checkPassword);
    Assertions.assertEquals(-1,result);

    //测试名称里含有非法的空格
    userAccount="yu pi";
    userPassword="12345678";
    checkPassword="12345678";
   result=userService.userRegister(userAccount,userPassword,checkPassword);
    Assertions.assertEquals(-1,result);
  //二此重复密码不同
    checkPassword="123456789";
    result=userService.userRegister(userAccount,userPassword,checkPassword);
    Assertions.assertEquals(-1,result);

    userAccount = "dogyupi";
    checkPassword = "12345678";
    result = userService.userRegister(userAccount, userPassword, checkPassword);
    Assertions.assertEquals(-1, result);

    userAccount = "yupi";
    result = userService.userRegister(userAccount, userPassword, checkPassword);
    Assertions.assertTrue(result > 0);

  }
}
*/

  @Test
  void userRegister() {
    String userAccount ="yupi";
    String userPassword = "";
    String checkPassword = "123456";
    String planetCode="1";
    long result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
    Assertions.assertEquals(-1, result);

    userAccount = "yu";
    result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
    Assertions.assertEquals(-1, result);

    userAccount = "yupi";
    userPassword = "123456";
    result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
    Assertions.assertEquals(-1, result);

    userAccount = "yu pi";
    userPassword = "12345678";
    result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
    Assertions.assertEquals(-1, result);

    checkPassword = "123456789";
    result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
    Assertions.assertEquals(-1, result);

    userAccount = "dogyupi";
    checkPassword = "12345678";
    result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
    Assertions.assertEquals(-1, result);
    userAccount = "yupi";
    result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
    Assertions.assertTrue(result > 0);
  }


}