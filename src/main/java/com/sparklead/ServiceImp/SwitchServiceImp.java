package com.sparklead.ServiceImp;

import com.sparklead.Service.SwitchService;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SwitchServiceImp implements SwitchService {

    @Override
    public String switchDispenser(String message) {

        String url = "http://localhost:8000/petSync/raspberry/onOff";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> requestEntity = new HttpEntity<>(message, headers);

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                String.class
        );
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        } else {
            return responseEntity.getStatusCode().toString();
        }
    }
}
