package s.ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeansController {

    @GetMapping("/")
    public String home(){
        return "Hehehehehe";
    }
}
