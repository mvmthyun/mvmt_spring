package com.mvmt.project.p2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class UserApiController {

    @PostMapping("/user/signup")
    public void getUserSignup() {
        
    }
    
}
