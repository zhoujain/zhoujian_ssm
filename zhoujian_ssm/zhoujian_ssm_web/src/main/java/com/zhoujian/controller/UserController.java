package com.zhoujian.controller;

import com.zhoujian.service.IUserService;
import com.zhoujian.ssm1.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;


    @RequestMapping("/register.do")
    public ModelAndView register(User user) throws Exception{
        ModelAndView mv = new ModelAndView();
        Integer isRegister = userService.save(user);
        if(isRegister ==1){
            mv.addObject("username",user.getUsername());
            mv.setViewName("index1");
        }else {
            mv.setViewName("index");
        }

        return  mv;
    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll()throws Exception{
        ModelAndView mv = new ModelAndView();
        List<User> userList = userService.findAll();
        mv.setViewName("/deleteAll");
        mv.addObject("userList",userList);
        return mv;
    }
    @RequestMapping("/deleteAll.do")
    @ResponseBody
    public Boolean deleteAll(@RequestBody String[] idList)throws Exception{
        Boolean temp = true;
        for(String id:idList){
            Integer isDelete = userService.deleteById(id);
            if(isDelete ==0){
                temp = false;
            }
        }
        return temp;
    }
}
