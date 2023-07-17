package com.mvmt.project.p2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvmt.project.p2.dto.UserDto;

@Controller
@RequestMapping("/api")
public class UserApiController {

    @Autowired
    private PasswordEncoder passwordEncode;
    
    @PostMapping("/user/signup")
    public void getUserSignup(UserDto userDto) {

        String encodePwd = userDto.getUserPwd();
        encodePwd = passwordEncode.encode(encodePwd);
        
        System.out.println(" 패스워드 암호화 완료 :: " + encodePwd);
        
        // System.out.println(userDto);
        // service db
        
    }
    
}
