package com.mvmt.project.p2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvmt.project.p2.dto.UserDto;

@Controller
@RequestMapping("/api")
public class UserApiController {

    @PostMapping("/user/signup")
    public void getUserSignup(UserDto userDto) {

        // System.out.println(userDto);
        // service db
        
    }
    
}
