package com.alibb.gmalluser.controller;

import com.alibb.gmall.bean.UmsMember;
import com.alibb.gmall.bean.UmsMemberReceiveAddress;
import com.alibb.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

//@RestController
//@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public String getUserInfo(){
        return "hello user ...";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @ResponseBody
    @RequestMapping("/getAllUserAddsByMemberId")                 //@RequestBody 接收是对象  @RequestParam  都可以接收 参数/对象
    public List<UmsMemberReceiveAddress> getAllUserAddsByMemberId(@RequestBody UmsMemberReceiveAddress umsMemberReceiveAddress){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getAllUserAddsByMemberId(umsMemberReceiveAddress.getMemberId());
        return umsMemberReceiveAddresses;
    }






}
