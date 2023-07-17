package com.mvmt.project.p1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvmt")
public class MainController {
    
    /**
     * @return
     */
    @GetMapping("/home")
    public String getHome() {
        
        return "index";
    }

}
