package com.sparklead.Service;

import com.sparklead.Payload.OnOffResponse;
import org.springframework.stereotype.Service;


public interface SwitchService {

    OnOffResponse switchDispenser(String message);

}