package its.already.cool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/exit")
    public String Exit(){
        return "second/exit";
    }
}
