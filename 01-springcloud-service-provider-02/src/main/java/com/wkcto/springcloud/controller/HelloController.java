package com.wkcto.springcloud.controller;

import com.wkcto.springcloud.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/service/hello")
    public String hello() {

        //除数不能为0，会抛出一个运行时异常
        //int a = 10 / 0;

        //进行业务处理（省略）
        System.out.println("服务提供者2。。。。。。。");
        return "Hello, Spring Cloud，Provider 2";
    }

    @RequestMapping("/service/user")
    public User user() {

        //进行业务处理（省略）
        System.out.println("服务提供者2。。。。。。。");

        User user = new User();
        user.setId(108);
        user.setName("张三丰");
        user.setPhone("13800000000");

        return user;
    }

    @RequestMapping("/service/getUser")
    public User getUser(@RequestParam("id") Integer id,
                        @RequestParam("name") String name,
                        @RequestParam("phone") String phone) {

        //进行业务处理（省略）
        System.out.println("服务提供者2。。。。。。。");

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);

        return user;
    }

    //@RequestMapping(value="/service/addUser", method = RequestMethod.POST)
    @PostMapping("/service/addUser")
    public User addUser(@RequestParam("id") Integer id,
                        @RequestParam("name") String name,
                        @RequestParam("phone") String phone) {

        //进行业务处理（省略）
        System.out.println("服务提供者2。。。。。。。");

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);

        //将user对象插入数据库（暂时省略）
        return user;
    }

    //@RequestMapping(value="/service/addUser", method = RequestMethod.PUT)
    @PutMapping("/service/updateUser")
    public User updateUser(@RequestParam("id") Integer id,
                           @RequestParam("name") String name,
                           @RequestParam("phone") String phone) {

        //进行业务处理（省略）
        System.out.println("服务提供者2。。。。。。。" + id + "--" + name + "--" + phone);

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);

        //将user对象插入数据库（暂时省略）
        return user;
    }

    //@RequestMapping(value="/service/addUser", method = RequestMethod.DELETE)
    @DeleteMapping("/service/deleteUser")
    public User deleteUser(@RequestParam("id") Integer id,
                           @RequestParam("name") String name,
                           @RequestParam("phone") String phone) {

        //进行业务处理（省略）
        System.out.println("服务提供者2。。。。。。。" + id + "--" + name + "--" + phone);

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);

        //将user对象插入数据库（暂时省略）
        return user;
    }
}