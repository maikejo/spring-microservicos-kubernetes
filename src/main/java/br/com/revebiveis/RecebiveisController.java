package br.com.revebiveis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recebiveis")
public class RecebiveisController {

    @Autowired
    RecebiveisService lazyService;

    @GetMapping
    public String hello() {
        return lazyService.hello();
    }
}
