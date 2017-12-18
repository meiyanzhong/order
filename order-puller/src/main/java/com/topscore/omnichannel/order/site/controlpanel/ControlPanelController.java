package com.topscore.omnichannel.order.site.controlpanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control-panel")
public class ControlPanelController {

    @Autowired
    private OrderMessageRepository repository;

    @GetMapping
    public String index() {
        return "controlpanel/index";
    }
}
