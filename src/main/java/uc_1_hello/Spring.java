package uc_1_hello;

import ch.qos.logback.classic.Level;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.fasterxml.jackson.core.JsonPointer.valueOf;

@RestController
public class Spring {
    @GetMapping("/hello")
    public String first(String ss)
    {
        return "Hello From BridgeLabz";
    }

    @GetMapping("/hello/query")
    public String  second(@RequestParam("name") String mark)
    {
        return "Hello "  + mark+" From Brifgelabz";
    }
    @GetMapping("/hello/param{name}")
    public String pathVariable(@PathVariable("name") String name)
    {
        return "Hello "+ name + " From BridgeLabz";
    }
}
