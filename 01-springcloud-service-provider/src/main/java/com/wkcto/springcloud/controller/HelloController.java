package com.wkcto.springcloud.controller;

import com.wkcto.springcloud.model.User;
import org.springframework.web.bind.annotation.*;

@RestController // 等价于 @Controller + @ResponseBody
public class HelloController {

    //@RequestMapping("/service/hello")
    @GetMapping("/service/hello")
    public String hello() {

        /*try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //进行业务处理（省略）
        System.out.println("服务提供者1。。。。。。。");
        return "Hello, Spring Cloud，Provider 1";
    }

    @RequestMapping("/service/user")
    public User user() {

        //进行业务处理（省略）
        System.out.println("服务提供者1。。。。。。。");

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
        System.out.println("服务提供者1。。。。。。。");

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
        System.out.println("服务提供者1。。。。。。。");

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
        System.out.println("服务提供者。。。。。。。" + id + "--" + name + "--" + phone);

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
        System.out.println("服务提供者1。。。。。。。" + id + "--" + name + "--" + phone);

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);

        // http://xxx.xxx.xxx:9090/api/user/1 --查询、删除
        //RequestMappring(value="/api/user/{id}", method=RequestMethod.GET) --调用查询功能
        //RequestMappring(value="/api/user/{id}", method=RequestMethod.DELETE) --调用删除功能

        //将user对象插入数据库（暂时省略）
        return user;
    }
}