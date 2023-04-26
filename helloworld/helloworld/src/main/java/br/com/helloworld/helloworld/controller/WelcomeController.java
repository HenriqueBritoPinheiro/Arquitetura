package br.com.helloworld.helloworld.controller;

import br.com.helloworld.helloworld.model.Welcome;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WelcomeController {

    private final static AtomicLong counter = new AtomicLong();
    @RequestMapping("/welcome")
    public Welcome welcome(@RequestParam(name = "name", defaultValue = "Fatec Jales")
    String name,
    @RequestParam(name = "msg", defaultValue = "Welcome!")String msg){
        return new Welcome(counter.incrementAndGet(), name,msg);
    }
}
