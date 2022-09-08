package com.hungthinh.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class Controller {
    @Autowired

    @GetMapping("test/hello")
    public String home() {
        /*RestTemplate restTemplate = new RestTemplate();
        try {
            return restTemplate.getForObject(new URI("https://localhost:9443/oauth2/jwks"), String.class);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
         */
        //Optional<UmUser> umUser = umUserRepository.findById(100);
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String response = formatter.format(new Date());
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello: " + response;
    }
}
