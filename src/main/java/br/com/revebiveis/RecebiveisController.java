package br.com.revebiveis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recebiveis")
public class RecebiveisController {

    @Autowired
    RecebiveisService service;

    @GetMapping
    public String ola() {
        return service.ola();
    }
}
