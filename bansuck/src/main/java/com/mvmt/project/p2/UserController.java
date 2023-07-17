package com.mvmt.project.p2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * Get user view main
     * @return
     */
    @GetMapping("/main")
    public String getUserMain() {
        
        
        return "userView";
    }
    
}
