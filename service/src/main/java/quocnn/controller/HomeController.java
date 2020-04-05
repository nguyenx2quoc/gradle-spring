package quocnn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
