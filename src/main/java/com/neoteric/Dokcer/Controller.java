package com.neoteric.Dokcer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/jenkins")
    public  void Jenkins(){
        System.out.println("jenkins");
    }
}
