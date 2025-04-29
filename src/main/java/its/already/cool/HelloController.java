package its.already.cool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/porno")
    public String sayHello(){
        return "hello_world";
    }
}
