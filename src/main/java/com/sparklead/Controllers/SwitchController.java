package com.sparklead.Controllers;

import com.sparklead.Payload.OnOffResponse;
import com.sparklead.Service.SwitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/petSync")
public class SwitchController {

    @Autowired
    private SwitchService switchService;

    @PostMapping("/onOff")
    public OnOffResponse onOffDispenser(@RequestBody String message) {
        return switchService.switchDispenser(message);
    }

}