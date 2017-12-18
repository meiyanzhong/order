package com.topscore.omnichannel.order.site.metronic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "default/index";
    }

    @GetMapping("/login")
    public String login() {
        return "default/login";
    }
}
