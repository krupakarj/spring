package jk.io.configclientspring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RefreshScope
public class Client {

    @Value("${new_year.greeting}")
    String name = "World";

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/greet")
    public String greeting() {
        System.out.println(new Date());
        return "Hello, " + name;
    }
}
