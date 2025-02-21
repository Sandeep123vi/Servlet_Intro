package uc_1_hello;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Spring {
    @GetMapping("/hello -w ")
    public String first(String ss)
    {
        return "Hello ! I'M from BridgeLabz";
    }


}
