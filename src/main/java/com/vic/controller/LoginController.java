package com.vic.controller;

import com.vic.model.UserEntity;
import com.vic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by victor on 24/06/2017.
 */
@Controller
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "/login";
    }

    @RequestMapping(value = "/loginG", method = RequestMethod.GET)
    public String loginG(@RequestParam("username") String username,
                        @RequestParam("password") String password) {
        UserEntity user = userRepository.findByUsername(username);
        if (user == null)
            return "/loginfail";
        else if (!user.getPassword().equals(password))
            return "/loginfail";
        else
            return "/loginsuccess";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signUp() {
        return "/addUser";
    }

    @RequestMapping(value = "/signupP", method = RequestMethod.POST)
    public String signUPP(@ModelAttribute("user") UserEntity userEntity) {
        userRepository.saveAndFlush(userEntity);
        return "/loginsuccess";
    }


}
