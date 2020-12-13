package cc.insistor.t.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cc")
public class test {
    @RequestMapping ("/te")
    public String te(){
        return "cc";
    }


}
